/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.2.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.v1.api;

import io.tiledb.cloud.rest_api.v1.ApiCallback;
import io.tiledb.cloud.rest_api.v1.ApiClient;
import io.tiledb.cloud.rest_api.v1.ApiException;
import io.tiledb.cloud.rest_api.v1.ApiResponse;
import io.tiledb.cloud.rest_api.v1.Configuration;
import io.tiledb.cloud.rest_api.v1.Pair;

import com.google.gson.reflect.TypeToken;


import java.io.File;
import io.tiledb.cloud.rest_api.v1.model.FileCreate;
import io.tiledb.cloud.rest_api.v1.model.FileCreated;
import io.tiledb.cloud.rest_api.v1.model.FileExport;
import io.tiledb.cloud.rest_api.v1.model.FileExported;
import io.tiledb.cloud.rest_api.v1.model.FileUploaded;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for handleCreateFile
     * @param namespace The namespace of the file (required)
     * @param fileCreate Input/Output information to create a new TileDB file (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File created </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleCreateFileCall(String namespace, FileCreate fileCreate, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = fileCreate;

        // create path and map variables
        String localVarPath = "/files/{namespace}"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME != null) {
            localVarHeaderParams.put("X-TILEDB-CLOUD-ACCESS-CREDENTIALS-NAME", localVarApiClient.parameterToString(X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleCreateFileValidateBeforeCall(String namespace, FileCreate fileCreate, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling handleCreateFile(Async)");
        }
        
        // verify the required parameter 'fileCreate' is set
        if (fileCreate == null) {
            throw new ApiException("Missing the required parameter 'fileCreate' when calling handleCreateFile(Async)");
        }
        

        okhttp3.Call localVarCall = handleCreateFileCall(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create a tiledb file at the specified location
     * @param namespace The namespace of the file (required)
     * @param fileCreate Input/Output information to create a new TileDB file (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @return FileCreated
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File created </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public FileCreated handleCreateFile(String namespace, FileCreate fileCreate, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME) throws ApiException {
        ApiResponse<FileCreated> localVarResp = handleCreateFileWithHttpInfo(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a tiledb file at the specified location
     * @param namespace The namespace of the file (required)
     * @param fileCreate Input/Output information to create a new TileDB file (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @return ApiResponse&lt;FileCreated&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File created </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileCreated> handleCreateFileWithHttpInfo(String namespace, FileCreate fileCreate, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME) throws ApiException {
        okhttp3.Call localVarCall = handleCreateFileValidateBeforeCall(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, null);
        Type localVarReturnType = new TypeToken<FileCreated>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a tiledb file at the specified location
     * @param namespace The namespace of the file (required)
     * @param fileCreate Input/Output information to create a new TileDB file (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File created </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleCreateFileAsync(String namespace, FileCreate fileCreate, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, final ApiCallback<FileCreated> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleCreateFileValidateBeforeCall(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, _callback);
        Type localVarReturnType = new TypeToken<FileCreated>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for handleExportFile
     * @param namespace The namespace of the file (required)
     * @param _file The file identifier (required)
     * @param fileExport Export configuration information (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File exported </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleExportFileCall(String namespace, String _file, FileExport fileExport, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = fileExport;

        // create path and map variables
        String localVarPath = "/files/{namespace}/{file}/export"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "file" + "\\}", localVarApiClient.escapeString(_file.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleExportFileValidateBeforeCall(String namespace, String _file, FileExport fileExport, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling handleExportFile(Async)");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling handleExportFile(Async)");
        }
        
        // verify the required parameter 'fileExport' is set
        if (fileExport == null) {
            throw new ApiException("Missing the required parameter 'fileExport' when calling handleExportFile(Async)");
        }
        

        okhttp3.Call localVarCall = handleExportFileCall(namespace, _file, fileExport, _callback);
        return localVarCall;

    }

    /**
     * 
     * Export a TileDB File back to its original file format
     * @param namespace The namespace of the file (required)
     * @param _file The file identifier (required)
     * @param fileExport Export configuration information (required)
     * @return FileExported
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File exported </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public FileExported handleExportFile(String namespace, String _file, FileExport fileExport) throws ApiException {
        ApiResponse<FileExported> localVarResp = handleExportFileWithHttpInfo(namespace, _file, fileExport);
        return localVarResp.getData();
    }

    /**
     * 
     * Export a TileDB File back to its original file format
     * @param namespace The namespace of the file (required)
     * @param _file The file identifier (required)
     * @param fileExport Export configuration information (required)
     * @return ApiResponse&lt;FileExported&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File exported </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileExported> handleExportFileWithHttpInfo(String namespace, String _file, FileExport fileExport) throws ApiException {
        okhttp3.Call localVarCall = handleExportFileValidateBeforeCall(namespace, _file, fileExport, null);
        Type localVarReturnType = new TypeToken<FileExported>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Export a TileDB File back to its original file format
     * @param namespace The namespace of the file (required)
     * @param _file The file identifier (required)
     * @param fileExport Export configuration information (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File exported </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleExportFileAsync(String namespace, String _file, FileExport fileExport, final ApiCallback<FileExported> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleExportFileValidateBeforeCall(namespace, _file, fileExport, _callback);
        Type localVarReturnType = new TypeToken<FileExported>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for handleUploadFile
     * @param namespace The namespace of the file (required)
     * @param inputFile the file to upload (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @param outputUri output location of the TileDB File (optional)
     * @param name name to set for registered file (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File uploaded </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleUploadFileCall(String namespace, File inputFile, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, String outputUri, String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/files/{namespace}/upload"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (inputFile != null) {
            localVarFormParams.put("input_file", inputFile);
        }

        if (outputUri != null) {
            localVarFormParams.put("output_uri", outputUri);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME != null) {
            localVarHeaderParams.put("X-TILEDB-CLOUD-ACCESS-CREDENTIALS-NAME", localVarApiClient.parameterToString(X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleUploadFileValidateBeforeCall(String namespace, File inputFile, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, String outputUri, String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling handleUploadFile(Async)");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new ApiException("Missing the required parameter 'inputFile' when calling handleUploadFile(Async)");
        }
        

        okhttp3.Call localVarCall = handleUploadFileCall(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name, _callback);
        return localVarCall;

    }

    /**
     * 
     * Upload a tiledb file at the specified location
     * @param namespace The namespace of the file (required)
     * @param inputFile the file to upload (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @param outputUri output location of the TileDB File (optional)
     * @param name name to set for registered file (optional)
     * @return FileUploaded
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File uploaded </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public FileUploaded handleUploadFile(String namespace, File inputFile, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, String outputUri, String name) throws ApiException {
        ApiResponse<FileUploaded> localVarResp = handleUploadFileWithHttpInfo(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name);
        return localVarResp.getData();
    }

    /**
     * 
     * Upload a tiledb file at the specified location
     * @param namespace The namespace of the file (required)
     * @param inputFile the file to upload (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @param outputUri output location of the TileDB File (optional)
     * @param name name to set for registered file (optional)
     * @return ApiResponse&lt;FileUploaded&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File uploaded </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileUploaded> handleUploadFileWithHttpInfo(String namespace, File inputFile, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, String outputUri, String name) throws ApiException {
        okhttp3.Call localVarCall = handleUploadFileValidateBeforeCall(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name, null);
        Type localVarReturnType = new TypeToken<FileUploaded>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Upload a tiledb file at the specified location
     * @param namespace The namespace of the file (required)
     * @param inputFile the file to upload (required)
     * @param X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME Optional registered access credentials to use for creation (optional)
     * @param outputUri output location of the TileDB File (optional)
     * @param name name to set for registered file (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> File uploaded </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleUploadFileAsync(String namespace, File inputFile, String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, String outputUri, String name, final ApiCallback<FileUploaded> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleUploadFileValidateBeforeCall(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name, _callback);
        Type localVarReturnType = new TypeToken<FileUploaded>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}