# GroupsApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeGroupContents**](GroupsApi.md#changeGroupContents) | **POST** /groups/{group_namespace}/{group_name}/contents |  |
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /groups/{namespace}/create |  |
| [**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{group_namespace}/{group_name} |  |
| [**getGroup**](GroupsApi.md#getGroup) | **GET** /groups/{group_namespace}/{group_name} |  |
| [**getGroupActivity**](GroupsApi.md#getGroupActivity) | **GET** /groups/{group_namespace}/{group_name}/content_activity |  |
| [**getGroupContents**](GroupsApi.md#getGroupContents) | **GET** /groups/{group_namespace}/{group_name}/contents |  |
| [**getGroupSharingPolicies**](GroupsApi.md#getGroupSharingPolicies) | **GET** /groups/{group_namespace}/{group_name}/share |  |
| [**groupsBrowserOwnedFiltersGet**](GroupsApi.md#groupsBrowserOwnedFiltersGet) | **GET** /groups/browser/owned/filters |  |
| [**groupsBrowserPublicFiltersGet**](GroupsApi.md#groupsBrowserPublicFiltersGet) | **GET** /groups/browser/public/filters |  |
| [**groupsBrowserSharedFiltersGet**](GroupsApi.md#groupsBrowserSharedFiltersGet) | **GET** /groups/browser/shared/filters |  |
| [**groupsGroupNamespaceGroupNameContentsFiltersGet**](GroupsApi.md#groupsGroupNamespaceGroupNameContentsFiltersGet) | **GET** /groups/{group_namespace}/{group_name}/contents/filters |  |
| [**listOwnedGroups**](GroupsApi.md#listOwnedGroups) | **GET** /groups/browser/owned |  |
| [**listPublicGroups**](GroupsApi.md#listPublicGroups) | **GET** /groups/browser/public |  |
| [**listSharedGroups**](GroupsApi.md#listSharedGroups) | **GET** /groups/browser/shared |  |
| [**registerGroup**](GroupsApi.md#registerGroup) | **POST** /groups/{namespace}/{array}/register |  |
| [**shareGroup**](GroupsApi.md#shareGroup) | **PATCH** /groups/{group_namespace}/{group_name}/share |  |
| [**updateGroup**](GroupsApi.md#updateGroup) | **PATCH** /groups/{group_namespace}/{group_name} |  |


<a name="changeGroupContents"></a>
# **changeGroupContents**
> changeGroupContents(groupNamespace, groupName, groupChanges)



Changes the contents of the group by adding/removing members.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    GroupChanges groupChanges = new GroupChanges(); // GroupChanges | 
    try {
      apiInstance.changeGroupContents(groupNamespace, groupName, groupChanges);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#changeGroupContents");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |
| **groupChanges** | [**GroupChanges**](GroupChanges.md)|  | [optional] |

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
| **204** | all changes applied successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="createGroup"></a>
# **createGroup**
> createGroup(namespace, groupCreate)



Creates a new group in the namespace.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace of the group
    GroupCreate groupCreate = new GroupCreate(); // GroupCreate | 
    try {
      apiInstance.createGroup(namespace, groupCreate);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
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
| **namespace** | **String**| The namespace of the group | |
| **groupCreate** | [**GroupCreate**](GroupCreate.md)|  | [optional] |

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
| **204** | group created successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupNamespace, groupName)



Deletes the group. The assets are not deleted nor are not relocated to any other group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      apiInstance.deleteGroup(groupNamespace, groupName);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroup");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |

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
| **204** | group deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getGroup"></a>
# **getGroup**
> GroupInfo getGroup(groupNamespace, groupName)



Returns the the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      GroupInfo result = apiInstance.getGroup(groupNamespace, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroup");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |

### Return type

[**GroupInfo**](GroupInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group metadata |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getGroupActivity"></a>
# **getGroupActivity**
> GroupContentActivityResponse getGroupActivity(groupNamespace, groupName, page, perPage)



Returns the activity of group content

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      GroupContentActivityResponse result = apiInstance.getGroupActivity(groupNamespace, groupName, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupActivity");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**GroupContentActivityResponse**](GroupContentActivityResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Activity logs of group contents along with the pagination metadata |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getGroupContents"></a>
# **getGroupContents**
> GroupContents getGroupContents(groupNamespace, groupName, page, perPage, namespace, search, orderby, tag, excludeTag, memberType, excludeMemberType)



Returns the contents of the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    Integer page = 56; // Integer | pagination offset for assets
    Integer perPage = 56; // Integer | pagination limit for assets
    String namespace = "namespace_example"; // String | namespace to search for
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    List<String> memberType = Arrays.asList(); // List<String> | member type to search for, more than one can be included
    List<String> excludeMemberType = Arrays.asList(); // List<String> | member type to exclude matching groups in results, more than one can be included
    try {
      GroupContents result = apiInstance.getGroupContents(groupNamespace, groupName, page, perPage, namespace, search, orderby, tag, excludeTag, memberType, excludeMemberType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupContents");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |
| **page** | **Integer**| pagination offset for assets | [optional] |
| **perPage** | **Integer**| pagination limit for assets | [optional] |
| **namespace** | **String**| namespace to search for | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **memberType** | [**List&lt;String&gt;**](String.md)| member type to search for, more than one can be included | [optional] |
| **excludeMemberType** | [**List&lt;String&gt;**](String.md)| member type to exclude matching groups in results, more than one can be included | [optional] |

### Return type

[**GroupContents**](GroupContents.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getGroupSharingPolicies"></a>
# **getGroupSharingPolicies**
> List&lt;GroupSharing&gt; getGroupSharingPolicies(groupNamespace, groupName)



Get all sharing details of the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      List<GroupSharing> result = apiInstance.getGroupSharingPolicies(groupNamespace, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupSharingPolicies");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |

### Return type

[**List&lt;GroupSharing&gt;**](GroupSharing.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all specific sharing policies |  -  |
| **404** | Group does not exist or user does not have permissions to view group-sharing policies |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="groupsBrowserOwnedFiltersGet"></a>
# **groupsBrowserOwnedFiltersGet**
> GroupBrowserFilterData groupsBrowserOwnedFiltersGet(namespace)



Fetch data to initialize filters for the groups browser

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace
    try {
      GroupBrowserFilterData result = apiInstance.groupsBrowserOwnedFiltersGet(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsBrowserOwnedFiltersGet");
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
| **namespace** | **String**| namespace | [optional] |

### Return type

[**GroupBrowserFilterData**](GroupBrowserFilterData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="groupsBrowserPublicFiltersGet"></a>
# **groupsBrowserPublicFiltersGet**
> GroupBrowserFilterData groupsBrowserPublicFiltersGet()



Fetch data to initialize filters for the groups browser

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    try {
      GroupBrowserFilterData result = apiInstance.groupsBrowserPublicFiltersGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsBrowserPublicFiltersGet");
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

[**GroupBrowserFilterData**](GroupBrowserFilterData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="groupsBrowserSharedFiltersGet"></a>
# **groupsBrowserSharedFiltersGet**
> GroupBrowserFilterData groupsBrowserSharedFiltersGet(namespace)



Fetch data to initialize filters for the groups browser

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace
    try {
      GroupBrowserFilterData result = apiInstance.groupsBrowserSharedFiltersGet(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsBrowserSharedFiltersGet");
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
| **namespace** | **String**| namespace | [optional] |

### Return type

[**GroupBrowserFilterData**](GroupBrowserFilterData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="groupsGroupNamespaceGroupNameContentsFiltersGet"></a>
# **groupsGroupNamespaceGroupNameContentsFiltersGet**
> GroupContentsFilterData groupsGroupNamespaceGroupNameContentsFiltersGet(groupNamespace, groupName)



Fetch data to initialize filters for the group contents

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    try {
      GroupContentsFilterData result = apiInstance.groupsGroupNamespaceGroupNameContentsFiltersGet(groupNamespace, groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsGroupNamespaceGroupNameContentsFiltersGet");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |

### Return type

[**GroupContentsFilterData**](GroupContentsFilterData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Filter data |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listOwnedGroups"></a>
# **listOwnedGroups**
> GroupBrowserData listOwnedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata)



Returns one page of owned groups.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String groupType = "groupType_example"; // String | filter by a specific group type
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
    String parent = "parent_example"; // String | search only the children of the groups with this uuid
    Boolean withMetadata = true; // Boolean | include the metadata of the groups
    try {
      GroupBrowserData result = apiInstance.listOwnedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listOwnedGroups");
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
| **groupType** | **String**| filter by a specific group type | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **flat** | **Boolean**| if true, ignores the nesting of groups and searches all of them | [optional] |
| **parent** | **String**| search only the children of the groups with this uuid | [optional] |
| **withMetadata** | **Boolean**| include the metadata of the groups | [optional] |

### Return type

[**GroupBrowserData**](GroupBrowserData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listPublicGroups"></a>
# **listPublicGroups**
> GroupBrowserData listPublicGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata)



Returns one page of public groups.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String groupType = "groupType_example"; // String | filter by a specific group type
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
    String parent = "parent_example"; // String | search only the children of the groups with this uuid
    Boolean withMetadata = true; // Boolean | include the metadata of the groups
    try {
      GroupBrowserData result = apiInstance.listPublicGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, withMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listPublicGroups");
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
| **groupType** | **String**| filter by a specific group type | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **flat** | **Boolean**| if true, ignores the nesting of groups and searches all of them | [optional] |
| **parent** | **String**| search only the children of the groups with this uuid | [optional] |
| **withMetadata** | **Boolean**| include the metadata of the groups | [optional] |

### Return type

[**GroupBrowserData**](GroupBrowserData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listSharedGroups"></a>
# **listSharedGroups**
> GroupBrowserData listSharedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, sharedTo, withMetadata)



Returns one page of shared groups.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String groupType = "groupType_example"; // String | filter by a specific group type
    String search = "search_example"; // String | search string that will look at name, namespace or description fields
    String namespace = "namespace_example"; // String | namespace
    String orderby = "orderby_example"; // String | sort by which field valid values include last_accessed, size, name
    String permissions = "permissions_example"; // String | permissions valid values include read, read_write, write, admin
    List<String> tag = Arrays.asList(); // List<String> | tag to search for, more than one can be included
    List<String> excludeTag = Arrays.asList(); // List<String> | tags to exclude matching array in results, more than one can be included
    Boolean flat = true; // Boolean | if true, ignores the nesting of groups and searches all of them
    String parent = "parent_example"; // String | search only the children of the groups with this uuid
    List<String> sharedTo = Arrays.asList(); // List<String> | namespaces to filter results of where there groups were shared to
    Boolean withMetadata = true; // Boolean | include the metadata of the groups
    try {
      GroupBrowserData result = apiInstance.listSharedGroups(page, perPage, groupType, search, namespace, orderby, permissions, tag, excludeTag, flat, parent, sharedTo, withMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#listSharedGroups");
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
| **groupType** | **String**| filter by a specific group type | [optional] |
| **search** | **String**| search string that will look at name, namespace or description fields | [optional] |
| **namespace** | **String**| namespace | [optional] |
| **orderby** | **String**| sort by which field valid values include last_accessed, size, name | [optional] |
| **permissions** | **String**| permissions valid values include read, read_write, write, admin | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| tag to search for, more than one can be included | [optional] |
| **excludeTag** | [**List&lt;String&gt;**](String.md)| tags to exclude matching array in results, more than one can be included | [optional] |
| **flat** | **Boolean**| if true, ignores the nesting of groups and searches all of them | [optional] |
| **parent** | **String**| search only the children of the groups with this uuid | [optional] |
| **sharedTo** | [**List&lt;String&gt;**](String.md)| namespaces to filter results of where there groups were shared to | [optional] |
| **withMetadata** | **Boolean**| include the metadata of the groups | [optional] |

### Return type

[**GroupBrowserData**](GroupBrowserData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the group contents |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="registerGroup"></a>
# **registerGroup**
> registerGroup(namespace, array, groupRegister)



Registers an existing group in the namespace.

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String namespace = "namespace_example"; // String | The namespace of the group
    String array = "array_example"; // String | The unique name or id of the group
    GroupRegister groupRegister = new GroupRegister(); // GroupRegister | 
    try {
      apiInstance.registerGroup(namespace, array, groupRegister);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#registerGroup");
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
| **namespace** | **String**| The namespace of the group | |
| **array** | **String**| The unique name or id of the group | |
| **groupRegister** | [**GroupRegister**](GroupRegister.md)|  | [optional] |

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
| **204** | group created successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="shareGroup"></a>
# **shareGroup**
> shareGroup(groupNamespace, groupName, groupSharingRequest)



Share a group with a namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    GroupSharingRequest groupSharingRequest = new GroupSharingRequest(); // GroupSharingRequest | Namespace and list of permissions to share with. Sharing is recursive, it is applied to all reachable subgroups and arrays of the group. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it's likely the group will not be shared with the namespace at all.
    try {
      apiInstance.shareGroup(groupNamespace, groupName, groupSharingRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#shareGroup");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |
| **groupSharingRequest** | [**GroupSharingRequest**](GroupSharingRequest.md)| Namespace and list of permissions to share with. Sharing is recursive, it is applied to all reachable subgroups and arrays of the group. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it&#39;s likely the group will not be shared with the namespace at all. | |

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
| **204** | Group shared successfully |  -  |
| **404** | Group does not exist or user does not have permissions to share group |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="updateGroup"></a>
# **updateGroup**
> updateGroup(groupNamespace, groupName, groupUpdate)



Changes attributes of the group

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.GroupsApi;

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

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupNamespace = "groupNamespace_example"; // String | The namespace of the group
    String groupName = "groupName_example"; // String | The unique name or id of the group
    GroupUpdate groupUpdate = new GroupUpdate(); // GroupUpdate | 
    try {
      apiInstance.updateGroup(groupNamespace, groupName, groupUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroup");
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
| **groupNamespace** | **String**| The namespace of the group | |
| **groupName** | **String**| The unique name or id of the group | |
| **groupUpdate** | [**GroupUpdate**](GroupUpdate.md)|  | [optional] |

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
| **204** | attributes changed successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

