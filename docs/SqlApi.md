# SqlApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runSQL**](SqlApi.md#runSQL) | **POST** /sql/{namespace} |  |


<a name="runSQL"></a>
# **runSQL**
> List&lt;Object&gt; runSQL(namespace, sql, acceptEncoding)



Run a sql query

### Example

```java
// Import classes:

import ApiClient;
import ApiException;
import Configuration;
import io.tiledb.cloud.rest_api.models.*;
import SqlApi;

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

        SqlApi apiInstance = new SqlApi(defaultClient);
        String namespace = "namespace_example"; // String | namespace to run task under is in (an organization name or user's username)
        SQLParameters sql = new SQLParameters(); // SQLParameters | sql being submitted
        String acceptEncoding = "acceptEncoding_example"; // String | Encoding to use
        try {
            List<Object> result = apiInstance.runSQL(namespace, sql, acceptEncoding);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlApi#runSQL");
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
| **namespace** | **String**| namespace to run task under is in (an organization name or user&#39;s username) | |
| **sql** | [**SQLParameters**](SQLParameters.md)| sql being submitted | |
| **acceptEncoding** | **String**| Encoding to use | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON results in array of objects form, if the query returns results |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **204** | SQL executed successfully |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

