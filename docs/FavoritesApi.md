# FavoritesApi

All URIs are relative to */v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addArrayFavorite**](FavoritesApi.md#addArrayFavorite) | **POST** /arrays/favorites/{workspace}/{teamspace}/{name} |  |
| [**addMLModelFavorite**](FavoritesApi.md#addMLModelFavorite) | **POST** /ml_models/favorites/{workspace}/{teamspace}/{name} |  |
| [**addNotebookFavorite**](FavoritesApi.md#addNotebookFavorite) | **POST** /notebooks/favorites/{workspace}/{teamspace}/{name} |  |
| [**addUDFFavorite**](FavoritesApi.md#addUDFFavorite) | **POST** /udfs/favorites/{workspace}/{name} |  |
| [**deleteArrayFavorite**](FavoritesApi.md#deleteArrayFavorite) | **DELETE** /arrays/favorites/{workspace}/{teamspace}/{name} |  |
| [**deleteMLModelFavorite**](FavoritesApi.md#deleteMLModelFavorite) | **DELETE** /ml_models/favorites/{workspace}/{teamspace}/{name} |  |
| [**deleteNotebookFavorite**](FavoritesApi.md#deleteNotebookFavorite) | **DELETE** /notebooks/favorites/{workspace}/{teamspace}/{name} |  |
| [**deleteUDFFavorite**](FavoritesApi.md#deleteUDFFavorite) | **DELETE** /udfs/favorites/{workspace}/{name} |  |
| [**getArrayFavorite**](FavoritesApi.md#getArrayFavorite) | **GET** /arrays/favorites/{workspace}/{teamspace}/{name} |  |
| [**getMLModelFavorite**](FavoritesApi.md#getMLModelFavorite) | **GET** /ml_models/favorites/{workspace}/{teamspace}/{name} |  |
| [**getNotebookFavorite**](FavoritesApi.md#getNotebookFavorite) | **GET** /notebooks/favorites/{workspace}/{teamspace}/{name} |  |
| [**getUDFFavorite**](FavoritesApi.md#getUDFFavorite) | **GET** /udfs/favorites/{workspace}/{name} |  |
| [**listArrayFavorites**](FavoritesApi.md#listArrayFavorites) | **GET** /arrays/favorites |  |
| [**listArrayFavoritesUUIDs**](FavoritesApi.md#listArrayFavoritesUUIDs) | **GET** /arrays/favorites/uuids |  |
| [**listMLModelFavorites**](FavoritesApi.md#listMLModelFavorites) | **GET** /ml_models/favorites |  |
| [**listMLModelFavoritesUUIDs**](FavoritesApi.md#listMLModelFavoritesUUIDs) | **GET** /ml_models/favorites/uuids |  |
| [**listNotebookFavorites**](FavoritesApi.md#listNotebookFavorites) | **GET** /notebooks/favorites |  |
| [**listNotebookFavoritesUUIDs**](FavoritesApi.md#listNotebookFavoritesUUIDs) | **GET** /notebooks/favorites/uuids |  |
| [**listUDFFavorites**](FavoritesApi.md#listUDFFavorites) | **GET** /udfs/favorites |  |
| [**listUDFFavoritesUUIDs**](FavoritesApi.md#listUDFFavoritesUUIDs) | **GET** /udfs/favorites/uuids |  |


<a name="addArrayFavorite"></a>
# **addArrayFavorite**
> addArrayFavorite(workspace, teamspace, name)



Add a new array favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the array
        try {
            apiInstance.addArrayFavorite(workspace, teamspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#addArrayFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the array | |

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
| **204** | Item added to favorites successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="addMLModelFavorite"></a>
# **addMLModelFavorite**
> addMLModelFavorite(workspace, teamspace, name)



Add a new ML model favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the ML model
        try {
            apiInstance.addMLModelFavorite(workspace, teamspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#addMLModelFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the ML model | |

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
| **204** | Item added to favorites successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="addNotebookFavorite"></a>
# **addNotebookFavorite**
> addNotebookFavorite(workspace, teamspace, name)



Add a new notebook favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the notebook
        try {
            apiInstance.addNotebookFavorite(workspace, teamspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#addNotebookFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the notebook | |

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
| **204** | Item added to favorites successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="addUDFFavorite"></a>
# **addUDFFavorite**
> addUDFFavorite(workspace, name)



Add a new UDF favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String name = "name_example"; // String | The name of the UDF
        try {
            apiInstance.addUDFFavorite(workspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#addUDFFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **name** | **String**| The name of the UDF | |

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
| **204** | Item added to favorites successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="deleteArrayFavorite"></a>
# **deleteArrayFavorite**
> deleteArrayFavorite(workspace, teamspace, name)



Delete specific array favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the array
        try {
            apiInstance.deleteArrayFavorite(workspace, teamspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#deleteArrayFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the array | |

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
| **204** | array favorite item deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="deleteMLModelFavorite"></a>
# **deleteMLModelFavorite**
> deleteMLModelFavorite(workspace, teamspace, name)



Delete specific ML model favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the ML model
        try {
            apiInstance.deleteMLModelFavorite(workspace, teamspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#deleteMLModelFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the ML model | |

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
| **204** | ML model favorite item deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="deleteNotebookFavorite"></a>
# **deleteNotebookFavorite**
> deleteNotebookFavorite(workspace, teamspace, name)



Delete specific notebook favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the notebook
        try {
            apiInstance.deleteNotebookFavorite(workspace, teamspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#deleteNotebookFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the notebook | |

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
| **204** | notebook favorite item deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="deleteUDFFavorite"></a>
# **deleteUDFFavorite**
> deleteUDFFavorite(workspace, name)



Delete specific UDF favorite

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String name = "name_example"; // String | The name of the UDF
        try {
            apiInstance.deleteUDFFavorite(workspace, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#deleteUDFFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **name** | **String**| The name of the UDF | |

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
| **204** | UDF favorite item deleted successfully |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getArrayFavorite"></a>
# **getArrayFavorite**
> ArrayFavorite getArrayFavorite(workspace, teamspace, name)



Fetch array favorite of a specific array

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the array
        try {
            ArrayFavorite result = apiInstance.getArrayFavorite(workspace, teamspace, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#getArrayFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the array | |

### Return type

[**ArrayFavorite**](ArrayFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getMLModelFavorite"></a>
# **getMLModelFavorite**
> MLModelFavorite getMLModelFavorite(workspace, teamspace, name)



Fetch ML model favorite of a specific ML model

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the ML model
        try {
            MLModelFavorite result = apiInstance.getMLModelFavorite(workspace, teamspace, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#getMLModelFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the ML model | |

### Return type

[**MLModelFavorite**](MLModelFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getNotebookFavorite"></a>
# **getNotebookFavorite**
> NotebookFavorite getNotebookFavorite(workspace, teamspace, name)



Fetch notebook favorite of a specific notebook

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String teamspace = "teamspace_example"; // String | the teamspace the array belongs to
        String name = "name_example"; // String | The name of the notebook
        try {
            NotebookFavorite result = apiInstance.getNotebookFavorite(workspace, teamspace, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#getNotebookFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **teamspace** | **String**| the teamspace the array belongs to | |
| **name** | **String**| The name of the notebook | |

### Return type

[**NotebookFavorite**](NotebookFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="getUDFFavorite"></a>
# **getUDFFavorite**
> UDFFavorite getUDFFavorite(workspace, name)



Fetch UDF favorite of a specific UDF

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        String workspace = "workspace_example"; // String | the workspace containing the teamspace the array belongs to
        String name = "name_example"; // String | The name of the UDF
        try {
            UDFFavorite result = apiInstance.getUDFFavorite(workspace, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#getUDFFavorite");
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
| **workspace** | **String**| the workspace containing the teamspace the array belongs to | |
| **name** | **String**| The name of the UDF | |

### Return type

[**UDFFavorite**](UDFFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listArrayFavorites"></a>
# **listArrayFavorites**
> ArrayFavoritesData listArrayFavorites(page, perPage)



Fetch a page of array favorites of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        Integer page = 56; // Integer | pagination offset
        Integer perPage = 56; // Integer | pagination limit
        try {
            ArrayFavoritesData result = apiInstance.listArrayFavorites(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listArrayFavorites");
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

### Return type

[**ArrayFavoritesData**](ArrayFavoritesData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available array favorites are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listArrayFavoritesUUIDs"></a>
# **listArrayFavoritesUUIDs**
> List&lt;ArrayFavorite&gt; listArrayFavoritesUUIDs()



Fetch all favorite array uuids of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        try {
            List<ArrayFavorite> result = apiInstance.listArrayFavoritesUUIDs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listArrayFavoritesUUIDs");
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

[**List&lt;ArrayFavorite&gt;**](ArrayFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available favorites array uuids are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listMLModelFavorites"></a>
# **listMLModelFavorites**
> MLModelFavoritesData listMLModelFavorites(page, perPage)



Fetch a page of ML models favorites of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        Integer page = 56; // Integer | pagination offset
        Integer perPage = 56; // Integer | pagination limit
        try {
            MLModelFavoritesData result = apiInstance.listMLModelFavorites(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listMLModelFavorites");
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

### Return type

[**MLModelFavoritesData**](MLModelFavoritesData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available ML models favorites are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listMLModelFavoritesUUIDs"></a>
# **listMLModelFavoritesUUIDs**
> List&lt;MLModelFavorite&gt; listMLModelFavoritesUUIDs()



Fetch all favorite ML models uuids of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        try {
            List<MLModelFavorite> result = apiInstance.listMLModelFavoritesUUIDs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listMLModelFavoritesUUIDs");
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

[**List&lt;MLModelFavorite&gt;**](MLModelFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available favorites ML model uuids are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listNotebookFavorites"></a>
# **listNotebookFavorites**
> NotebookFavoritesData listNotebookFavorites(isDashboard, page, perPage)



Fetch a page of notebook favorites of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        Boolean isDashboard = true; // Boolean | return only dashboards
        Integer page = 56; // Integer | pagination offset
        Integer perPage = 56; // Integer | pagination limit
        try {
            NotebookFavoritesData result = apiInstance.listNotebookFavorites(isDashboard, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listNotebookFavorites");
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
| **isDashboard** | **Boolean**| return only dashboards | [optional] |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |

### Return type

[**NotebookFavoritesData**](NotebookFavoritesData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available notebook favorites are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listNotebookFavoritesUUIDs"></a>
# **listNotebookFavoritesUUIDs**
> List&lt;NotebookFavorite&gt; listNotebookFavoritesUUIDs()



Fetch all favorite notebook uuids of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        try {
            List<NotebookFavorite> result = apiInstance.listNotebookFavoritesUUIDs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listNotebookFavoritesUUIDs");
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

[**List&lt;NotebookFavorite&gt;**](NotebookFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available favorites notebook uuids are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listUDFFavorites"></a>
# **listUDFFavorites**
> UDFFavoritesData listUDFFavorites(page, perPage)



Fetch a page of UDF favorites of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        Integer page = 56; // Integer | pagination offset
        Integer perPage = 56; // Integer | pagination limit
        try {
            UDFFavoritesData result = apiInstance.listUDFFavorites(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listUDFFavorites");
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

### Return type

[**UDFFavoritesData**](UDFFavoritesData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available UDF favorites are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

<a name="listUDFFavoritesUUIDs"></a>
# **listUDFFavoritesUUIDs**
> List&lt;UDFFavorite&gt; listUDFFavoritesUUIDs()



Fetch all favorite UDF uuids of connected user

### Example

```java
// Import classes:

import org.openapitools.client.rest_api.ApiClient;
import org.openapitools.client.rest_api.ApiException;
import org.openapitools.client.rest_api.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.rest_api.api.FavoritesApi;

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

        FavoritesApi apiInstance = new FavoritesApi(defaultClient);
        try {
            List<UDFFavorite> result = apiInstance.listUDFFavoritesUUIDs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FavoritesApi#listUDFFavoritesUUIDs");
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

[**List&lt;UDFFavorite&gt;**](UDFFavorite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available favorites UDF uuids are returned |  -  |
| **502** | Bad Gateway |  -  |
| **0** | error response |  -  |

