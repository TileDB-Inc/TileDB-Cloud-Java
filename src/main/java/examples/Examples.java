package examples;

// Import classes:
import io.tiledb.cloud.*;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.GroupsApi;
import io.tiledb.cloud.rest_api.api.ArrayApi;
import io.tiledb.cloud.rest_api.model.*;
import org.apache.arrow.vector.ValueVector;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.tiledb.cloud.TileDBUtils.serializeArgs;

public class Examples
{
    public static void main(String[] args) throws ApiException {

//      if using cloud for the first time create the client with a Login object to pass your credentials.
        TileDBClient tileDBClient = new TileDBClient(
                new TileDBLogin(null,
                        null,
                        System.getenv("API_TOKEN"),
                        true,
                        true,
                        true,
                        "https://api.tiledb.com"));

//      If the "RememberME" option is set to true in your first login you can access TileDB-Cloud without the need
//      to pass any credentials from now on. Just create the client as follows:
//      TileDBClient tileDBClient = new TileDBClient();
        tileDBClient.setDebugging(true);


//        Uncomment to run whichever example you want
        runGenericUDF(tileDBClient);
        runArrayUDF(tileDBClient);
        runMultiArrayUDF(tileDBClient);
        getArray(tileDBClient);
//        createArray(tileDBClient);
//        registerArray(tileDBClient);
        listArrays(tileDBClient);
        listGroups(tileDBClient);
//        deleteArray(tileDBClient);
//        deregisterArray(tileDBClient);
        runSQL(tileDBClient);
        runSQLArrow(tileDBClient);

    }

    private static void runSQL(TileDBClient tileDBClient) {
        SQLParameters sqlParameters = new SQLParameters();
        sqlParameters.setQuery("SELECT * FROM `tiledb://TileDB-Inc/quickstart_sparse`");
        TileDBSQL tileDBSQL = new TileDBSQL(tileDBClient, "TileDB-Inc", sqlParameters);
        System.out.println(tileDBSQL.exec());
    }

    private static void runSQLArrow(TileDBClient tileDBClient) {
        SQLParameters sqlParameters = new SQLParameters();
        sqlParameters.setQuery("SELECT * FROM `tiledb://TileDB-Inc/quickstart_sparse`");
        TileDBSQL tileDBSQL = new TileDBSQL(tileDBClient, "TileDB-Inc", sqlParameters);
        Pair<ArrayList<ValueVector>, Integer> a = tileDBSQL.execArrow();
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
        genericUDF.setArgument(serializeArgs(arguments));
        System.out.println(tileDBUDF.executeGeneric(genericUDF)); //could be JSON or Arrow
    }

    /**
     * Runs an array UDF on a TileDB Array
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

        GenericUDF genericUDF = new GenericUDF();
        genericUDF.setUdfInfoName("TileDB-Inc/array-udf");
        genericUDF.setArgument(serializeArgs(argumentsForArrayUDF));

        UDFArrayDetails array = new UDFArrayDetails();
        array.setUri("tiledb://TileDB-Inc/quickstart_sparse");

        System.out.println(tileDBUDF.executeSingleArray(genericUDF, array, queryRanges, "TileDB-Inc"));
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
        array1.setUri("tiledb://shaunreed/dense-array");
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

        multiArrayUDF.setArgument(serializeArgs(arguments));

        System.out.println(tileDBUDF.executeMultiArray(multiArrayUDF));
    }

    /**
     * Deregister an array
     */
    private static void deregisterArray(TileDBClient tileDBClient)
    {
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "<ARRAY_NAME>"; // String | name/uri of array that is url-encoded
        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());
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
     */
    private static void deleteArray(TileDBClient tileDBClient)
    {
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "<ARRAY_NAME>"; // String | name/uri of array that is url-encoded
        String contentType = "application/json"; // String | Content Type of input and return mime
        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());
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

    private static void listGroups(TileDBClient tileDBClient)
    {
        GroupsApi apiInstance = new GroupsApi(tileDBClient.getApiClient());
        Integer page = null; // Integer | pagination offset
        Integer perPage = null; // Integer | pagination limit
        String search = null; // String | search string that will look at name, namespace or description fields
        String namespace = "TileDB-Inc"; // String | namespace
        String orderby = null; // String | sort by which field valid values include last_accessed, size, name
        String permissions = null; // String | permissions valid values include read, read_write, write, admin
        String groupType = "generic"; // String | filter by a specific group type
        List<String> tag = null; // List<String> | tag to search for, more than one can be included
        List<String> excludeTag = null; // List<String> | tags to exclude matching array in results, more than one can be included
        Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
        String parent = null; // String | search only the children of the groups with this uuid
        Boolean withMetadata = false;
        try {
            GroupBrowserData result = apiInstance.listPublicGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata);
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

    private static void listArrays(TileDBClient tileDBClient)
    {
        String namespace = "dstara"; // String | namespace array is in (an organization name or user's username)
        Boolean withMetadata = false;
        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());

        try {
            List<ArrayInfo> result = apiInstance.getArraysInNamespace(namespace, withMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#getArraysInNamespace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    private static void getArray(TileDBClient tileDBClient){
        String namespace = "TileDB-Inc"; // String | namespace array is in (an organization name or user's username)
        String array = "quickstart_sparse"; // String | name/uri of array that is url-encoded
        String contentType = "application/json"; // String | Content Type of input and return mime
        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());

        try {
            ArraySchema result = apiInstance.getArray(namespace, array, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#getArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    private static void createArray(TileDBClient tileDBClient){
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

        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());

        try {
            apiInstance.createArray(namespace, arrayName, contentType, schema, null);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArrayApi#createArray");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    public static void registerArray(TileDBClient tileDBClient){
        String namespace = "<TILEDB_NAMESPACE>"; // String | namespace array is in (an organization name or user's username)
        String array = "s3://<BUCKET-NAME>/<ARRAY-URI>/"; // String | name/uri of array that is url-encoded
        ArrayInfoUpdate arrayMetadata = new ArrayInfoUpdate(); // ArrayInfoUpdate | metadata associated with array
        arrayMetadata.setUri("s3://<BUCKET-NAME>/<ARRAY-URI>/");
        arrayMetadata.setName("<ARRAY-NAME>");
        ArrayApi apiInstance = new ArrayApi(tileDBClient.getApiClient());

        try {
            ArrayInfo result = apiInstance.registerArray(namespace, array, arrayMetadata);
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

