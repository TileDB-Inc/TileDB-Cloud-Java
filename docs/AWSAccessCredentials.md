

# AWSAccessCredentials

Model representing aws keys or service role, service roles are currently ignored, but will be preferred option in the future

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**secretAccessKey** | **String** | aws secret access key, never returned in get requests |  [optional] |
|**accessKeyId** | **String** | aws access key |  [optional] |
|**serviceRoleArn** | **String** | aws service role to use for access |  [optional] |
|**name** | **String** | human readable name |  [optional] |
|**_default** | **Boolean** | true if this is the default credential to be used within this namespace |  [optional] |
|**buckets** | **List&lt;String&gt;** | a whitelist of one or more buckets this key should access |  [optional] |
|**createdAt** | **OffsetDateTime** | Time when UDF dependencies were created (rfc3339) |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Time when UDF dependencies was last updated (rfc3339) |  [optional] [readonly] |



