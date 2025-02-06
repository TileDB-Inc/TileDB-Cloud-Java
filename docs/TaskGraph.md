

# TaskGraph

Information about a task graph.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The server-generated UUID of the task graph. |  [optional] [readonly] |
|**namespace** | **String** | The namespace that owns this task graph. When creating a task graph log, this is used as the namespace to create the log in; thereafter it is read-only.  |  [optional] |
|**createdBy** | **String** | The name of the user who created this task graph log. |  [optional] [readonly] |
|**name** | **String** | A name for this task graph, displayed in the UI. Does not need to be unique.  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date/time when this task graph was originally created.  |  [optional] [readonly] |
|**nodes** | [**List&lt;TaskGraphNode&gt;**](TaskGraphNode.md) | The structure of the graph. This is provided by the client when first setting up the task graph. This must be topographically sorted; that is, each node must appear after all nodes that it depends upon.  |  [optional] |
|**parallelism** | **Long** | Parallelism limits the max total parallel pods that can execute at the same time in a workflow.  |  [optional] |
|**retryStrategy** | [**RetryStrategy**](RetryStrategy.md) |  |  [optional] |
|**deadline** | **Long** | Duration in seconds relative to the workflow start time which the workflow is allowed to run before it gets terminated. Defaults to 24h when unset  |  [optional] |
|**taskGraphType** | **TaskGraphType** |  |  [optional] |



