

# GroupRegister

Initial attributes for the registration of a an existing group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A human readable description of the contents of the group. |  [optional]
**name** | **String** | The name of the group. If must be unique within the group. |  [optional]
**parent** | **String** | The unique name or id of the parent of the group. If empty, then the new group will be a top level group. |  [optional]
**uri** | **String** | uri of group. |  [optional]
**logo** | **String** | logo (base64 encoded) for the group. Optional |  [optional]
**accessCredentialsName** | **String** | the name of the access credentials to use. if unset, the default credentials will be used. |  [optional]
**tags** | **List&lt;String&gt;** | optional tags for groups. |  [optional]
**licenseId** | **String** | License identifier from SPDX License List or Custom. |  [optional]
**licenseText** | **String** | License text |  [optional]



