# ArrayApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**arrayActivityLog**](ArrayApi.md#arrayActivityLog) | **GET** /arrays/{namespace}/{array}/activity |  |
| [**arraysBrowserOwnedGet**](ArrayApi.md#arraysBrowserOwnedGet) | **GET** /arrays/browser/owned |  |
| [**arraysBrowserOwnedSidebarGet**](ArrayApi.md#arraysBrowserOwnedSidebarGet) | **GET** /arrays/browser/owned/sidebar |  |
| [**arraysBrowserPublicGet**](ArrayApi.md#arraysBrowserPublicGet) | **GET** /arrays/browser/public |  |
| [**arraysBrowserPublicSidebarGet**](ArrayApi.md#arraysBrowserPublicSidebarGet) | **GET** /arrays/browser/public/sidebar |  |
| [**arraysBrowserSharedGet**](ArrayApi.md#arraysBrowserSharedGet) | **GET** /arrays/browser/shared |  |
| [**arraysBrowserSharedSidebarGet**](ArrayApi.md#arraysBrowserSharedSidebarGet) | **GET** /arrays/browser/shared/sidebar |  |
| [**arraysNamespaceArrayEndTimestampsGet**](ArrayApi.md#arraysNamespaceArrayEndTimestampsGet) | **GET** /arrays/{namespace}/{array}/end_timestamps |  |
| [**consolidateArray**](ArrayApi.md#consolidateArray) | **POST** /arrays/{namespace}/{array}/consolidate |  |
| [**createArray**](ArrayApi.md#createArray) | **POST** /arrays/{namespace}/{array} |  |
| [**deleteArray**](ArrayApi.md#deleteArray) | **DELETE** /arrays/{namespace}/{array} |  |
| [**deregisterArray**](ArrayApi.md#deregisterArray) | **DELETE** /arrays/{namespace}/{array}/deregister |  |
| [**getActivityLogById**](ArrayApi.md#getActivityLogById) | **GET** /arrays/{namespace}/{array}/activity/{id} |  |
| [**getAllArrayMetadata**](ArrayApi.md#getAllArrayMetadata) | **GET** /arrays |  |
| [**getArray**](ArrayApi.md#getArray) | **GET** /arrays/{namespace}/{array} |  |
| [**getArrayMaxBufferSizes**](ArrayApi.md#getArrayMaxBufferSizes) | **GET** /arrays/{namespace}/{array}/max_buffer_sizes |  |
| [**getArrayMetaDataJson**](ArrayApi.md#getArrayMetaDataJson) | **GET** /arrays/{namespace}/{array}/metadata_json |  |
| [**getArrayMetadata**](ArrayApi.md#getArrayMetadata) | **GET** /arrays/{namespace}/{array}/metadata |  |
| [**getArrayMetadataCapnp**](ArrayApi.md#getArrayMetadataCapnp) | **GET** /arrays/{namespace}/{array}/array_metadata |  |
| [**getArrayNonEmptyDomain**](ArrayApi.md#getArrayNonEmptyDomain) | **GET** /arrays/{namespace}/{array}/non_empty_domain |  |
| [**getArrayNonEmptyDomainJson**](ArrayApi.md#getArrayNonEmptyDomainJson) | **GET** /arrays/{namespace}/{array}/non_empty_domain_json |  |
| [**getArraySampleData**](ArrayApi.md#getArraySampleData) | **GET** /arrays/{namespace}/{array}/sample |  |
| [**getArraySharingPolicies**](ArrayApi.md#getArraySharingPolicies) | **GET** /arrays/{namespace}/{array}/share |  |
| [**getArraysInNamespace**](ArrayApi.md#getArraysInNamespace) | **GET** /arrays/{namespace} |  |
| [**getFragmentEndTimestamp**](ArrayApi.md#getFragmentEndTimestamp) | **GET** /arrays/{namespace}/{array}/fragment_end_timestamp |  |
| [**getLastAccessedArrays**](ArrayApi.md#getLastAccessedArrays) | **GET** /arrays/last_accessed |  |
| [**registerArray**](ArrayApi.md#registerArray) | **POST** /arrays/{namespace}/{array}/register |  |
| [**shareArray**](ArrayApi.md#shareArray) | **PATCH** /arrays/{namespace}/{array}/share |  |
| [**updateArrayMetadata**](ArrayApi.md#updateArrayMetadata) | **PATCH** /arrays/{namespace}/{array}/metadata |  |
| [**updateArrayMetadataCapnp**](ArrayApi.md#updateArrayMetadataCapnp) | **POST** /arrays/{namespace}/{array}/array_metadata |  |
| [**vacuumArray**](ArrayApi.md#vacuumArray) | **POST** /arrays/{namespace}/{array}/vacuum |  |


<a name="arrayActivityLog"></a>
# **arrayActivityLog**
> List&lt;ArrayActivityLog&gt; arrayActivityLog(namespace, array, start, end, eventTypes, taskId, hasTaskId)



get array activity logs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer start = 56; // Integer | Start time of window of fetch logs, unix epoch in seconds (default: seven days ago)
    Integer end = 56; // Integer | End time of window of fetch logs, unix epoch in seconds (default: current utc timestamp)
    String eventTypes = "eventTypes_example"; // String | Event values can be one or more of the following read, write, create, delete, register, deregister, comma separated
    String taskId = "taskId_example"; // String | Array task ID To filter activity to
    Boolean hasTaskId = true; // Boolean | Excludes activity log results that do not contain an array task UUID
    try {
      List<ArrayActivityLog> result = apiInstance.arrayActivityLog(namespace, array, start, end, eventTypes, taskId, hasTaskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arrayActivityLog");
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
| **start** | **Integer**| Start time of window of fetch logs, unix epoch in seconds (default: seven days ago) | [optional] |
| **end** | **Integer**| End time of window of fetch logs, unix epoch in seconds (default: current utc timestamp) | [optional] |
| **eventTypes** | **String**| Event values can be one or more of the following read, write, create, delete, register, deregister, comma separated | [optional] |
| **taskId** | **String**| Array task ID To filter activity to | [optional] |
| **hasTaskId** | **Boolean**| Excludes activity log results that do not contain an array task UUID | [optional] |

### Return type

[**List&lt;ArrayActivityLog&gt;**](ArrayActivityLog.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | log of array activity |  -  |
| **0** | error response |  -  |

<a name="arraysBrowserOwnedGet"></a>
# **arraysBrowserOwnedGet**
> ArrayBrowserData arraysBrowserOwnedGet(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, fileType, excludeFileType, fileProperty)



Fetch a list of all arrays that are owned directly by user or user&#39;s organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    List<String> fileType = Arrays.asList(); // List<String> | file_type to search for, more than one can be included
    List<String> excludeFileType = Arrays.asList(); // List<String> | file_type to exclude matching array in results, more than one can be included
    List<String> fileProperty = Arrays.asList(); // List<String> | file_property key-value pair (comma separated, i.e. key,value) to search for, more than one can be included
    try {
      ArrayBrowserData result = apiInstance.arraysBrowserOwnedGet(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, fileType, excludeFileType, fileProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysBrowserOwnedGet");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **fileType** | [**List&lt;String&gt;**](String.md)| file_type to search for, more than one can be included | [optional] |
| **excludeFileType** | [**List&lt;String&gt;**](String.md)| file_type to exclude matching array in results, more than one can be included | [optional] |
| **fileProperty** | [**List&lt;String&gt;**](String.md)| file_property key-value pair (comma separated, i.e. key,value) to search for, more than one can be included | [optional] |

### Return type

[**ArrayBrowserData**](ArrayBrowserData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of array info that are owned directly by user or user&#39;s organizations |  -  |
| **0** | error response |  -  |

<a name="arraysBrowserOwnedSidebarGet"></a>
# **arraysBrowserOwnedSidebarGet**
> ArrayBrowserSidebar arraysBrowserOwnedSidebarGet()



Fetch a sidebar for arrays that are owned directly by user or user&#39;s organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    try {
      ArrayBrowserSidebar result = apiInstance.arraysBrowserOwnedSidebarGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysBrowserOwnedSidebarGet");
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

[**ArrayBrowserSidebar**](ArrayBrowserSidebar.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of array info that are owned directly by user or user&#39;s organizations |  -  |
| **0** | error response |  -  |

<a name="arraysBrowserPublicGet"></a>
# **arraysBrowserPublicGet**
> ArrayBrowserData arraysBrowserPublicGet(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, fileType, excludeFileType, fileProperty)



Fetch a list of all arrays that have been shared publically

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    List<String> fileType = Arrays.asList(); // List<String> | file_type to search for, more than one can be included
    List<String> excludeFileType = Arrays.asList(); // List<String> | file_type to exclude matching array in results, more than one can be included
    List<String> fileProperty = Arrays.asList(); // List<String> | file_property key-value pair (comma separated, i.e. key,value) to search for, more than one can be included
    try {
      ArrayBrowserData result = apiInstance.arraysBrowserPublicGet(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, fileType, excludeFileType, fileProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysBrowserPublicGet");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **fileType** | [**List&lt;String&gt;**](String.md)| file_type to search for, more than one can be included | [optional] |
| **excludeFileType** | [**List&lt;String&gt;**](String.md)| file_type to exclude matching array in results, more than one can be included | [optional] |
| **fileProperty** | [**List&lt;String&gt;**](String.md)| file_property key-value pair (comma separated, i.e. key,value) to search for, more than one can be included | [optional] |

### Return type

[**ArrayBrowserData**](ArrayBrowserData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of array info that has been shared publically |  -  |
| **0** | error response |  -  |

<a name="arraysBrowserPublicSidebarGet"></a>
# **arraysBrowserPublicSidebarGet**
> ArrayBrowserSidebar arraysBrowserPublicSidebarGet()



Fetch a sidebar of all arrays that have been shared publically

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    try {
      ArrayBrowserSidebar result = apiInstance.arraysBrowserPublicSidebarGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysBrowserPublicSidebarGet");
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

[**ArrayBrowserSidebar**](ArrayBrowserSidebar.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of array info that has been shared publically |  -  |
| **0** | error response |  -  |

<a name="arraysBrowserSharedGet"></a>
# **arraysBrowserSharedGet**
> ArrayBrowserData arraysBrowserSharedGet(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, fileType, excludeFileType, fileProperty, sharedTo)



Fetch a list of all arrays that have been shared with the user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    List<String> fileType = Arrays.asList(); // List<String> | file_type to search for, more than one can be included
    List<String> excludeFileType = Arrays.asList(); // List<String> | file_type to exclude matching array in results, more than one can be included
    List<String> fileProperty = Arrays.asList(); // List<String> | file_property key-value pair (comma separated, i.e. key,value) to search for, more than one can be included
    List<String> sharedTo = Arrays.asList(); // List<String> | namespaces to filter results of where there arrays were shared to
    try {
      ArrayBrowserData result = apiInstance.arraysBrowserSharedGet(page, perPage, search, namespace, orderby, permissions, tag, excludeTag, fileType, excludeFileType, fileProperty, sharedTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysBrowserSharedGet");
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
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **fileType** | [**List&lt;String&gt;**](String.md)| file_type to search for, more than one can be included | [optional] |
| **excludeFileType** | [**List&lt;String&gt;**](String.md)| file_type to exclude matching array in results, more than one can be included | [optional] |
| **fileProperty** | [**List&lt;String&gt;**](String.md)| file_property key-value pair (comma separated, i.e. key,value) to search for, more than one can be included | [optional] |
| **sharedTo** | [**List&lt;String&gt;**](String.md)| namespaces to filter results of where there arrays were shared to | [optional] |

### Return type

[**ArrayBrowserData**](ArrayBrowserData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of array info that has been shared with the user |  -  |
| **0** | error response |  -  |

<a name="arraysBrowserSharedSidebarGet"></a>
# **arraysBrowserSharedSidebarGet**
> ArrayBrowserSidebar arraysBrowserSharedSidebarGet()



Fetch a list of all arrays that have been shared with the user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    try {
      ArrayBrowserSidebar result = apiInstance.arraysBrowserSharedSidebarGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysBrowserSharedSidebarGet");
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

[**ArrayBrowserSidebar**](ArrayBrowserSidebar.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of array info that has been shared with the user |  -  |
| **0** | error response |  -  |

<a name="arraysNamespaceArrayEndTimestampsGet"></a>
# **arraysNamespaceArrayEndTimestampsGet**
> ArrayEndTimestampData arraysNamespaceArrayEndTimestampsGet(namespace, array, page, perPage)



retrieve a list of timestamps from the array fragment info listing in milliseconds, paginated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      ArrayEndTimestampData result = apiInstance.arraysNamespaceArrayEndTimestampsGet(namespace, array, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#arraysNamespaceArrayEndTimestampsGet");
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

<a name="consolidateArray"></a>
# **consolidateArray**
> consolidateArray(namespace, array, tiledbConfig)



consolidate an array at a specified URI

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    TileDBConfig tiledbConfig = new TileDBConfig(); // TileDBConfig | tiledb configuration
    try {
      apiInstance.consolidateArray(namespace, array, tiledbConfig);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#consolidateArray");
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
| **tiledbConfig** | [**TileDBConfig**](TileDBConfig.md)| tiledb configuration | |

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
| **204** | array consolidated successfully |  -  |
| **0** | error response |  -  |

<a name="createArray"></a>
# **createArray**
> createArray(namespace, array, contentType, arraySchema, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME)



create a array schema at a specified URI registered to a group/project

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    String contentType = "application/json"; // String | Content Type of input and return mime
    ArraySchema arraySchema = new ArraySchema(); // ArraySchema | ArraySchema being created
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    try {
      apiInstance.createArray(namespace, array, contentType, arraySchema, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#createArray");
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
| **arraySchema** | [**ArraySchema**](ArraySchema.md)| ArraySchema being created | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |

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
| **204** | schema created successfully |  -  |
| **0** | error response |  -  |

<a name="deleteArray"></a>
# **deleteArray**
> deleteArray(namespace, array, contentType)



delete a array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    String contentType = "application/json"; // String | Content Type of input and return mime
    try {
      apiInstance.deleteArray(namespace, array, contentType);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#deleteArray");
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
| **204** | delete array successful |  -  |
| **0** | error response |  -  |

<a name="deregisterArray"></a>
# **deregisterArray**
> deregisterArray(namespace, array)



deregister a array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      apiInstance.deregisterArray(namespace, array);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#deregisterArray");
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
| **204** | deregistered array successful |  -  |
| **0** | error response |  -  |

<a name="getActivityLogById"></a>
# **getActivityLogById**
> ArrayActivityLog getActivityLogById(namespace, array, id)



get activity log by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    String id = "id_example"; // String | ID of the activity
    try {
      ArrayActivityLog result = apiInstance.getActivityLogById(namespace, array, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getActivityLogById");
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
| **id** | **String**| ID of the activity | |

### Return type

[**ArrayActivityLog**](ArrayActivityLog.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array activity |  -  |
| **0** | error response |  -  |

<a name="getAllArrayMetadata"></a>
# **getAllArrayMetadata**
> List&lt;ArrayInfo&gt; getAllArrayMetadata(publicShare)



get all array metadata user has access to

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String publicShare = "publicShare_example"; // String | Public share values can be one of exclude, only
    try {
      List<ArrayInfo> result = apiInstance.getAllArrayMetadata(publicShare);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getAllArrayMetadata");
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
| **publicShare** | **String**| Public share values can be one of exclude, only | [optional] |

### Return type

[**List&lt;ArrayInfo&gt;**](ArrayInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array metadata for all arrays user has access to |  -  |
| **0** | error response |  -  |

<a name="getArray"></a>
# **getArray**
> ArraySchema getArray(namespace, array, contentType)



get an ArraySchema using a url encoded uri

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    String contentType = "application/json"; // String | Content Type of input and return mime
    try {
      ArraySchema result = apiInstance.getArray(namespace, array, contentType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArray");
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

### Return type

[**ArraySchema**](ArraySchema.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/capnp

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get ArraySchema |  -  |
| **0** | error response |  -  |

<a name="getArrayMaxBufferSizes"></a>
# **getArrayMaxBufferSizes**
> MaxBufferSizes getArrayMaxBufferSizes(namespace, array, subarray, contentType, xPayer)



get the max buffer sizes of an array for a subarray

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    String subarray = "subarray_example"; // String | CSV string of subarray to get max buffer sizes for
    String contentType = "application/json"; // String | Content Type of input and return mime
    String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
    try {
      MaxBufferSizes result = apiInstance.getArrayMaxBufferSizes(namespace, array, subarray, contentType, xPayer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArrayMaxBufferSizes");
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
| **subarray** | **String**| CSV string of subarray to get max buffer sizes for | |
| **contentType** | **String**| Content Type of input and return mime | [default to application/json] |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |

### Return type

[**MaxBufferSizes**](MaxBufferSizes.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get the max buffer sizes of an array for a subarray |  -  |
| **0** | error response |  -  |

<a name="getArrayMetaDataJson"></a>
# **getArrayMetaDataJson**
> Object getArrayMetaDataJson(namespace, array, length, endTimestamp)



get metadata from the array in JSON format

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer length = 56; // Integer | (optional) limit character length of returned values
    Integer endTimestamp = 56; // Integer | Milliseconds since Unix epoch, metadata will use open_at functionality to open array at the specific timestamp
    try {
      Object result = apiInstance.getArrayMetaDataJson(namespace, array, length, endTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArrayMetaDataJson");
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
| **length** | **Integer**| (optional) limit character length of returned values | [optional] |
| **endTimestamp** | **Integer**| Milliseconds since Unix epoch, metadata will use open_at functionality to open array at the specific timestamp | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get array metadata |  -  |
| **0** | error response |  -  |

<a name="getArrayMetadata"></a>
# **getArrayMetadata**
> ArrayInfo getArrayMetadata(namespace, array)



get metadata on an array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      ArrayInfo result = apiInstance.getArrayMetadata(namespace, array);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArrayMetadata");
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

### Return type

[**ArrayInfo**](ArrayInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array metadata for an array |  -  |
| **0** | error response |  -  |

<a name="getArrayMetadataCapnp"></a>
# **getArrayMetadataCapnp**
> ArrayMetadata getArrayMetadataCapnp(namespace, array)



get metadata on an array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      ArrayMetadata result = apiInstance.getArrayMetadataCapnp(namespace, array);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArrayMetadataCapnp");
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

### Return type

[**ArrayMetadata**](ArrayMetadata.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/capnp

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array metadata for an array |  -  |
| **0** | error response |  -  |

<a name="getArrayNonEmptyDomain"></a>
# **getArrayNonEmptyDomain**
> NonEmptyDomain getArrayNonEmptyDomain(namespace, array, contentType, xPayer)



get the non empty domain of an array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    String contentType = "application/json"; // String | Content Type of input and return mime
    String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
    try {
      NonEmptyDomain result = apiInstance.getArrayNonEmptyDomain(namespace, array, contentType, xPayer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArrayNonEmptyDomain");
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

[**NonEmptyDomain**](NonEmptyDomain.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get the non empty domain of an array |  -  |
| **0** | error response |  -  |

<a name="getArrayNonEmptyDomainJson"></a>
# **getArrayNonEmptyDomainJson**
> Object getArrayNonEmptyDomainJson(namespace, array)



get non-empty domain from the array in json format

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      Object result = apiInstance.getArrayNonEmptyDomainJson(namespace, array);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArrayNonEmptyDomainJson");
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

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get array non-empty domaim |  -  |
| **0** | error response |  -  |

<a name="getArraySampleData"></a>
# **getArraySampleData**
> ArraySample getArraySampleData(namespace, array, samples)



get an sample set of data from the array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    BigDecimal samples = new BigDecimal("5.0"); // BigDecimal | Number of sample results to return
    try {
      ArraySample result = apiInstance.getArraySampleData(namespace, array, samples);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArraySampleData");
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
| **samples** | **BigDecimal**| Number of sample results to return | [optional] [default to 5.0] |

### Return type

[**ArraySample**](ArraySample.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | get array sample data |  -  |
| **0** | error response |  -  |

<a name="getArraySharingPolicies"></a>
# **getArraySharingPolicies**
> List&lt;ArraySharing&gt; getArraySharingPolicies(namespace, array)



Get all sharing details of the array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      List<ArraySharing> result = apiInstance.getArraySharingPolicies(namespace, array);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArraySharingPolicies");
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

### Return type

[**List&lt;ArraySharing&gt;**](ArraySharing.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all specific sharing policies |  -  |
| **404** | Array does not exist or user does not have permissions to view array-sharing policies |  -  |
| **0** | error response |  -  |

<a name="getArraysInNamespace"></a>
# **getArraysInNamespace**
> List&lt;ArrayInfo&gt; getArraysInNamespace(namespace)



get metadata on all arrays in a namespace

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    try {
      List<ArrayInfo> result = apiInstance.getArraysInNamespace(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getArraysInNamespace");
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

### Return type

[**List&lt;ArrayInfo&gt;**](ArrayInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array metadata for all arrays in a namespace |  -  |
| **0** | error response |  -  |

<a name="getFragmentEndTimestamp"></a>
# **getFragmentEndTimestamp**
> Integer getFragmentEndTimestamp(namespace, array, endTimestamp)



Get fragment end_timestamp on an array, will search for the closest end_timestamp to the timestamp asked

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer endTimestamp = 56; // Integer | Milliseconds since Unix epoch
    try {
      Integer result = apiInstance.getFragmentEndTimestamp(namespace, array, endTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getFragmentEndTimestamp");
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
| **endTimestamp** | **Integer**| Milliseconds since Unix epoch | [optional] |

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | fragment end_timestamp on an array |  -  |
| **0** | error response |  -  |

<a name="getLastAccessedArrays"></a>
# **getLastAccessedArrays**
> List&lt;LastAccessedArray&gt; getLastAccessedArrays()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    try {
      List<LastAccessedArray> result = apiInstance.getLastAccessedArrays();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#getLastAccessedArrays");
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

[**List&lt;LastAccessedArray&gt;**](LastAccessedArray.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | gets last accessed arrays |  -  |
| **0** | error response |  -  |

<a name="registerArray"></a>
# **registerArray**
> ArrayInfo registerArray(namespace, array, arrayMetadata)



register an array at a specified URI registered to the given namespace

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    ArrayInfoUpdate arrayMetadata = new ArrayInfoUpdate(); // ArrayInfoUpdate | metadata associated with array
    try {
      ArrayInfo result = apiInstance.registerArray(namespace, array, arrayMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#registerArray");
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
| **arrayMetadata** | [**ArrayInfoUpdate**](ArrayInfoUpdate.md)| metadata associated with array | |

### Return type

[**ArrayInfo**](ArrayInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array registered successfully |  -  |
| **0** | error response |  -  |

<a name="shareArray"></a>
# **shareArray**
> shareArray(namespace, array, arraySharing)



Share an array with a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    ArraySharing arraySharing = new ArraySharing(); // ArraySharing | Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it's likely the array will not be shared with the namespace at all.
    try {
      apiInstance.shareArray(namespace, array, arraySharing);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#shareArray");
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
| **arraySharing** | [**ArraySharing**](ArraySharing.md)| Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it&#39;s likely the array will not be shared with the namespace at all. | |

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
| **204** | Array shared successfully |  -  |
| **404** | Array does not exist or user does not have permissions to share array |  -  |
| **0** | error response |  -  |

<a name="updateArrayMetadata"></a>
# **updateArrayMetadata**
> updateArrayMetadata(namespace, array, arrayMetadata)



update metadata on an array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    ArrayInfoUpdate arrayMetadata = new ArrayInfoUpdate(); // ArrayInfoUpdate | array metadata to update
    try {
      apiInstance.updateArrayMetadata(namespace, array, arrayMetadata);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#updateArrayMetadata");
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
| **arrayMetadata** | [**ArrayInfoUpdate**](ArrayInfoUpdate.md)| array metadata to update | |

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
| **204** | array metadata updated successfully |  -  |
| **0** | error response |  -  |

<a name="updateArrayMetadataCapnp"></a>
# **updateArrayMetadataCapnp**
> updateArrayMetadataCapnp(namespace, array, arrayMetadataEntries)



update metadata on an array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    ArrayMetadata arrayMetadataEntries = new ArrayMetadata(); // ArrayMetadata | List of metadata entries
    try {
      apiInstance.updateArrayMetadataCapnp(namespace, array, arrayMetadataEntries);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#updateArrayMetadataCapnp");
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
| **arrayMetadataEntries** | [**ArrayMetadata**](ArrayMetadata.md)| List of metadata entries | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/capnp
 - **Accept**: application/json, application/capnp

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | array metadata updated successfully |  -  |
| **0** | error response |  -  |

<a name="vacuumArray"></a>
# **vacuumArray**
> vacuumArray(namespace, array, tiledbConfig)



vacuum an array at a specified URI

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ArrayApi;

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

    ArrayApi apiInstance = new ArrayApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    TileDBConfig tiledbConfig = new TileDBConfig(); // TileDBConfig | tiledb configuration
    try {
      apiInstance.vacuumArray(namespace, array, tiledbConfig);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArrayApi#vacuumArray");
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
| **tiledbConfig** | [**TileDBConfig**](TileDBConfig.md)| tiledb configuration | |

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
| **204** | array vacuumed successfully |  -  |
| **0** | error response |  -  |

