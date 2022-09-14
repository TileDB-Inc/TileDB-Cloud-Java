# InvitationApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptInvitation**](InvitationApi.md#acceptInvitation) | **POST** /invitations/{invitation} |  |
| [**cancelJoinOrganization**](InvitationApi.md#cancelJoinOrganization) | **DELETE** /invitations/{invitation}/{organization}/join |  |
| [**cancelShareArrayByInvite**](InvitationApi.md#cancelShareArrayByInvite) | **DELETE** /invitations/{invitation}/{namespace}/{array}/share |  |
| [**fetchInvitations**](InvitationApi.md#fetchInvitations) | **GET** /invitations |  |
| [**joinOrganization**](InvitationApi.md#joinOrganization) | **POST** /invitations/{organization}/join |  |
| [**shareArrayByInvite**](InvitationApi.md#shareArrayByInvite) | **POST** /invitations/{namespace}/{array}/share |  |


<a name="acceptInvitation"></a>
# **acceptInvitation**
> acceptInvitation(invitation)



Accepts invitation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String invitation = "invitation_example"; // String | the ID of invitation about to be accepted
    try {
      apiInstance.acceptInvitation(invitation);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#acceptInvitation");
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
| **invitation** | **String**| the ID of invitation about to be accepted | |

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
| **204** | Invitation was accepted successfully |  -  |
| **404** | Could not find invitation identifier |  -  |
| **0** | error response |  -  |

<a name="cancelJoinOrganization"></a>
# **cancelJoinOrganization**
> cancelJoinOrganization(invitation, organization)



Cancels join organization invitation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String invitation = "invitation_example"; // String | the ID of invitation about to be cancelled
    String organization = "organization_example"; // String | name or UUID of organization
    try {
      apiInstance.cancelJoinOrganization(invitation, organization);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#cancelJoinOrganization");
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
| **invitation** | **String**| the ID of invitation about to be cancelled | |
| **organization** | **String**| name or UUID of organization | |

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
| **204** | Invitation cancelled successfully |  -  |
| **404** | No invitation was found to cancel |  -  |
| **0** | error response |  -  |

<a name="cancelShareArrayByInvite"></a>
# **cancelShareArrayByInvite**
> cancelShareArrayByInvite(namespace, invitation, array)



Cancels array sharing invitation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String invitation = "invitation_example"; // String | the ID of invitation about to be cancelled
    String array = "array_example"; // String | name/uri of array that is url-encoded
    try {
      apiInstance.cancelShareArrayByInvite(namespace, invitation, array);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#cancelShareArrayByInvite");
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
| **invitation** | **String**| the ID of invitation about to be cancelled | |
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
| **204** | Invitation cancelled successfully |  -  |
| **404** | No invitation was found to cancel |  -  |
| **0** | error response |  -  |

<a name="fetchInvitations"></a>
# **fetchInvitations**
> InvitationData fetchInvitations(organization, array, start, end, page, perPage, type, status, orderby)



Fetch a list of invitations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String organization = "organization_example"; // String | name or ID of organization to filter
    String array = "array_example"; // String | name/uri of array that is url-encoded to filter
    Integer start = 56; // Integer | start time for tasks to filter by
    Integer end = 56; // Integer | end time for tasks to filter by
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    String type = "type_example"; // String | invitation type, \"ARRAY_SHARE\", \"JOIN_ORGANIZATION\"
    String status = "status_example"; // String | Filter to only return \"PENDING\", \"ACCEPTED\"
    String orderby = "orderby_example"; // String | sort by which field valid values include timestamp, array_name, organization_name
    try {
      InvitationData result = apiInstance.fetchInvitations(organization, array, start, end, page, perPage, type, status, orderby);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#fetchInvitations");
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
| **organization** | **String**| name or ID of organization to filter | [optional] |
| **array** | **String**| name/uri of array that is url-encoded to filter | [optional] |
| **start** | **Integer**| start time for tasks to filter by | [optional] |
| **end** | **Integer**| end time for tasks to filter by | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **type** | **String**| invitation type, \&quot;ARRAY_SHARE\&quot;, \&quot;JOIN_ORGANIZATION\&quot; | [optional] |
| **status** | **String**| Filter to only return \&quot;PENDING\&quot;, \&quot;ACCEPTED\&quot; | [optional] |
| **orderby** | **String**| sort by which field valid values include timestamp, array_name, organization_name | [optional] |

### Return type

[**InvitationData**](InvitationData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of invitations and pagination metadata |  -  |
| **0** | error response |  -  |

<a name="joinOrganization"></a>
# **joinOrganization**
> joinOrganization(organization, emailInvite)



Sends email to multiple recipients with joining information regarding an organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String organization = "organization_example"; // String | name or UUID of organization
    InvitationOrganizationJoinEmail emailInvite = new InvitationOrganizationJoinEmail(); // InvitationOrganizationJoinEmail | list of email recipients
    try {
      apiInstance.joinOrganization(organization, emailInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#joinOrganization");
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
| **organization** | **String**| name or UUID of organization | |
| **emailInvite** | [**InvitationOrganizationJoinEmail**](InvitationOrganizationJoinEmail.md)| list of email recipients | |

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
| **204** | Email sent successfully to user for email confirmation link |  -  |
| **404** | Could not reach one or more recipients |  -  |
| **0** | error response |  -  |

<a name="shareArrayByInvite"></a>
# **shareArrayByInvite**
> shareArrayByInvite(namespace, array, emailInvite)



Sends email to multiple recipients with sharing information regarding an array

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

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

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    InvitationArrayShareEmail emailInvite = new InvitationArrayShareEmail(); // InvitationArrayShareEmail | list of email recipients
    try {
      apiInstance.shareArrayByInvite(namespace, array, emailInvite);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#shareArrayByInvite");
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
| **emailInvite** | [**InvitationArrayShareEmail**](InvitationArrayShareEmail.md)| list of email recipients | |

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
| **204** | Email sent successfully to user for email confirmation link |  -  |
| **404** | Could not reach one or more recipients |  -  |
| **0** | error response |  -  |

