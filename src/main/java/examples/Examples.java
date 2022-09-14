package examples;

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.GroupsApi;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.ArrayApi;
import org.openapitools.client.model.ArrayInfo;
import org.openapitools.client.model.ArrayInfoUpdate;
import org.openapitools.client.model.ArraySchema;
import org.openapitools.client.model.ArrayType;
import org.openapitools.client.model.Attribute;
import org.openapitools.client.model.Datatype;
import org.openapitools.client.model.Dimension;
import org.openapitools.client.model.DimensionTileExtent;
import org.openapitools.client.model.Domain;
import org.openapitools.client.model.DomainArray;
import org.openapitools.client.model.Filter;
import org.openapitools.client.model.FilterPipeline;
import org.openapitools.client.model.FilterType;
import org.openapitools.client.model.GroupBrowserData;
import org.openapitools.client.model.Layout;

import java.util.List;

public class Examples
{
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.tiledb.com/v1");

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("<API_TOKEN>");

        ArrayApi apiInstance = new ArrayApi(defaultClient);

//        getArraySchema(apiInstance);
//        createArray(apiInstance);
//        registerArray(apiInstance);
//        listArrays(apiInstance);
//        listGroups(defaultClient);
//        deleteArray(apiInstance);
//        deregisterArray(apiInstance);
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
        String namespace = "TileDB-Inc"; // String | namespace
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
        String array = "my_array"; // String | name/uri of array that is url-encoded
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
