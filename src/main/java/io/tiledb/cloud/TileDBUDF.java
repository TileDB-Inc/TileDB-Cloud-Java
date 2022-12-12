package io.tiledb.cloud;

import com.google.gson.Gson;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.UdfApi;
import io.tiledb.cloud.rest_api.model.GenericUDF;
import io.tiledb.cloud.rest_api.model.MultiArrayUDF;
import io.tiledb.cloud.rest_api.model.ResultFormat;
import io.tiledb.java.api.Pair;
import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.memory.UnsafeAllocationManager;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.ValueVector;
import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.arrow.vector.ipc.ArrowStreamReader;
import org.apache.arrow.vector.util.TransferPair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TileDBUDF {
    private TileDBClient tileDBClient;
    private String namespace;
    private UdfApi apiInstance;

    public TileDBUDF(TileDBClient tileDBClient, String namespace) {
        this.tileDBClient = tileDBClient;
        this.namespace = namespace;
        this.apiInstance = new UdfApi(this.tileDBClient.getApiClient());

    }

    /**
     * Executes a generic-UDF. A generic-UDF is a UDF that is not using a TIleDB array.
     *
     * @param genericUDF The generic UDF definition
     * @param arguments The UDF arguments
     * @return The result in String format
     */
    public String executeGeneric(GenericUDF genericUDF, HashMap<String, Object> arguments){
        String serializedArgs = serializeArgs(arguments);
        genericUDF.setArgument(serializedArgs);
        try {
            return apiInstance.submitGenericUDFString(namespace, genericUDF, "none");
        } catch (ApiException e) {
            System.err.println("Exception when calling UdfApi#submitGenericUDF");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Executes a generic-UDF. A generic-UDF is a UDF that is not using a TIleDB array.
     *
     * @param genericUDF The generic UDF definition
     * @param arguments The UDF arguments
     * @return The result as a JSON object
     */
    public JSONObject executeGenericJSON(GenericUDF genericUDF, HashMap<String, Object> arguments){
        genericUDF.setResultFormat(ResultFormat.JSON);
        String jsonString =  this.executeGeneric(genericUDF, arguments);
        return new JSONObject(jsonString);
    }

    /**
     * Executes a generic-UDF. A generic-UDF is a UDF that is not using a TIleDB array.
     *
     * @param genericUDF The generic UDF definition
     * @param arguments The UDF arguments
     * @return The result as a JSON array object
     */
    public JSONArray executeGenericJSONArray(GenericUDF genericUDF, HashMap<String, Object> arguments){
        genericUDF.setResultFormat(ResultFormat.JSON);
        String jsonString =  this.executeGeneric(genericUDF, arguments);
        return new JSONArray(jsonString);
    }

    /**
     * Executes a generic-UDF. A generic-UDF is a UDF that is not using a TIleDB array.
     *
     * @param genericUDF The generic UDF definition
     * @param arguments The UDF arguments
     * @return A pair that consists of an ArrayList of all valueVectors and the number of batches read.
     */
    public io.tiledb.java.api.Pair<ArrayList<ValueVector>, Integer> executeGenericArrow(GenericUDF genericUDF, HashMap<String, Object> arguments){
        String serializedArgs = serializeArgs(arguments);
        genericUDF.setArgument(serializedArgs);
        genericUDF.setResultFormat(ResultFormat.ARROW);
        try {
            byte[] bytes = apiInstance.submitGenericUDFBytes(namespace, genericUDF, "none");
            return TileDBUtils.createValueVectors(bytes);
        } catch (IOException | ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Executes an array-UDF. An array-UDF is a UDF applied to a TileDB array
     *
     * @param multiArrayUDF The array-UDF. Can reference one arrays
     * @param arguments The UDF arguments
     * @param arrayURI The array URI
     * @param xPayer Name of organization or user who should be charged for this request
     * @return The results as a String
     */
    public String executeSingleArray(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments, String arrayURI, String xPayer){
        String serializedArgs = serializeArgs(arguments);
        multiArrayUDF.setArgument(serializedArgs);

        String[] split = breakdownFullURI(arrayURI);

        try {
            return apiInstance.submitUDFString(split[0], split[1], multiArrayUDF, xPayer, "none", "");
        } catch (ApiException e) {
            System.err.println("Exception when calling UdfApi#submitUDF");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Executes an array-UDF. An array-UDF is a UDF applied to a TileDB array
     *
     * @param multiArrayUDF The array-UDF. Can reference one arrays
     * @param arguments The UDF arguments
     * @param arrayURI The array URI
     * @param xPayer Name of organization or user who should be charged for this request
     * @return The results as a JSON Object
     */
    public JSONObject executeSingleArrayJSON(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments, String arrayURI, String xPayer){
        multiArrayUDF.setResultFormat(ResultFormat.JSON);
        String jsonString = this.executeSingleArray(multiArrayUDF, arguments, arrayURI, xPayer);
        return new JSONObject(jsonString);
    }

    /**
     * Executes an array-UDF. An array-UDF is a UDF applied to a TileDB array
     *
     * @param multiArrayUDF The array-UDF. Can reference one arrays
     * @param arguments The UDF arguments
     * @param arrayURI The array URI
     * @param xPayer Name of organization or user who should be charged for this request
     * @return The results as a JSON array
     */
    public JSONArray executeSingleArrayJSONArray(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments, String arrayURI, String xPayer){
        multiArrayUDF.setResultFormat(ResultFormat.JSON);
        String jsonString = this.executeSingleArray(multiArrayUDF, arguments, arrayURI, xPayer);
        return new JSONArray(jsonString);
    }

    /**
     * Executes an array-UDF. An array-UDF is a UDF applied to a TileDB array
     *
     * @param multiArrayUDF The array-UDF. Can reference one arrays
     * @param arguments The UDF arguments
     * @param arrayURI The array URI
     * @param xPayer Name of organization or user who should be charged for this request
     * @return The results in arrow format
     */
    public Pair<ArrayList<ValueVector>, Integer> executeSingleArrayArrow(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments, String arrayURI, String xPayer){
        String serializedArgs = serializeArgs(arguments);
        multiArrayUDF.setArgument(serializedArgs);
        multiArrayUDF.setResultFormat(ResultFormat.ARROW);

        String[] split = breakdownFullURI(arrayURI);

        try {
            byte[] bytes = apiInstance.submitUDFBytes(split[0], split[1], multiArrayUDF, xPayer, "none", "");
            return TileDBUtils.createValueVectors(bytes);
        } catch (IOException | ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Executes a multi-array-UDF. A multi- array-UDF is a UDF applied to multiple TileDB arrays
     *
     * @param multiArrayUDF The multiArrayUDF input object
     * @param arguments The arguments
     * @return The results as a String
     */
    public String executeMultiArray(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments){
        String serializedArgs = serializeArgs(arguments);
        multiArrayUDF.setArgument(serializedArgs);
        try {
            return apiInstance.submitMultiArrayUDFString(this.namespace, multiArrayUDF, "none");
        } catch (ApiException e) {
            System.err.println("Exception when calling UdfApi#submitMultiArrayUDFString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Executes a multi-array-UDF. A multi- array-UDF is a UDF applied to multiple TileDB arrays
     *
     * @param multiArrayUDF The multiArrayUDF input object
     * @param arguments The arguments
     * @return The results as JSON object
     */
    public JSONObject executeMultiArrayJSON(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments){
        multiArrayUDF.setResultFormat(ResultFormat.JSON);
        String jsonString = this.executeMultiArray(multiArrayUDF, arguments);
        return new JSONObject(jsonString);
    }

    /**
     * Executes a multi-array-UDF. A multi- array-UDF is a UDF applied to multiple TileDB arrays
     *
     * @param multiArrayUDF The multiArrayUDF input object
     * @param arguments The arguments
     * @return The results as JSON Array
     */
    public JSONArray executeMultiArrayJSONArray(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments){
        multiArrayUDF.setResultFormat(ResultFormat.JSON);
        String jsonString = this.executeMultiArray(multiArrayUDF, arguments);
        return new JSONArray(jsonString);
    }

    /**
     * Executes a multi-array-UDF. A multi- array-UDF is a UDF applied to multiple TileDB arrays
     *
     * @param multiArrayUDF The multiArrayUDF input object
     * @param arguments The arguments
     * @return The results in arrow format
     */
    public Pair<ArrayList<ValueVector>, Integer> executeMultiArrayArrow(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments){
        String serializedArgs = serializeArgs(arguments);
        multiArrayUDF.setArgument(serializedArgs);
        multiArrayUDF.setResultFormat(ResultFormat.ARROW);

        try {
            byte[] bytes = apiInstance.submitMultiArrayUDFBytes(this.namespace, multiArrayUDF, "none");
            return TileDBUtils.createValueVectors(bytes);
        } catch (IOException | ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Serializes the arguments to a String
     *
     * @param arguments The input arguments in a HashMap
     * @return The arguments in a String
     */
    private String serializeArgs(HashMap<String, Object> arguments) {
        if (arguments == null || arguments.isEmpty()) return "";
        Gson gson = new Gson();
        return gson.toJson(arguments);
    }

    /**
     * Breaks down a full uri to its components
     * @param arrayURI The input full uri
     * @return An array of strings
     */
    private String[] breakdownFullURI(String arrayURI) {
        arrayURI = arrayURI.replaceAll("tiledb://", ""); //remove tiledb prefix
        //split uri to get namespace and array name
        String[] split  = arrayURI.split("/");
        if (split.length != 2)
            throw new RuntimeException(
                    "TileDB URI is in the wrong format. The format should be: tiledb://namespace/array_name");
        return split;
    }
}