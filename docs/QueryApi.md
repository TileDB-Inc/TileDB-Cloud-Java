# QueryApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**finalizeQuery**](QueryApi.md#finalizeQuery) | **POST** /arrays/{namespace}/{array}/query/finalize |  |
| [**getEstResultSizes**](QueryApi.md#getEstResultSizes) | **POST** /arrays/{namespace}/{array}/query/est_result_sizes |  |
| [**getFile**](QueryApi.md#getFile) | **GET** /arrays/{namespace}/{array}/query/get_file |  |
| [**submitQuery**](QueryApi.md#submitQuery) | **POST** /arrays/{namespace}/{array}/query/submit |  |
| [**submitQueryJson**](QueryApi.md#submitQueryJson) | **POST** /arrays/{namespace}/{array}/query/submit_query_json |  |


<a name="finalizeQuery"></a>
# **finalizeQuery**
> Query finalizeQuery(namespace, array, type, contentType, query, xPayer, openAt)



send a query to run against a specified array/URI registered to a group/project

### Example

```java
// Import classes:

import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.model.*;
import io.tiledb.cloud.rest_api.api.QueryApi;

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

        QueryApi apiInstance = new QueryApi(defaultClient);
        String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
        String array = "array_example"; // String | name/uri of array that is url-encoded
        String type = "type_example"; // String | type of query
        String contentType = "application/json"; // String | Content Type of input and return mime
        Query query = new Query(); // Query | query to run
        String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
        Integer openAt = 56; // Integer | open_at for array in unix epoch
        try {
            Query result = apiInstance.finalizeQuery(namespace, array, type, contentType, query, xPayer, openAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#finalizeQuery");
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
| **type** | **String**| type of query | |
| **contentType** | **String**| Content Type of input and return mime | [default to application/json] |
| **query** | [**Query**](Query.md)| query to run | |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |
| **openAt** | **Integer**| open_at for array in unix epoch | [optional] |

### Return type

[**Query**](Query.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/capnp
 - **Accept**: application/json, application/capnp

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | query completed and results are returned in query object |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **204** | query completed successfully with no return |  -  |
| **0** | error response |  -  |

<a name="getEstResultSizes"></a>
# **getEstResultSizes**
> Query getEstResultSizes(namespace, array, type, contentType, query, xPayer, openAt)



send a query to run against a specified array/URI registered to a group/project

### Example

```java
// Import classes:

import ApiClient;
import ApiException;
import Configuration;
import org.openapitools.client.models.*;
import QueryApi;

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

        QueryApi apiInstance = new QueryApi(defaultClient);
        String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
        String array = "array_example"; // String | name/uri of array that is url-encoded
        String type = "type_example"; // String | type of query
        String contentType = "application/json"; // String | Content Type of input and return mime
        Query query = new Query(); // Query | query to run
        String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
        Integer openAt = 56; // Integer | open_at for array in unix epoch
        try {
            Query result = apiInstance.getEstResultSizes(namespace, array, type, contentType, query, xPayer, openAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#getEstResultSizes");
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
| **type** | **String**| type of query | |
| **contentType** | **String**| Content Type of input and return mime | [default to application/json] |
| **query** | [**Query**](Query.md)| query to run | |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |
| **openAt** | **Integer**| open_at for array in unix epoch | [optional] |

### Return type

[**Query**](Query.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/capnp
 - **Accept**: application/json, application/capnp

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | query est result size computed and results are returned in query object |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **204** | query completed successfully with no return |  -  |
| **0** | error response |  -  |

<a name="getFile"></a>
# **getFile**
> File getFile(namespace, array, contentType, xPayer)



send a query to run against a specified array/URI registered to a group/project, returns file bytes

### Example

```java
// Import classes:

import ApiClient;
import ApiException;
import Configuration;
import org.openapitools.client.models.*;
import QueryApi;

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

        QueryApi apiInstance = new QueryApi(defaultClient);
        String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
        String array = "array_example"; // String | name/uri of array that is url-encoded
        String contentType = "application/json"; // String | Content Type of input and return mime
        String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
        try {
            File result = apiInstance.getFile(namespace, array, contentType, xPayer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#getFile");
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
| **contentType** | **String**| Content Type of input and return mime | [default to application/json] |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-ipynb+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | query completed and result bytes are returned |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **0** | error response |  -  |

<a name="submitQuery"></a>
# **submitQuery**
> Query submitQuery(namespace, array, type, contentType, query, xPayer, openAt)



send a query to run against a specified array/URI registered to a group/project

### Example

```java
// Import classes:

import ApiClient;
import ApiException;
import Configuration;
import org.openapitools.client.models.*;
import QueryApi;

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

        QueryApi apiInstance = new QueryApi(defaultClient);
        String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
        String array = "array_example"; // String | name/uri of array that is url-encoded
        String type = "type_example"; // String | type of query
        String contentType = "application/json"; // String | Content Type of input and return mime
        Query query = new Query(); // Query | query to run
        String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
        Integer openAt = 56; // Integer | open_at for array in unix epoch
        try {
            Query result = apiInstance.submitQuery(namespace, array, type, contentType, query, xPayer, openAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#submitQuery");
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
| **type** | **String**| type of query | |
| **contentType** | **String**| Content Type of input and return mime | [default to application/json] |
| **query** | [**Query**](Query.md)| query to run | |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |
| **openAt** | **Integer**| open_at for array in unix epoch | [optional] |

### Return type

[**Query**](Query.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/capnp
 - **Accept**: application/json, application/capnp

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | query completed and results are returned in query object |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **204** | query completed successfully with no return |  -  |
| **0** | error response |  -  |

<a name="submitQueryJson"></a>
# **submitQueryJson**
> Object submitQueryJson(namespace, array, contentType, queryJson, xPayer)



send a query to run against a specified array/URI registered to a group/project, returns JSON results

### Example

```java
// Import classes:

import ApiClient;
import ApiException;
import Configuration;
import org.openapitools.client.models.*;
import QueryApi;

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

        QueryApi apiInstance = new QueryApi(defaultClient);
        String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
        String array = "array_example"; // String | name/uri of array that is url-encoded
        String contentType = "application/json"; // String | Content Type of input and return mime
        QueryJson queryJson = new QueryJson(); // QueryJson | query to run
        String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
        try {
            Object result = apiInstance.submitQueryJson(namespace, array, contentType, queryJson, xPayer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#submitQueryJson");
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
| **contentType** | **String**| Content Type of input and return mime | [default to application/json] |
| **queryJson** | [**QueryJson**](QueryJson.md)| query to run | |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | query completed and results are returned in JSON format |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **0** | error response |  -  |

