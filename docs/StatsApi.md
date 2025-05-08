# StatsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTiledbStats**](StatsApi.md#getTiledbStats) | **GET** /.stats |  |


<a name="getTiledbStats"></a>
# **getTiledbStats**
> GetTiledbStats200Response getTiledbStats()



Fetch libtiledb stat

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.StatsApi;

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

        StatsApi apiInstance = new StatsApi(defaultClient);
        try {
            GetTiledbStats200Response result = apiInstance.getTiledbStats();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsApi#getTiledbStats");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTiledbStats200Response**](GetTiledbStats200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | stats |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

