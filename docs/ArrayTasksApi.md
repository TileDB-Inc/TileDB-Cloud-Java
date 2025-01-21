# ArrayTasksApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getArrayTasksSidebar**](ArrayTasksApi.md#getArrayTasksSidebar) | **GET** /tasks/sidebar |  |


<a id="getArrayTasksSidebar"></a>
# **getArrayTasksSidebar**
> ArrayTaskBrowserSidebar getArrayTasksSidebar(start, end)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayTasksApi;

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

    ArrayTasksApi apiInstance = new ArrayTasksApi(defaultClient);
    Integer start = 56; // Integer | Fetch tasks created after this time, unix epoch in seconds, default 7 days ago
    Integer end = 56; // Integer | Fetch tasks created before this time, unix epoch in seconds, default now
    try {
      ArrayTaskBrowserSidebar result = apiInstance.getArrayTasksSidebar(start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayTasksApi#getArrayTasksSidebar");
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
| **start** | **Integer**| Fetch tasks created after this time, unix epoch in seconds, default 7 days ago | [optional] |
| **end** | **Integer**| Fetch tasks created before this time, unix epoch in seconds, default now | [optional] |

### Return type

[**ArrayTaskBrowserSidebar**](ArrayTaskBrowserSidebar.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | sidebar metadata for task definitions for all arrays user has access to |  -  |
| **404** | array tasks not found |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

