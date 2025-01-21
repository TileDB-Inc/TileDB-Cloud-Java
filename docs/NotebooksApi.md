# NotebooksApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notebooksNamespaceArrayEndTimestampsGet**](NotebooksApi.md#notebooksNamespaceArrayEndTimestampsGet) | **GET** /notebooks/{namespace}/{array}/end_timestamps |  |
| [**notebooksNamespaceArrayPrunePost**](NotebooksApi.md#notebooksNamespaceArrayPrunePost) | **POST** /notebooks/{namespace}/{array}/prune |  |


<a id="notebooksNamespaceArrayEndTimestampsGet"></a>
# **notebooksNamespaceArrayEndTimestampsGet**
> ArrayEndTimestampData notebooksNamespaceArrayEndTimestampsGet(namespace, array, page, perPage)



retrieve a list of timestamps from the array fragment info listing in milliseconds, paginated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotebooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NotebooksApi apiInstance = new NotebooksApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      ArrayEndTimestampData result = apiInstance.notebooksNamespaceArrayEndTimestampsGet(namespace, array, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#notebooksNamespaceArrayEndTimestampsGet");
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
| **namespace** | **String**| namespace array is in (an organization name or user&#39;s username) | |
| **array** | **String**| name/uri of array that is url-encoded | |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**ArrayEndTimestampData**](ArrayEndTimestampData.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of timestamps in milliseconds, paginated |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="notebooksNamespaceArrayPrunePost"></a>
# **notebooksNamespaceArrayPrunePost**
> notebooksNamespaceArrayPrunePost(namespace, array, keepVersions)



prune fragments of the notebook

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotebooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/v1");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NotebooksApi apiInstance = new NotebooksApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer keepVersions = 56; // Integer | The number of most recents fragment to preserve
    try {
      apiInstance.notebooksNamespaceArrayPrunePost(namespace, array, keepVersions);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#notebooksNamespaceArrayPrunePost");
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
| **namespace** | **String**| namespace array is in (an organization name or user&#39;s username) | |
| **array** | **String**| name/uri of array that is url-encoded | |
| **keepVersions** | **Integer**| The number of most recents fragment to preserve | [optional] |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | notebook pruned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

