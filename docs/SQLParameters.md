

# SQLParameters

Parameters for running sql query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name of task, optional |  [optional] |
|**query** | **String** | query to run |  [optional] |
|**outputUri** | **String** | Output array uri |  [optional] |
|**storeResults** | **Boolean** | store results for later retrieval |  [optional] |
|**dontDownloadResults** | **Boolean** | Set to true to avoid downloading the results of this UDF. Useful for intermediate nodes in a task graph where you will not be using the results of your function. Defaults to false (\&quot;yes download results\&quot;). |  [optional] |
|**resourceClass** | **String** | The resource class to use for the SQL execution. Resource classes define resource limits for memory and CPUs. If this is empty, then the SQL will execute in the standard resource class of the TileDB Cloud provider.  |  [optional] |
|**resultFormat** | **ResultFormat** |  |  [optional] |
|**initCommands** | **List&lt;String&gt;** | Queries or commands to run before main query |  [optional] |
|**parameters** | **List&lt;Object&gt;** | SQL query parameters |  [optional] |
|**taskGraphUuid** | **String** | If set, the ID of the log for the task graph that this was part of.  |  [optional] |
|**clientNodeUuid** | **String** | If set, the client-defined ID of the node within this task&#39;s graph.  |  [optional] |



