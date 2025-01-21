# TaskGraphsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaskGraph**](TaskGraphsApi.md#createTaskGraph) | **POST** /taskgraphs/{namespace}/graphs |  |
| [**getTaskGraph**](TaskGraphsApi.md#getTaskGraph) | **GET** /taskgraphs/{namespace}/graphs/{id} |  |
| [**listTaskGraphs**](TaskGraphsApi.md#listTaskGraphs) | **GET** /taskgraphs/{namespace}/graphs |  |
| [**submitTaskGraph**](TaskGraphsApi.md#submitTaskGraph) | **POST** /taskgraphs/{namespace}/graphs/{id}/submit |  |
| [**updateTaskGraph**](TaskGraphsApi.md#updateTaskGraph) | **PATCH** /taskgraphs/{namespace}/graphs/{id} |  |


<a id="createTaskGraph"></a>
# **createTaskGraph**
> TaskGraph createTaskGraph(namespace, graph)



Create a single task graph for execution. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | Include graphs for this namespace.
    TaskGraph graph = new TaskGraph(); // TaskGraph | Create the task graph.
    try {
      TaskGraph result = apiInstance.createTaskGraph(namespace, graph);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#createTaskGraph");
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
| **namespace** | **String**| Include graphs for this namespace. | |
| **graph** | [**TaskGraph**](TaskGraph.md)| Create the task graph. | |

### Return type

[**TaskGraph**](TaskGraph.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Task graph created successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="getTaskGraph"></a>
# **getTaskGraph**
> TaskGraph getTaskGraph(namespace, id)



Fetch information about a single task graph. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this task graph.
    String id = "id_example"; // String | The UUID of the task graph entry.
    try {
      TaskGraph result = apiInstance.getTaskGraph(namespace, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#getTaskGraph");
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
| **namespace** | **String**| The namespace that owns this task graph. | |
| **id** | **String**| The UUID of the task graph entry. | |

### Return type

[**TaskGraph**](TaskGraph.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the single task graph. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="listTaskGraphs"></a>
# **listTaskGraphs**
> TaskGraphs listTaskGraphs(namespace)



Fetch the task graphs of a namespace the user has access to. The returned entries will include only summary data, and will not include information about the individual tasks that were executed. (This information is available when requesting an individual task graph log.) Entries in the response are ordered from newest to oldest. Pagination parameters work as in other API methods; see PaginationMetadata. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | Namespace for graphs
    try {
      TaskGraphs result = apiInstance.listTaskGraphs(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#listTaskGraphs");
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
| **namespace** | **String**| Namespace for graphs | |

### Return type

[**TaskGraphs**](TaskGraphs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task graphs that matched the user&#39;s query. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="submitTaskGraph"></a>
# **submitTaskGraph**
> TaskGraphLog submitTaskGraph(namespace, id)



Submit a single task graph for execution. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this task graph.
    String id = "id_example"; // String | The UUID of the task graph entry.
    try {
      TaskGraphLog result = apiInstance.submitTaskGraph(namespace, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#submitTaskGraph");
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
| **namespace** | **String**| The namespace that owns this task graph. | |
| **id** | **String**| The UUID of the task graph entry. | |

### Return type

[**TaskGraphLog**](TaskGraphLog.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Information about the execution of a single task graph. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a id="updateTaskGraph"></a>
# **updateTaskGraph**
> updateTaskGraph(namespace, id, graph)



Update information about a single task graph execution. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskGraphsApi;

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

    TaskGraphsApi apiInstance = new TaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this task graph.
    String id = "id_example"; // String | The UUID of the task graph entry.
    TaskGraph graph = new TaskGraph(); // TaskGraph | Updates to make to the task graph.
    try {
      apiInstance.updateTaskGraph(namespace, id, graph);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskGraphsApi#updateTaskGraph");
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
| **namespace** | **String**| The namespace that owns this task graph. | |
| **id** | **String**| The UUID of the task graph entry. | |
| **graph** | [**TaskGraph**](TaskGraph.md)| Updates to make to the task graph. | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Task graph created successfully. |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

