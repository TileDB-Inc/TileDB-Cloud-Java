

# TGUDFEnvironment

Metadata about the environment where we want to execute a UDF.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **UDFLanguage** |  |  [optional]
**languageVersion** | **String** | The language version used to execute this UDF. Neither this nor &#x60;language&#x60; needs to be set for registered UDFs, since the language and version are stored server-side with the UDF itself.  |  [optional]
**imageName** | **String** | The name of the image to use for the execution environment.  |  [optional]
**resourceClass** | **String** | The resource class to use for the UDF execution. Resource classes define resource limits for memory and CPUs. If this is empty, then the UDF will execute in the standard resource class of the TileDB Cloud provider.  |  [optional]



