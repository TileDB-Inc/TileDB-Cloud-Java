package examples;

// Import classes:
import io.tiledb.cloud.TileDBClient;
import io.tiledb.cloud.TileDBSQL;
import io.tiledb.cloud.TileDBUDF;
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.TileDBLogin;
import io.tiledb.cloud.rest_api.api.GroupsApi;
import io.tiledb.cloud.rest_api.api.ArrayApi;
import io.tiledb.cloud.rest_api.model.*;
import io.tiledb.java.api.Pair;
import org.apache.arrow.vector.ValueVector;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Examples
{
    public static void main(String[] args) {

//      if using cloud for the first time create the client with a Login object to pass your credentials.
        TileDBClient tileDBClient = new TileDBClient(
                new TileDBLogin(null,
                        null,
                        "<TILEDB_API_TOKEN>",
                        true,
                        true,
                        true));

//      If the "RememberME" option is set to true in your first login you can access TileDB-Cloud without the need
//      to pass any credentials from now on. Just create the client as follows:
//      TileDBClient tileDBClient = new TileDBClient();

        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());

//        Uncomment to run whichever example you want
//        runGenericUDF(tileDBClient);
//        runSQL("SELECT * FROM `tiledb://TileDB-Inc/quickstart_sparse`", tileDBClient);
//        runArrayUDF(tileDBClient);
//        runMultiArrayUDF(tileDBClient);
//        getArraySchema(apiInstance);
//        createArray(apiInstance);
//        registerArray(apiInstance);
//        listArrays(apiInstance);
//        listGroups(defaultClient);
//        deleteArray(apiInstance);
//        deregisterArray(apiInstance);
    }

    /**
     * Runs a simple SQL query
     * @param s the query
     * @param tileDBClient
     */
    private static void runSQL(String s, TileDBClient tileDBClient) {
        SQLParameters sqlParameters = new SQLParameters();
        sqlParameters.setQuery(s);
        // get results in arrow format
        sqlParameters.setResultFormat(ResultFormat.ARROW);

        //set timeout to unlimited
        tileDBClient.setReadTimeout(0);

        // create TileDBSQL object
        TileDBSQL tileDBSQL = new TileDBSQL(tileDBClient, "TileDB-Inc", sqlParameters);

        // run query and expect results in arrow format
        Pair<ArrayList<ValueVector>, Integer> valueVectors = tileDBSQL.execArrow();
    }

    /**
     * Runs a generic UDF
     * @param tileDBClient
     */
    private static void runGenericUDF(TileDBClient tileDBClient){
        TileDBUDF tileDBUDF = new TileDBUDF(tileDBClient, "TileDB-Inc");
        GenericUDF genericUDF = new GenericUDF();
        genericUDF.setUdfInfoName("TileDB-Inc/args-udf");
        HashMap<String,Object> arguments = new HashMap<>();
        arguments.put("arg1", "a1");
        arguments.put("arg2", "a2");
        System.out.println(tileDBUDF.executeGeneric(genericUDF, arguments)); //could be JSON or Arrow
    }

    /**
     * Runs an array UDF on a TileDB Arrray
     * @param tileDBClient
     */
    public static void runArrayUDF(TileDBClient tileDBClient){
        TileDBUDF tileDBUDF = new TileDBUDF(tileDBClient, "TileDB-Inc");
        ArrayList<BigDecimal> range1 = new ArrayList<>();
        range1.add(BigDecimal.valueOf(1));
        range1.add(BigDecimal.valueOf(4));

        ArrayList<BigDecimal> range2 = new ArrayList<>();
        range2.add(BigDecimal.valueOf(1));
        range2.add(BigDecimal.valueOf(4));

        QueryRanges queryRanges = new QueryRanges();
        queryRanges.addRangesItem(range1);
        queryRanges.addRangesItem(range2);


        HashMap<String,Object> argumentsForArrayUDF = new HashMap<>();
        argumentsForArrayUDF.put("attr", "rows");
        argumentsForArrayUDF.put("scale", 9);

        MultiArrayUDF multiArrayUDF = new MultiArrayUDF();
        multiArrayUDF.setUdfInfoName("TileDB-Inc/array-udf");
        multiArrayUDF.setRanges(queryRanges);
        System.out.println(tileDBUDF.executeSingleArray(multiArrayUDF, argumentsForArrayUDF, "tiledb://TileDB-Inc/quickstart_sparse", "TileDB-Inc"));
    }

    /**
     * Runs a multi-array UDF on multiple TileDB arrays
     * @param tileDBClient
     */
    public static void runMultiArrayUDF(TileDBClient tileDBClient){
        TileDBUDF tileDBUDF = new TileDBUDF(tileDBClient, "TileDB-Inc");

        ArrayList<BigDecimal> range1 = new ArrayList<>();
        range1.add(BigDecimal.valueOf(1));
        range1.add(BigDecimal.valueOf(4));

        ArrayList<BigDecimal> range2 = new ArrayList<>();
        range2.add(BigDecimal.valueOf(1));
        range2.add(BigDecimal.valueOf(4));

        QueryRanges queryRanges = new QueryRanges();
        queryRanges.addRangesItem(range1);
        queryRanges.addRangesItem(range2);

        MultiArrayUDF multiArrayUDF = new MultiArrayUDF();
        multiArrayUDF.setUdfInfoName("TileDB-Inc/multi-array-udf");

        List<UDFArrayDetails> arrays = new ArrayList<>();

        //array1
        UDFArrayDetails array1 = new UDFArrayDetails();
        array1.setUri("tiledb://TileDB-Inc/dense-array");
        array1.setRanges(queryRanges);
        array1.setBuffers(Arrays.asList("rows", "cols", "a1"));
        arrays.add(array1);

        //array2
        UDFArrayDetails array2 = new UDFArrayDetails();
        array2.setUri("tiledb://TileDB-Inc/quickstart_dense");
        array2.setRanges(queryRanges);
        array2.setBuffers(Arrays.asList("rows", "cols", "a"));
        arrays.add(array2);

        multiArrayUDF.setArrays(arrays);

        HashMap<String,Object> arguments = new HashMap<>();
        arguments.put("attr1", "a1");
        arguments.put("attr2", "a");

        System.out.println(tileDBUDF.executeMultiArray(multiArrayUDF, arguments));
    }

    /**
     * Deregister an array
     * @param apiInstance
     */
    private static void deregisterArray(ArrayApi apiInstance)
    {
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "<ARRAY_NAME>"; // String | name/uri of array that is url-encoded
        try {
            apiInstance.deregisterArray(namespace, array);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#deregisterArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    /**
     * Delete an array
     * @param apiInstance
     */
    private static void deleteArray(ArrayApi apiInstance)
    {
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "<ARRAY_NAME>"; // String | name/uri of array that is url-encoded
        String contentType = "application/json"; // String | Content Type of input and return mime
        try {
            apiInstance.deleteArray(namespace, array, contentType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#deleteArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    /**
     * List groups
     * @param defaultClient
     */
    private static void listGroups(ApiClient defaultClient)
    {
        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Integer page = null; // Integer | pagination offset
        Integer perPage = null; // Integer | pagination limit
        String search = null; // String | search string that will look at name, namespace or description fields
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace
        String orderby = null; // String | sort by which field valid values include last_accessed, size, name
        String permissions = null; // String | permissions valid values include read, read_write, write, admin
        List<String> tag = null; // List<String> | tag to search for, more than one can be included
        List<String> excludeTag = null; // List<String> | tags to exclude matching array in results, more than one can be included
        Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
        String parent = null; // String | search only the children of the groups with this uuid
        try {
            GroupBrowserData result = apiInstance.listPublicGroups(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, flat, parent);
            //or use api.listOwnedGroups(...) / api.listSharedGroups(...)
            System.out.println(result.getGroups());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#listPublicGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

    }

    /**
     * List arrays
     * @param apiInstance
     */
    private static void listArrays(ArrayApi apiInstance)
    {
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        try {
            List<ArrayInfo> result = apiInstance.getArraysInNamespace(namespace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#getArraysInNamespace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }


    private static void getArraySchema(ArrayApi arrayApi){
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "<ARRAY_URI>"; // String | name/uri of array that is url-encoded
        String contentType = "application/json"; // String | Content Type of input and return mime
        try {
            ArraySchema result = arrayApi.getArray(namespace, array, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#getArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    private static void createArray(ArrayApi arrayApi){
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String arrayName = "s3://<BUCKET-NAME>/my_array"; // String | name/uri of array that is url-encoded //
        String contentType = "application/json"; // String | Content Type of input and return mime

        Dimension d1 = new Dimension();

        d1.setName("d1");

        d1.setType(Datatype.INT64);

        DomainArray domainArray = new DomainArray();
        domainArray.addInt64Item(0L);
        domainArray.addInt64Item(4L);
        d1.setDomain(domainArray);

        DimensionTileExtent tileExtent = new DimensionTileExtent().int64(2L);
        d1.setTileExtent(tileExtent);
        d1.setNullTileExtent(false);

        // Create and set getDomain
        Domain domain = new Domain();
        domain.setTileOrder(Layout.ROW_MAJOR);
        domain.setCellOrder(Layout.ROW_MAJOR);
        domain.setType(Datatype.INT64);
        domain.addDimensionsItem(d1);

        // Create and add Attributes
        Attribute a1 = new Attribute();
        a1.setName("a1");
        a1.setType(Datatype.INT32);
        a1.setNullable(true);

        ArraySchema schema = new ArraySchema();
        schema.addVersionItem(10);

        FilterPipeline filterPipeline = new FilterPipeline();
        filterPipeline.addFiltersItem(new Filter().type(FilterType.ZSTD));

        schema.setOffsetFilterPipeline(filterPipeline);
        schema.setCoordsFilterPipeline(filterPipeline);

        schema.setDomain(domain);
        schema.setCapacity(1000);
        schema.addAttributesItem(a1);
        schema.setArrayType(ArrayType.DENSE);
        schema.setTileOrder(Layout.ROW_MAJOR);
        schema.setCellOrder(Layout.ROW_MAJOR);
        System.out.println(schema);

        try {
            arrayApi.createArray(namespace, arrayName, contentType, schema, null);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#createArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    public static void registerArray(ArrayApi arrayApi){
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "s3://<BUCKET-NAME>/<ARRAY-URI>/"; // String | name/uri of array that is url-encoded
        ArrayInfoUpdate arrayMetadata = new ArrayInfoUpdate(); // ArrayInfoUpdate | metadata associated with array
        arrayMetadata.setUri("s3://<BUCKET-NAME>/<ARRAY-URI>/");
        arrayMetadata.setName("<ARRAY-NAME>");
        try {
            ArrayInfo result = arrayApi.registerArray(namespace, array, arrayMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#registerArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

