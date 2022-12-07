package io.tiledb.cloud;

import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.memory.UnsafeAllocationManager;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.ValueVector;
import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.arrow.vector.ipc.ArrowStreamReader;
import org.apache.arrow.vector.util.TransferPair;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TileDBUtils {

    /**
     *
     * This method gets bytes and translated them to arrow valuevectors
     * @param bytes The input bytes
     * @return A pair that consists of an ArrayList of all valueVectors and the number of batches read.
     * @throws IOException
     */
    static io.tiledb.java.api.Pair<ArrayList<ValueVector>, Integer> createValueVectors(byte[] bytes) throws IOException {
        ArrayList<ValueVector> valueVectors = null;
        int readBatchesCount = 0;

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
        return new io.tiledb.java.api.Pair<>(valueVectors, readBatchesCount);
    }
}
