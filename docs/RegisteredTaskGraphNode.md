

# RegisteredTaskGraphNode

Information about a single node within a registered task graph. A single node represents one piece of data or a computational step; either as an input value, a data source, or a computation that acts upon earlier nodes. The structure parallels the existing `TaskGraphNodeMetadata`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientNodeId** | **String** | The client-generated UUID of the given graph node. |  [optional]
**name** | **String** | A client-specified name for the node. If provided, this must be unique.  |  [optional]
**dependsOn** | **List&lt;String&gt;** | The client_node_uuid of each node that this node depends upon. Used to define the structure of the graph.  |  [optional]
**arrayNode** | [**UDFArrayDetails**](UDFArrayDetails.md) |  |  [optional]
**inputNode** | [**TGInputNodeData**](TGInputNodeData.md) |  |  [optional]
**sqlNode** | [**TGSQLNodeData**](TGSQLNodeData.md) |  |  [optional]
**udfNode** | [**TGUDFNodeData**](TGUDFNodeData.md) |  |  [optional]



