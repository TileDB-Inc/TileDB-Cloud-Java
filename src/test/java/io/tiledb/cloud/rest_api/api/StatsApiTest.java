/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.17.51
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.api;

import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.model.Error;
import io.tiledb.cloud.rest_api.model.GetTiledbStats200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatsApi
 */
@Disabled
public class StatsApiTest {

    private final StatsApi api = new StatsApi();

    /**
     * Fetch libtiledb stat
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTiledbStatsTest() throws ApiException {
        GetTiledbStats200Response response = api.getTiledbStats();
        // TODO: test validations
    }

}
