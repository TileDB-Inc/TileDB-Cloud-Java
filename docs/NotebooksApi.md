# NotebooksApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notebooksNamespaceArrayEndTimestampsGet**](NotebooksApi.md#notebooksNamespaceArrayEndTimestampsGet) | **GET** /notebooks/{namespace}/{array}/end_timestamps |  |


<a name="notebooksNamespaceArrayEndTimestampsGet"></a>
# **notebooksNamespaceArrayEndTimestampsGet**
> ArrayEndTimestampData notebooksNamespaceArrayEndTimestampsGet(namespace, array, page, perPage)



retrieve a list of timestamps from the array fragment info listing in milliseconds, paginated

### Example

```java
// Import classes:

import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.model.*;
import io.tiledb.cloud.rest_api.api.NotebooksApi;

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

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of timestamps in milliseconds, paginated |  -  |
| **0** | error response |  -  |

