# AssetsApi

All URIs are relative to *https://api.tiledb.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssetMetadata**](AssetsApi.md#createAssetMetadata) | **POST** /assets/item/{workspace}/{teamspace}/{asset}/metadata | Create asset&#39;s pair metadata |
| [**deleteAssetMetadata**](AssetsApi.md#deleteAssetMetadata) | **DELETE** /actions/assets/{workspace}/{teamspace}/{asset_id}/metadata/bulk_delete | Delete the given asset&#39;s metadata pairs |
| [**getAsset**](AssetsApi.md#getAsset) | **GET** /assets/item/{workspace}/{teamspace}/{asset} | Retrieve asset |
| [**getAssetMetadata**](AssetsApi.md#getAssetMetadata) | **GET** /assets/item/{workspace}/{teamspace}/{asset}/metadata | Retrieve asset&#39;s metadata |
| [**getAssetsInPath**](AssetsApi.md#getAssetsInPath) | **GET** /assets/path/{workspace}/{teamspace}/{path} | Retrieve all assets in a given path |
| [**listAssets**](AssetsApi.md#listAssets) | **GET** /assets/list/{workspace}/{teamspace}/{path} | Retrieves asset listing for the given teamspace |
| [**updateAssetMetadata**](AssetsApi.md#updateAssetMetadata) | **PATCH** /assets/item/{workspace}/{teamspace}/{asset}/metadata | Update the given asset&#39;s metadata pair |


<a id="createAssetMetadata"></a>
# **createAssetMetadata**
> AssetMetadataCreateResponse createAssetMetadata(workspace, teamspace, asset, assetMetadataCreateRequestInner)

Create asset&#39;s pair metadata

Create asset&#39;s pair metadata (key, value and type should be provided)

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    List<AssetMetadataCreateRequestInner> assetMetadataCreateRequestInner = Arrays.asList(); // List<AssetMetadataCreateRequestInner> | asset metadata pairs to create
    try {
      AssetMetadataCreateResponse result = apiInstance.createAssetMetadata(workspace, teamspace, asset, assetMetadataCreateRequestInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetMetadata");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |
| **assetMetadataCreateRequestInner** | [**List&lt;AssetMetadataCreateRequestInner&gt;**](AssetMetadataCreateRequestInner.md)| asset metadata pairs to create | |

### Return type

[**AssetMetadataCreateResponse**](AssetMetadataCreateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful asset metadata create response |  -  |
| **0** | error response |  -  |

<a id="deleteAssetMetadata"></a>
# **deleteAssetMetadata**
> deleteAssetMetadata(workspace, teamspace, assetId, assetMetadataDeleteRequestInner)

Delete the given asset&#39;s metadata pairs

Delete asset&#39;s metadata

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String assetId = "assetId_example"; // String | The asset id in the form ast_9m4e2mr0ui3e8a215n4g
    List<AssetMetadataDeleteRequestInner> assetMetadataDeleteRequestInner = Arrays.asList(); // List<AssetMetadataDeleteRequestInner> | asset metadata pairs to delete
    try {
      apiInstance.deleteAssetMetadata(workspace, teamspace, assetId, assetMetadataDeleteRequestInner);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetMetadata");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **assetId** | **String**| The asset id in the form ast_9m4e2mr0ui3e8a215n4g | |
| **assetMetadataDeleteRequestInner** | [**List&lt;AssetMetadataDeleteRequestInner&gt;**](AssetMetadataDeleteRequestInner.md)| asset metadata pairs to delete | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Asset metadata deleted |  -  |
| **0** | An error occurred |  -  |

<a id="getAsset"></a>
# **getAsset**
> AssetGetResponse getAsset(workspace, teamspace, asset)

Retrieve asset

Retrieve the asset by the given asset_id or path

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    try {
      AssetGetResponse result = apiInstance.getAsset(workspace, teamspace, asset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAsset");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |

### Return type

[**AssetGetResponse**](AssetGetResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset retrieved |  -  |
| **404** | Asset ID or path does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="getAssetMetadata"></a>
# **getAssetMetadata**
> AssetMetadataListResponse getAssetMetadata(workspace, teamspace, asset)

Retrieve asset&#39;s metadata

Retrieve the given asset&#39;s metadata

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    try {
      AssetMetadataListResponse result = apiInstance.getAssetMetadata(workspace, teamspace, asset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetMetadata");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |

### Return type

[**AssetMetadataListResponse**](AssetMetadataListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset metadata retrieved |  -  |
| **404** | Asset ID does not exist |  -  |
| **0** | An error occurred |  -  |

<a id="getAssetsInPath"></a>
# **getAssetsInPath**
> AssetPathResponse getAssetsInPath(workspace, teamspace, path)

Retrieve all assets in a given path

Retrieve all assets in a given path, e.g., a request for &#x60;/a/b/c&#x60; will return the assets &#x60;a&#x60;, &#x60;b&#x60;, and &#x60;c&#x60;. 

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String path = "/a/b/c"; // String | The path for which to retrieve assets
    try {
      AssetPathResponse result = apiInstance.getAssetsInPath(workspace, teamspace, path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetsInPath");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **path** | **String**| The path for which to retrieve assets | |

### Return type

[**AssetPathResponse**](AssetPathResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Assets in path retrieved |  -  |
| **404** | One or more of the given path components do not exist |  -  |
| **0** | An error occurred |  -  |

<a id="listAssets"></a>
# **listAssets**
> AssetListResponse listAssets(workspace, teamspace, path, page, perPage, assetType, createdBy, orderBy, expand)

Retrieves asset listing for the given teamspace

End point to retrieve assets for the passed teamspace 

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String path = "/a/b/c"; // String | The path for which to retrieve assets
    Integer page = 56; // Integer | pagination offset
    Integer perPage = 56; // Integer | pagination limit
    AssetType assetType = AssetType.fromValue("array"); // AssetType | asset type to filter to
    String createdBy = "createdBy_example"; // String | users that created the asset to filter to
    String orderBy = "orderBy_example"; // String | order by string
    String expand = "expand_example"; // String | expand api response with supplemental information
    try {
      AssetListResponse result = apiInstance.listAssets(workspace, teamspace, path, page, perPage, assetType, createdBy, orderBy, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#listAssets");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **path** | **String**| The path for which to retrieve assets | |
| **page** | **Integer**| pagination offset | [optional] |
| **perPage** | **Integer**| pagination limit | [optional] |
| **assetType** | [**AssetType**](.md)| asset type to filter to | [optional] [enum: array, notebook, dashboard, user_defined_function, ml_model, file, registered_task_graph, group, vcf, soma, pointcloud, bioimg, geometry, raster, vector_search, folder] |
| **createdBy** | **String**| users that created the asset to filter to | [optional] |
| **orderBy** | **String**| order by string | [optional] |
| **expand** | **String**| expand api response with supplemental information | [optional] |

### Return type

[**AssetListResponse**](AssetListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful asset listing response |  -  |
| **404** | Teamspace not found |  -  |
| **0** | error response |  -  |

<a id="updateAssetMetadata"></a>
# **updateAssetMetadata**
> updateAssetMetadata(workspace, teamspace, asset, assetMetadataUpdateRequest)

Update the given asset&#39;s metadata pair

Update asset&#39;s metadata

### Example
```java
// Import classes:
import io.tiledb.cloud.v4.ApiClient;
import io.tiledb.cloud.v4.ApiException;
import io.tiledb.cloud.v4.Configuration;
import io.tiledb.cloud.v4.auth.*;
import io.tiledb.cloud.v4.models.*;
import io.tiledb.cloud.v4.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tiledb.com/v4");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String workspace = "ws_9m4e2mr0ui3e8a215n4g"; // String | The workspace name or id
    String teamspace = "ts_9m4e2mr0ui3e8a215n4g"; // String | The teamspace name or id
    String asset = "ast_9m4e2mr0ui3e8a215n4g or /a/b/c"; // String | The asset id or path for which to retrieve assets
    AssetMetadataUpdateRequest assetMetadataUpdateRequest = new AssetMetadataUpdateRequest(); // AssetMetadataUpdateRequest | asset metadata pairs to update
    try {
      apiInstance.updateAssetMetadata(workspace, teamspace, asset, assetMetadataUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetMetadata");
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
| **workspace** | **String**| The workspace name or id | |
| **teamspace** | **String**| The teamspace name or id | |
| **asset** | **String**| The asset id or path for which to retrieve assets | |
| **assetMetadataUpdateRequest** | [**AssetMetadataUpdateRequest**](AssetMetadataUpdateRequest.md)| asset metadata pairs to update | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Asset metadata updated |  -  |
| **0** | An error occurred |  -  |

