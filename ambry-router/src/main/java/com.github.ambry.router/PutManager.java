package com.github.ambry.router;

import com.github.ambry.clustermap.ClusterMap;
import com.github.ambry.config.RouterConfig;
import com.github.ambry.messageformat.BlobProperties;
import com.github.ambry.network.RequestInfo;
import java.nio.ByteBuffer;
import java.util.List;


/**
 * PutManager class. This is just a template for now.
 *
 */
class PutManager {

  public PutManager(int maxChunkSize, RouterConfig routerConfig, ClusterMap clusterMap) {
    //@todo
  }

  public FutureResult<String> submitPutBlobOperation(long operationId, BlobProperties blobProperties,
      byte[] usermetadata, ReadableStreamChannel channel, FutureResult<String> futureResult,
      Callback<String> callback) {
    //@todo
    return null;
  }

  public void poll(List<RequestInfo> requests) {
    //@todo
  }

  List<String> getIdsToDelete() {
    // @todo
    return null;
  }

  void handleResponse(ByteBuffer response) {
    // @todo
  }
}