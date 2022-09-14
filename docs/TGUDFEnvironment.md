

# TGUDFEnvironment

Metadata about the environment where we want to execute a UDF.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **UDFLanguage** |  |  [optional] |
|**languageVersion** | **String** | The language version used to execute this UDF. Neither this nor &#x60;language&#x60; needs to be set for registered UDFs, since the language and version are stored server-side with the UDF itself.  |  [optional] |
|**imageName** | **String** | The name of the image to use for the execution environment.  |  [optional] |
|**namespace** | **String** | If set, the non-default namespace to execute this UDF under (and to query any Array Nodes that are used as inputs to this UDF).  |  [optional] |
|**resourceClass** | **String** | The resource class to use for the UDF execution. Resource classes define resource limits for memory and CPUs. If this is empty, then the UDF will execute in the standard resource class of the TileDB Cloud provider.  |  [optional] |
|**runClientSide** | **Boolean** | A hint that, if possible, this function should be executed on the client side rather than on the server. Registered UDFs and functions which take arrays as inputs can never be executed client-side. If the client’s environment is incompatible, or the client does not support client-side execution, the function will be executed on the server.  |  [optional] |



