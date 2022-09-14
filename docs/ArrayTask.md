

# ArrayTask

Synchronous Task to Run

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | task ID |  [optional] |
|**name** | **String** | Optional task name |  [optional] |
|**description** | **String** | Optional task description (Tasks purpose) |  [optional] |
|**arrayMetadata** | [**ArrayInfo**](ArrayInfo.md) |  |  [optional] |
|**subarray** | [**DomainArray**](DomainArray.md) |  |  [optional] |
|**memory** | **Integer** | memory allocated to task in bytes |  [optional] |
|**cpu** | **Integer** | millicpu allocated to task |  [optional] |
|**namespace** | **String** | namespace task is tied to |  [optional] |
|**status** | **ArrayTaskStatus** |  |  [optional] |
|**startTime** | **OffsetDateTime** | Start time RFC3339 for job |  [optional] |
|**finishTime** | **OffsetDateTime** | Finish time RFC3339 for job |  [optional] |
|**cost** | **Double** | Total accumulated for task in USD, example is $0.12 |  [optional] |
|**egressCost** | **Double** | Total accumulated for egress task in USD, example is $0.12 |  [optional] |
|**accessCost** | **Double** | Cost accumulated for access task in USD, example is $0.12 |  [optional] |
|**queryType** | **Querytype** |  |  [optional] |
|**udfCode** | **String** | Optional actual code that is going to be executed |  [optional] |
|**udfLanguage** | **String** | Optional actual language used to express udf_code |  [optional] |
|**sqlQuery** | **String** | Optional actual sql query that is going to be executed |  [optional] |
|**type** | **ArrayTaskType** |  |  [optional] |
|**activity** | [**List&lt;ArrayActivityLog&gt;**](ArrayActivityLog.md) | Array activity logs for task |  [optional] |
|**logs** | **String** | logs from array task |  [optional] |
|**duration** | **BigDecimal** | duration in nanoseconds of an array task |  [optional] |
|**sqlInitCommands** | **List&lt;String&gt;** | SQL queries or commands to run before main sql query |  [optional] |
|**sqlParameters** | **List&lt;Object&gt;** | SQL query parameters |  [optional] |
|**resultFormat** | **ResultFormat** |  |  [optional] |
|**taskGraphUuid** | **String** | If set, the ID of the log for the task graph that this was part of.  |  [optional] |
|**clientNodeUuid** | **String** | If set, the client-defined ID of the node within this task&#39;s graph.  |  [optional] |



