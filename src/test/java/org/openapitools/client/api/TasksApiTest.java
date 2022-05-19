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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ArrayTask;
import org.openapitools.client.model.ArrayTaskData;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.SQLParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * 
     *
     * Run a sql query
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runSQLTest() throws ApiException {
        String namespace = null;
        SQLParameters sql = null;
        String acceptEncoding = null;
                List<Object> response = api.runSQL(namespace, sql, acceptEncoding);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetch an array task
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void taskIdGetTest() throws ApiException {
        String id = null;
                ArrayTask response = api.taskIdGet(id);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve results of an array task
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void taskIdResultGetTest() throws ApiException {
        String id = null;
        String acceptEncoding = null;
                String response = api.taskIdResultGet(id, acceptEncoding);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetch a list of all array tasks a user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksGetTest() throws ApiException {
        String namespace = null;
        String createdBy = null;
        String array = null;
        Integer start = null;
        Integer end = null;
        Integer page = null;
        Integer perPage = null;
        String type = null;
        List<String> excludeType = null;
        List<String> fileType = null;
        List<String> excludeFileType = null;
        String status = null;
        String search = null;
        String orderby = null;
                ArrayTaskData response = api.tasksGet(namespace, createdBy, array, start, end, page, perPage, type, excludeType, fileType, excludeFileType, status, search, orderby);
        // TODO: test validations
    }
    
}
