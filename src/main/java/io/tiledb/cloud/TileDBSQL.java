package io.tiledb.cloud;

import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.api.SqlApi;
import io.tiledb.cloud.rest_api.model.ResultFormat;
import io.tiledb.cloud.rest_api.model.SQLParameters;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.memory.unsafe.UnsafeAllocationManager;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.ValueVector;
import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.arrow.vector.ipc.ArrowStreamReader;
import org.apache.arrow.vector.util.TransferPair;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.arrow.compression.CommonsCompressionFactory;

public class TileDBSQL implements AutoCloseable{
    private String workspace;

    private String namespace;

    private SQLParameters sql;

    private TileDBClient tileDBClient;

    private SqlApi apiInstance;

    private ArrayList<VectorSchemaRoot> readBatches;

    private List<Object> results;

    private ArrowStreamReader reader;

    /**
     *
     * @param tileDBClient The TileDBClient
     * @param namespace namespace to run task under is in (an organization name or user's username)
     * @param sql sql being submitted
     */
    public TileDBSQL(TileDBClient tileDBClient, String workspace, String namespace, SQLParameters sql) {
        Objects.requireNonNull(tileDBClient, "TileDBClient can not be null");
        Objects.requireNonNull(namespace, "Namespace can not be null");
        Objects.requireNonNull(sql, "SQL parameters can not be null");
        this.workspace = workspace;
        this.namespace = namespace;
        this.sql = sql;
        this.tileDBClient = tileDBClient;
        this.apiInstance = new SqlApi(this.tileDBClient.getApiClient());
        this.readBatches = new ArrayList<>();
    }

    /**
     * Exec an SQL query and get results in arrow format.
     *
     * @return A pair that consists of an ArrayList of all valueVectors and the
     * number of batches read.
     */
    public Pair<ArrayList<ValueVector>, Integer> execArrow(){
        try {
            if (sql.getResultFormat() != ResultFormat.ARROW && sql.getResultFormat() != null){
                throw new ApiException("The ResultFormat you specified is not 'ARROW'. Since you are calling " +
                        "'execArrow()' you can not specify a different ResultFormat. ");
            }
            sql.setResultFormat(ResultFormat.ARROW);
            byte[] bytes =  apiInstance.runSQLBytes(workspace, namespace, sql, "none");
            ArrayList<ValueVector> valueVectors = null;
            int readBatchesCount = 0;

//            RootAllocator allocator = new RootAllocator(Long.MAX_VALUE);
            RootAllocator allocator = new RootAllocator(RootAllocator.configBuilder().allocationManagerFactory(UnsafeAllocationManager.FACTORY).build());
            ArrowStreamReader reader = new ArrowStreamReader(new ByteArrayInputStream(bytes), allocator, CommonsCompressionFactory.INSTANCE);

            VectorSchemaRoot root = reader.getVectorSchemaRoot();

            while(reader.loadNextBatch()) {
                readBatchesCount++;
                valueVectors = new ArrayList<>();
                for (FieldVector f : root.getFieldVectors()) {
                    // transfer will not copy data but transfer ownership of memory
                    // from ArrowStreamReader to TileDBSQL. This is necessary because
                    // otherwise we are not able to close the reader and retain the
                    // data.
                    TransferPair t = f.getTransferPair(allocator);
                    t.transfer();
                    valueVectors.add(t.getTo());
                }
            }
            reader.close();
            return new Pair<>(valueVectors, readBatchesCount);

        } catch (IOException | ApiException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Exec an SQL query and get results in any format except arrow.
     *
     * @return
     */
    public List<Map<String, Object>> exec(){
        try {
            if (sql.getResultFormat() == null ){
                return apiInstance.runSQL(workspace, namespace, sql, ResultFormat.TILEDB_JSON.toString());
            } else {
                return apiInstance.runSQL(workspace, namespace, sql, sql.getResultFormat().toString());
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling SqlApi#runSQL/runSQLBytes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     */
    public void close(){
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
