

# GroupInfo

metadata of a group

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique ID of registered group |  [optional] |
|**namespace** | **String** | namespace group is in |  [optional] |
|**name** | **String** | name of group |  [optional] |
|**description** | **String** | description of group |  [optional] |
|**uri** | **String** | uri of group |  [optional] |
|**tiledbUri** | **String** | uri for access through TileDB cloud |  [optional] |
|**assetCount** | **BigDecimal** | A count of direct array members |  [optional] |
|**groupCount** | **BigDecimal** | A count of direct group members |  [optional] |
|**size** | **BigDecimal** | A count of direct members. This is the sum of asset_count and group_count |  [optional] |
|**lastAccessed** | **OffsetDateTime** | Datetime groups was last accessed in UTC |  [optional] |
|**allowedActions** | **List&lt;GroupActions&gt;** | list of actions user is allowed to do on this group |  [optional] |
|**groupType** | **GroupType** |  |  [optional] |
|**logo** | **String** | logo (base64 encoded) for the gruop. Optional |  [optional] |
|**accessCredentialsName** | **String** | the name of the access credentials to use. if unset, the default credentials will be used |  [optional] |
|**shareCount** | **BigDecimal** | number of unique namespaces this group is shared with |  [optional] |
|**publicShare** | **Boolean** | Suggests if the group was shared to public by owner |  [optional] |
|**tags** | **List&lt;String&gt;** | optional tags for group |  [optional] |
|**licenseId** | **String** | License identifier from SPDX License List or Custom |  [optional] |
|**licenseText** | **String** | License text |  [optional] |
|**createdAt** | **OffsetDateTime** | Datetime the group was registered with tiledb |  [optional] |
|**createdBy** | **String** | The username of the group&#39;s creator, if known. |  [optional] |
|**metadata** | [**List&lt;MetadataStringifiedEntry&gt;**](MetadataStringifiedEntry.md) | Contains metadata of the group. **Note:** This property is included in the response only if the &#x60;with_metadata&#x60; query parameter is set to &#x60;true&#x60;.  |  [optional] |



