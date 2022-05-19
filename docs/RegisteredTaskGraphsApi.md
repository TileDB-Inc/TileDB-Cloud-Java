# RegisteredTaskGraphsApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#deleteRegisteredTaskGraph) | **DELETE** /taskgraphs/{namespace}/registered/{name} | 
[**getRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#getRegisteredTaskGraph) | **GET** /taskgraphs/{namespace}/registered/{name} | 
[**getRegisteredTaskGraphSharingPolicies**](RegisteredTaskGraphsApi.md#getRegisteredTaskGraphSharingPolicies) | **GET** /taskgraphs/{namespace}/registered/{name}/share | 
[**registerRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#registerRegisteredTaskGraph) | **POST** /taskgraphs/{namespace}/registered/{name} | 
[**shareRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#shareRegisteredTaskGraph) | **PATCH** /taskgraphs/{namespace}/registered/{name}/share | 
[**updateRegisteredTaskGraph**](RegisteredTaskGraphsApi.md#updateRegisteredTaskGraph) | **PATCH** /taskgraphs/{namespace}/registered/{name} | 


<a name="deleteRegisteredTaskGraph"></a>
# **deleteRegisteredTaskGraph**
> deleteRegisteredTaskGraph(namespace, name)



Delete the given registered task graph. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this registered UDF.
    String name = "name_example"; // String | The name of the registered task graph.
    try {
      apiInstance.deleteRegisteredTaskGraph(namespace, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#deleteRegisteredTaskGraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace that owns this registered UDF. |
 **name** | **String**| The name of the registered task graph. |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Task graph successfully deleted. |  -  |
**0** | error response |  -  |

<a name="getRegisteredTaskGraph"></a>
# **getRegisteredTaskGraph**
> RegisteredTaskGraph getRegisteredTaskGraph(namespace, name)



Fetch the contents of this registered task graph. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this registered UDF.
    String name = "name_example"; // String | The name of the registered task graph.
    try {
      RegisteredTaskGraph result = apiInstance.getRegisteredTaskGraph(namespace, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#getRegisteredTaskGraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace that owns this registered UDF. |
 **name** | **String**| The name of the registered task graph. |

### Return type

[**RegisteredTaskGraph**](RegisteredTaskGraph.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The contents of the registered task graph. |  -  |
**0** | error response |  -  |

<a name="getRegisteredTaskGraphSharingPolicies"></a>
# **getRegisteredTaskGraphSharingPolicies**
> List&lt;TaskGraphSharing&gt; getRegisteredTaskGraphSharingPolicies(namespace, name)



Get sharing policies for the task graph.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns the registered task graph.
    String name = "name_example"; // String | The name of the task graph.
    try {
      List<TaskGraphSharing> result = apiInstance.getRegisteredTaskGraphSharingPolicies(namespace, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#getRegisteredTaskGraphSharingPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace that owns the registered task graph. |
 **name** | **String**| The name of the task graph. |

### Return type

[**List&lt;TaskGraphSharing&gt;**](TaskGraphSharing.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of all specific sharing policies |  -  |
**404** | The task graph does not exist (or the user does not have permission to view policies)  |  -  |
**0** | error response |  -  |

<a name="registerRegisteredTaskGraph"></a>
# **registerRegisteredTaskGraph**
> registerRegisteredTaskGraph(namespace, name, graph)



Register a task graph in the given namespace, with the given name. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this registered UDF.
    String name = "name_example"; // String | The name of the registered task graph.
    RegisteredTaskGraph graph = new RegisteredTaskGraph(); // RegisteredTaskGraph | Task graph to register.
    try {
      apiInstance.registerRegisteredTaskGraph(namespace, name, graph);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#registerRegisteredTaskGraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace that owns this registered UDF. |
 **name** | **String**| The name of the registered task graph. |
 **graph** | [**RegisteredTaskGraph**](RegisteredTaskGraph.md)| Task graph to register. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Task graph registered successfully. |  -  |
**0** | error response |  -  |

<a name="shareRegisteredTaskGraph"></a>
# **shareRegisteredTaskGraph**
> shareRegisteredTaskGraph(namespace, name, taskGraphSharing)



Share a task graph.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns the registered task graph.
    String name = "name_example"; // String | The name of the task graph.
    TaskGraphSharing taskGraphSharing = new TaskGraphSharing(); // TaskGraphSharing | Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it's likely the UDF will not be shared with the namespace at all. 
    try {
      apiInstance.shareRegisteredTaskGraph(namespace, name, taskGraphSharing);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#shareRegisteredTaskGraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace that owns the registered task graph. |
 **name** | **String**| The name of the task graph. |
 **taskGraphSharing** | [**TaskGraphSharing**](TaskGraphSharing.md)| Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it&#39;s likely the UDF will not be shared with the namespace at all.  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | UDF shared successfully |  -  |
**404** | UDF does not exist or user does not have permissions to share UDF |  -  |
**0** | error response |  -  |

<a name="updateRegisteredTaskGraph"></a>
# **updateRegisteredTaskGraph**
> updateRegisteredTaskGraph(namespace, name, graph)



Update the contents of an existing registered task graph. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegisteredTaskGraphsApi;

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

    RegisteredTaskGraphsApi apiInstance = new RegisteredTaskGraphsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace that owns this registered UDF.
    String name = "name_example"; // String | The name of the registered task graph.
    RegisteredTaskGraph graph = new RegisteredTaskGraph(); // RegisteredTaskGraph | The new contents of the task graph.
    try {
      apiInstance.updateRegisteredTaskGraph(namespace, name, graph);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegisteredTaskGraphsApi#updateRegisteredTaskGraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace that owns this registered UDF. |
 **name** | **String**| The name of the registered task graph. |
 **graph** | [**RegisteredTaskGraph**](RegisteredTaskGraph.md)| The new contents of the task graph. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Task graph updated successfully. |  -  |
**0** | error response |  -  |

