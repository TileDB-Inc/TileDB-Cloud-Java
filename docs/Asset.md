

# Asset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The asset&#39;s ID |  |
|**workspaceId** | **String** | The workspace&#39;s ID |  |
|**teamspaceId** | **String** | The teamspace&#39;s ID |  |
|**name** | **String** | The name of the asset. |  |
|**description** | **String** | The description of the asset. |  [optional] |
|**memberType** | **AssetMemberType** |  |  [optional] |
|**mime** | **String** | The MIME type of the asset. |  [optional] |
|**backingType** | **AssetBackingType** |  |  |
|**type** | **AssetType** |  |  |
|**path** | **String** | The path of the asset. |  |
|**createdAt** | **OffsetDateTime** | Datetime asset was created in UTC |  |
|**updatedAt** | **OffsetDateTime** | Datetime asset was updated in UTC |  [optional] |
|**createdBy** | [**WorkspaceUser**](WorkspaceUser.md) |  |  |
|**metadata** | [**List&lt;AssetMetadata&gt;**](AssetMetadata.md) |  |  [optional] |



