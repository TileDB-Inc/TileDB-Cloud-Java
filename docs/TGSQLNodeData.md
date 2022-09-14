

# TGSQLNodeData

A node specifying an SQL query to execute in TileDB Cloud. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**initCommands** | **List&lt;String&gt;** | The commands to execute before running the query itself. |  [optional] |
|**query** | **String** | The text of the SQL query to execute. Parameters are substituted in for &#x60;?&#x60;s, just as in a regular MariaDB query.  |  [optional] |
|**parameters** | **List&lt;Object&gt;** | The parameters to substitute in for arguments in the &#x60;query&#x60;. Fixed-length. Arguments must be in JSON format.  |  [optional] |
|**resultFormat** | **ResultFormat** |  |  [optional] |
|**namespace** | **String** | If set, the non-default namespace to execute this SQL query under.  |  [optional] |



