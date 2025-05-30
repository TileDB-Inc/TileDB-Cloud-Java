# FilesApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fileGet**](FilesApi.md#fileGet) | **GET** /files/{workspace}/{teamspace}/{path} | Download the file at the given path |
| [**fileHead**](FilesApi.md#fileHead) | **HEAD** /files/{workspace}/{teamspace}/{path} | Get information about the file at the given path |
| [**folderList**](FilesApi.md#folderList) | **GET** /files/{workspace}/{teamspace} | List folders and files contained in a folder |
| [**uploadPart**](FilesApi.md#uploadPart) | **PUT** /files/{workspace}/{teamspace}/{path} | Upload Part |


<a id="fileGet"></a>
# **fileGet**
> fileGet(workspace, teamspace, path, range)

Download the file at the given path

End point to download the file at the given path 

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String path = "path_example"; // String | The path to the file
    String range = "range_example"; // String | The range of bytes to fetch. Supports only single ranges.
    try {
      apiInstance.fileGet(workspace, teamspace, path, range);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#fileGet");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **path** | **String**| The path to the file | |
| **range** | **String**| The range of bytes to fetch. Supports only single ranges. | [optional] |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful file get response |  -  |
| **206** | Successful file ranged get response |  -  |
| **404** | Teamspace or file does not exist |  -  |
| **416** | Range not satisfiable |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="fileHead"></a>
# **fileHead**
> fileHead(workspace, teamspace, path)

Get information about the file at the given path

End point to get information about the file at the given path 

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String path = "path_example"; // String | The path to the file
    try {
      apiInstance.fileHead(workspace, teamspace, path);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#fileHead");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **path** | **String**| The path to the file | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful file get response |  -  |
| **206** | Successful file ranged get response |  -  |
| **404** | Teamspace or file does not exist |  -  |
| **416** | Range not satisfiable |  -  |
| **502** | Bad Gateway |  -  |

<a id="folderList"></a>
# **folderList**
> FileListResponse folderList(workspace, teamspace, listType, delimiter, prefix, maxKeys, continuationToken)

List folders and files contained in a folder

End point to list files and folders for the passed teamspace 

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    Integer listType = 56; // Integer | Required for S3 API compatibility, must be set to 2.
    String delimiter = "delimiter_example"; // String | The string that delimits the path segments. Only forward slash is supported
    String prefix = "prefix_example"; // String | The directory of files to list.
    Integer maxKeys = 56; // Integer | The maximum number of items to return.
    String continuationToken = "continuationToken_example"; // String | Used to resume an incomplete list operation
    try {
      FileListResponse result = apiInstance.folderList(workspace, teamspace, listType, delimiter, prefix, maxKeys, continuationToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#folderList");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **listType** | **Integer**| Required for S3 API compatibility, must be set to 2. | |
| **delimiter** | **String**| The string that delimits the path segments. Only forward slash is supported | |
| **prefix** | **String**| The directory of files to list. | [optional] |
| **maxKeys** | **Integer**| The maximum number of items to return. | [optional] |
| **continuationToken** | **String**| Used to resume an incomplete list operation | [optional] |

### Return type

[**FileListResponse**](FileListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful folder list response |  -  |
| **404** | Teamspace does not exist |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="uploadPart"></a>
# **uploadPart**
> uploadPart(workspace, teamspace, path, body)

Upload Part

Uploads a part in a multipart upload session.

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String path = "path_example"; // String | The path to the file
    File body = new File("/path/to/file"); // File | 
    try {
      apiInstance.uploadPart(workspace, teamspace, path, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#uploadPart");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **path** | **String**| The path to the file | |
| **body** | **File**|  | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully uploaded the part. |  * ETag - ETag of the uploaded part. <br>  |
| **400** | Bad request |  -  |
| **0** | error response |  -  |

