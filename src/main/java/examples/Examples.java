package examples;

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.FilesApi;
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
import org.openapitools.client.model.FileExport;
import org.openapitools.client.model.FileExported;
import org.openapitools.client.model.FileUploaded;
import org.openapitools.client.model.Filter;
import org.openapitools.client.model.FilterPipeline;
import org.openapitools.client.model.FilterType;
import org.openapitools.client.model.Layout;

import java.io.File;

public class Examples
{
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.tiledb.com/v1");

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("<ENTER API TOKEN HERE>");

        ArrayApi apiInstance = new ArrayApi(defaultClient);

        getArraySchema(apiInstance);
        createArray(apiInstance);
        registerArray(apiInstance);
        uploadFile(defaultClient);
        exportFile(defaultClient);

    }

    private static void exportFile(ApiClient defaultClient)
    {
        FilesApi apiInstance = new FilesApi(defaultClient);
        String namespace = "<TILEDB_NAMESPACE>"; // String | The namespace of the file
        String _file = "file"; // String | The file identifier
        FileExport fileExport = new FileExport(); // FileExport | Export configuration information
        fileExport.setOutputUri("s3://<BUCKET-NAME>/file.txt");
        try {
            FileExported result = apiInstance.handleExportFile(namespace, _file, fileExport);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#handleExportFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }


    private static void uploadFile(ApiClient defaultClient)
    {
        FilesApi apiInstance = new FilesApi(defaultClient);
        String namespace = "<TILEDB_NAMESPACE>"; // String | The namespace of the file
        File inputFile = new File("file.txt"); // File | the file to upload
        String outputUri = "s3://<BUCKET-NAME>/file"; // String | output location of the TileDB File
        String name = "file"; // String | name to set for registered file
        try {
            FileUploaded result = apiInstance.handleUploadFile(namespace, inputFile, "dstara", outputUri, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#handleUploadFile");
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
        filterPipeline.addFiltersItem(new Filter().type(FilterType.NONE));

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
