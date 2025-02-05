# UdfApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUDFInfo**](UdfApi.md#deleteUDFInfo) | **DELETE** /udf/{namespace}/{name} |  |
| [**getUDFInfo**](UdfApi.md#getUDFInfo) | **GET** /udf/{namespace}/{name} |  |
| [**getUDFInfoSharingPolicies**](UdfApi.md#getUDFInfoSharingPolicies) | **GET** /udf/{namespace}/{name}/share |  |
| [**handleCopyUDF**](UdfApi.md#handleCopyUDF) | **POST** /udf/{namespace}/{name}/copy |  |
| [**registerUDFInfo**](UdfApi.md#registerUDFInfo) | **POST** /udf/{namespace}/{name} |  |
| [**shareUDFInfo**](UdfApi.md#shareUDFInfo) | **PATCH** /udf/{namespace}/{name}/share |  |
| [**submitGenericUDF**](UdfApi.md#submitGenericUDF) | **POST** /udfs/generic/{namespace} |  |
| [**submitMultiArrayUDF**](UdfApi.md#submitMultiArrayUDF) | **POST** /udfs/arrays/{namespace} |  |
| [**submitUDF**](UdfApi.md#submitUDF) | **POST** /arrays/{namespace}/{array}/udf/submit |  |
| [**udfNamespaceArrayEndTimestampsGet**](UdfApi.md#udfNamespaceArrayEndTimestampsGet) | **GET** /udf/{namespace}/{array}/end_timestamps |  |
| [**updateUDFInfo**](UdfApi.md#updateUDFInfo) | **PATCH** /udf/{namespace}/{name} |  |


<a name="deleteUDFInfo"></a>
# **deleteUDFInfo**
> deleteUDFInfo(namespace, name)



delete a registered UDF -- this will remove all sharing and can not be undone

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name to register UDF under
    try {
      apiInstance.deleteUDFInfo(namespace, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#deleteUDFInfo");
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
| **name** | **String**| name to register UDF under | |

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
| **204** | UDF deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getUDFInfo"></a>
# **getUDFInfo**
> UDFInfo getUDFInfo(namespace, name)



get a specific UDF in the given namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name to register UDF under
    try {
      UDFInfo result = apiInstance.getUDFInfo(namespace, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#getUDFInfo");
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
| **name** | **String**| name to register UDF under | |

### Return type

[**UDFInfo**](UDFInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UDFInfo was retrieved successfully |  -  |
| **404** | UDF not found |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getUDFInfoSharingPolicies"></a>
# **getUDFInfoSharingPolicies**
> List&lt;UDFSharing&gt; getUDFInfoSharingPolicies(namespace, name)



Get all sharing details of the UDF

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name of UDFInfo
    try {
      List<UDFSharing> result = apiInstance.getUDFInfoSharingPolicies(namespace, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#getUDFInfoSharingPolicies");
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
| **name** | **String**| name of UDFInfo | |

### Return type

[**List&lt;UDFSharing&gt;**](UDFSharing.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all specific sharing policies |  -  |
| **404** | UDF does not exist or user does not have permissions to view array-sharing policies |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="handleCopyUDF"></a>
# **handleCopyUDF**
> UDFCopied handleCopyUDF(namespace, name, udFCopy, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, endTimestamp)



Copy a tiledb udf at the specified location

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name of UDFInfo
    UDFCopy udFCopy = new UDFCopy(); // UDFCopy | Input/Output information to copy a UDF
    String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = "X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME_example"; // String | Optional registered access credentials to use for creation
    Integer endTimestamp = 56; // Integer | Milliseconds since Unix epoch
    try {
      UDFCopied result = apiInstance.handleCopyUDF(namespace, name, udFCopy, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, endTimestamp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#handleCopyUDF");
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
| **name** | **String**| name of UDFInfo | |
| **udFCopy** | [**UDFCopy**](UDFCopy.md)| Input/Output information to copy a UDF | |
| **X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME** | **String**| Optional registered access credentials to use for creation | [optional] |
| **endTimestamp** | **Integer**| Milliseconds since Unix epoch | [optional] |

### Return type

[**UDFCopied**](UDFCopied.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | UDF copied |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="registerUDFInfo"></a>
# **registerUDFInfo**
> registerUDFInfo(namespace, name, udf)



register a UDF in the given namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name to register UDF under
    UDFInfoUpdate udf = new UDFInfoUpdate(); // UDFInfoUpdate | UDF to register
    try {
      apiInstance.registerUDFInfo(namespace, name, udf);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#registerUDFInfo");
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
| **name** | **String**| name to register UDF under | |
| **udf** | [**UDFInfoUpdate**](UDFInfoUpdate.md)| UDF to register | |

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
| **204** | UDF registered successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="shareUDFInfo"></a>
# **shareUDFInfo**
> shareUDFInfo(namespace, name, udfSharing)



Share a UDF with a user

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name of UDFInfo
    UDFSharing udfSharing = new UDFSharing(); // UDFSharing | Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it's likely the UDF will not be shared with the namespace at all.
    try {
      apiInstance.shareUDFInfo(namespace, name, udfSharing);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#shareUDFInfo");
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
| **name** | **String**| name of UDFInfo | |
| **udfSharing** | [**UDFSharing**](UDFSharing.md)| Namespace and list of permissions to share with. An empty list of permissions will remove the namespace; if permissions already exist they will be deleted then new ones added. In the event of a failure, the new policies will be rolled back to prevent partial policies, and it&#39;s likely the UDF will not be shared with the namespace at all. | |

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
| **204** | UDF shared successfully |  -  |
| **404** | UDF does not exist or user does not have permissions to share UDF |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="submitGenericUDF"></a>
# **submitGenericUDF**
> File submitGenericUDF(namespace, udf, acceptEncoding)



submit a generic UDF in the given namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    GenericUDF udf = new GenericUDF(); // GenericUDF | UDF to run
    String acceptEncoding = "acceptEncoding_example"; // String | Encoding to use
    try {
      File result = apiInstance.submitGenericUDF(namespace, udf, acceptEncoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#submitGenericUDF");
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
| **udf** | [**GenericUDF**](GenericUDF.md)| UDF to run | |
| **acceptEncoding** | **String**| Encoding to use | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UDF completed and the UDF-type specific result is returned |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |

<a name="submitMultiArrayUDF"></a>
# **submitMultiArrayUDF**
> File submitMultiArrayUDF(namespace, udf, acceptEncoding)



submit a multi-array UDF in the given namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    MultiArrayUDF udf = new MultiArrayUDF(); // MultiArrayUDF | UDF to run
    String acceptEncoding = "acceptEncoding_example"; // String | Encoding to use
    try {
      File result = apiInstance.submitMultiArrayUDF(namespace, udf, acceptEncoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#submitMultiArrayUDF");
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
| **udf** | [**MultiArrayUDF**](MultiArrayUDF.md)| UDF to run | |
| **acceptEncoding** | **String**| Encoding to use | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UDF completed and the UDF-type specific result is returned |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |

<a name="submitUDF"></a>
# **submitUDF**
> File submitUDF(namespace, array, udf, xPayer, acceptEncoding, v2)



send a UDF to run against a specified array/URI registered to a group/project

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    MultiArrayUDF udf = new MultiArrayUDF(); // MultiArrayUDF | UDF to run
    String xPayer = "xPayer_example"; // String | Name of organization or user who should be charged for this request
    String acceptEncoding = "acceptEncoding_example"; // String | Encoding to use
    String v2 = "v2_example"; // String | flag to indicate if v2 array UDFs should be used, currently in beta testing. Setting any value will enable v2 array UDFs.
    try {
      File result = apiInstance.submitUDF(namespace, array, udf, xPayer, acceptEncoding, v2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#submitUDF");
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
| **udf** | [**MultiArrayUDF**](MultiArrayUDF.md)| UDF to run | |
| **xPayer** | **String**| Name of organization or user who should be charged for this request | [optional] |
| **acceptEncoding** | **String**| Encoding to use | [optional] |
| **v2** | **String**| flag to indicate if v2 array UDFs should be used, currently in beta testing. Setting any value will enable v2 array UDFs. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UDF completed and the UDF-type specific result is returned |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  |

<a name="udfNamespaceArrayEndTimestampsGet"></a>
# **udfNamespaceArrayEndTimestampsGet**
> ArrayEndTimestampData udfNamespaceArrayEndTimestampsGet(namespace, array, page, perPage)



retrieve a list of timestamps from the array fragment info listing in milliseconds, paginated

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String array = "array_example"; // String | name/uri of array that is url-encoded
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    try {
      ArrayEndTimestampData result = apiInstance.udfNamespaceArrayEndTimestampsGet(namespace, array, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#udfNamespaceArrayEndTimestampsGet");
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
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="updateUDFInfo"></a>
# **updateUDFInfo**
> updateUDFInfo(namespace, name, udf)



update an existing registered UDF in the given namespace

### Example
```java
// Import classes:
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.auth.*;
import io.tiledb.cloud.rest_api.models.*;
import io.tiledb.cloud.rest_api.UdfApi;

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

    UdfApi apiInstance = new UdfApi(defaultClient);
    String namespace = "namespace_example"; // String | namespace array is in (an organization name or user's username)
    String name = "name_example"; // String | name to register UDF under
    UDFInfoUpdate udf = new UDFInfoUpdate(); // UDFInfoUpdate | UDF to update
    try {
      apiInstance.updateUDFInfo(namespace, name, udf);
    } catch (ApiException e) {
      System.err.println("Exception when calling UdfApi#updateUDFInfo");
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
| **name** | **String**| name to register UDF under | |
| **udf** | [**UDFInfoUpdate**](UDFInfoUpdate.md)| UDF to update | |

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
| **204** | UDF updated successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

