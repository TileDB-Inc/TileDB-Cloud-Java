

# RegisteredTaskGraph

The structure and metadata of a task graph that can be stored on TileDB Cloud and executed by users who have access to it. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | A server-assigned unique ID for the UDF, in UUID format. |  [optional] |
|**namespace** | **String** | The namespace that owns this task graph log. |  [optional] |
|**name** | **String** | The name of this graph, to appear in URLs. Must be unique per-namespace.  |  [optional] |
|**readme** | **String** | Documentation for the task graph, in Markdown format. |  [optional] |
|**licenseId** | **String** | SPDX license identifier. |  [optional] |
|**licenseText** | **String** | Full text of the license. |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional tags to classify the graph. |  [optional] |
|**nodes** | [**List&lt;TaskGraphNode&gt;**](TaskGraphNode.md) | The structure of the graph, in the form of the nodes that make it up. As with &#x60;TaskGraphLog&#x60;, nodes must topologically sorted, so that any node appears after all the nodes it depends on.  |  [optional] |



