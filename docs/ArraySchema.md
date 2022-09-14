

# ArraySchema

ArraySchema during creation or retrieval

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uri** | **String** | URI of schema |  [optional] |
|**version** | **List&lt;Integer&gt;** | file format version |  |
|**arrayType** | **ArrayType** |  |  |
|**tileOrder** | **Layout** |  |  |
|**cellOrder** | **Layout** |  |  |
|**capacity** | **Integer** | Capacity of array |  |
|**coordsFilterPipeline** | [**FilterPipeline**](FilterPipeline.md) |  |  |
|**offsetFilterPipeline** | [**FilterPipeline**](FilterPipeline.md) |  |  |
|**domain** | [**Domain**](Domain.md) |  |  |
|**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | Attributes of array |  |
|**allowsDuplicates** | **Boolean** | True if the array allows coordinate duplicates. Applicable only to sparse arrays. |  [optional] |



