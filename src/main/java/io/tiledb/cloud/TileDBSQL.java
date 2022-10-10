package io.tiledb.cloud;

import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.SqlApi;
import io.tiledb.cloud.rest_api.model.ResultFormat;
import io.tiledb.cloud.rest_api.model.SQLParameters;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.arrow.vector.ipc.ArrowStreamReader;
import org.apache.arrow.vector.types.pojo.Schema;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TileDBSQL {
    String namespace;

    SQLParameters sql;

    TileDBClient tileDBClient;

    SqlApi apiInstance;

    ArrayList<VectorSchemaRoot> readBatches;

    List<Object> results;

    /**
     *
     * @param tileDBClient The TileDBClient
     * @param namespace namespace to run task under is in (an organization name or user's username)
     * @param sql sql being submitted
     */
    public TileDBSQL(TileDBClient tileDBClient, String namespace, SQLParameters sql) {
        Objects.requireNonNull(tileDBClient, "TileDBClient can not be null");
        Objects.requireNonNull(namespace, "Namespace can not be null");
        Objects.requireNonNull(sql, "SQL parameters can not be null");
        this.namespace = namespace;
        this.sql = sql;
        this.tileDBClient = tileDBClient;
        this.apiInstance = new SqlApi(this.tileDBClient.getApiClient());
        this.readBatches = new ArrayList<>();
    }

    /**
     * Exec an SQL query and get results in arrow format.
     */
    public void execArrow(){
        try {
            assert sql.getResultFormat() != null;
            byte[] bytes =  apiInstance.runSQLBytes(namespace, sql, sql.getResultFormat().toString());
            System.out.println(Arrays.toString(bytes));

            RootAllocator allocator = new RootAllocator(Long.MAX_VALUE);
            try (ArrowStreamReader reader = new ArrowStreamReader(new ByteArrayInputStream(bytes), allocator)) {
                while (reader.loadNextBatch()) {
                    // This will be loaded with new values on every call to loadNextBatch
                    VectorSchemaRoot readBatch = reader.getVectorSchemaRoot();
                    readBatches.add(readBatch);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlApi#runSQL/runSQLBytes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    /**
     * Exec an SQL query and get results in any format except arrow.
     *
     * @return
     */
    public void execStandard(){
        try {
            assert sql.getResultFormat() != null;
            results = apiInstance.runSQL(namespace, sql, sql.getResultFormat().toString());
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlApi#runSQL/runSQLBytes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    /**
     * Exec an SQL query
     */
    public void exec(){
        if (this.sql.getResultFormat() == ResultFormat.ARROW){
            execArrow();
        }else {
            execStandard();
        }
    }

    /**
     * Get the results in Arrow format
     * @return
     */
    public ArrayList<VectorSchemaRoot> getReadBatches() {
        return readBatches;
    }

    /**
     * Get the results as lists of Objects
     * @return
     */
    public List<Object> getResults() {
        return results;
    }
}
