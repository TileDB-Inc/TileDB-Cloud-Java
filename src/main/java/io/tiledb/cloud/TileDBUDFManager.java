package io.tiledb.cloud;

import com.google.gson.Gson;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.UdfApi;
import io.tiledb.cloud.rest_api.model.GenericUDF;
import io.tiledb.cloud.rest_api.model.MultiArrayUDF;
import java.util.HashMap;

public class TileDBUDFManager {
    private TileDBClient tileDBClient;
    private String namespace;
    private UdfApi apiInstance;

    public TileDBUDFManager(TileDBClient tileDBClient, String namespace) {
        this.tileDBClient = tileDBClient;
        this.namespace = namespace;
        this.apiInstance = new UdfApi(this.tileDBClient.getApiClient());

    }

    /**
     * Executes a generic-UDF. A generic-UDF is a UDF that is not using a TIleDB array.
     *
     * @param genericUDF The generic UDF definition
     * @param arguments The UDF arguments
     * @return
     */
    public String executeGenericUDF(GenericUDF genericUDF, HashMap<String, Object> arguments){
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
     * Executes an array-UDF. An array-UDF is a UDF applied to a TileDB array
     *
     * @param multiArrayUDF The array-UDF. Can reference one arrays
     * @param arguments The UDF arguments
     * @param arrayURI The array URI
     * @param xPayer Name of organization or user who should be charged for this request
     * @return
     */
    public String executeSingleArrayUDF(MultiArrayUDF multiArrayUDF, HashMap<String, Object> arguments, String arrayURI, String xPayer){
        String serializedArgs = serializeArgs(arguments);
        multiArrayUDF.setArgument(serializedArgs);
        //split uri to get namespace and array name
        arrayURI = arrayURI.replaceAll("tiledb://", ""); //remove tiledb prefix
        String[] split  = arrayURI.split("/");
        if (split.length != 2)
            throw new RuntimeException(
                    "TileDB URI is in the wrong format. The format should be: tiledb://namespace/array_name");
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
}
