# FilesApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleCreateFile**](FilesApi.md#handleCreateFile) | **POST** /files/{namespace} |  |
| [**handleExportFile**](FilesApi.md#handleExportFile) | **POST** /files/{namespace}/{file}/export |  |
| [**handleUploadFile**](FilesApi.md#handleUploadFile) | **POST** /files/{namespace}/upload |  |


<a name="handleCreateFile"></a>
# **handleCreateFile**
> FileCreated handleCreateFile(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME)



Create a tiledb file at the specified location

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace of the file
    FileCreate fileCreate = new FileCreate(); // FileCreate | Input/Output information to create a new TileDB file
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    try {
      FileCreated result = apiInstance.handleCreateFile(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#handleCreateFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namespace** | **String**| The namespace of the file | |
| **fileCreate** | [**FileCreate**](FileCreate.md)| Input/Output information to create a new TileDB file | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |

### Return type

[**FileCreated**](FileCreated.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File created |  -  |
| **0** | error response |  -  |

<a name="handleExportFile"></a>
# **handleExportFile**
> FileExported handleExportFile(namespace, _file, fileExport)



Export a TileDB File back to its original file format

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace of the file
    String _file = "_file_example"; // String | The file identifier
    FileExport fileExport = new FileExport(); // FileExport | Export configuration information
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
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namespace** | **String**| The namespace of the file | |
| **_file** | **String**| The file identifier | |
| **fileExport** | [**FileExport**](FileExport.md)| Export configuration information | |

### Return type

[**FileExported**](FileExported.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File exported |  -  |
| **0** | error response |  -  |

<a name="handleUploadFile"></a>
# **handleUploadFile**
> FileUploaded handleUploadFile(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name)



Upload a tiledb file at the specified location

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace of the file
    File inputFile = new File("/path/to/file"); // File | the file to upload
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    String outputUri = "outputUri_example"; // String | output location of the TileDB File
    String name = "name_example"; // String | name to set for registered file
    try {
      FileUploaded result = apiInstance.handleUploadFile(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#handleUploadFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namespace** | **String**| The namespace of the file | |
| **inputFile** | **File**| the file to upload | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |
| **outputUri** | **String**| output location of the TileDB File | [optional] |
| **name** | **String**| name to set for registered file | [optional] |

### Return type

[**FileUploaded**](FileUploaded.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File uploaded |  -  |
| **0** | error response |  -  |

