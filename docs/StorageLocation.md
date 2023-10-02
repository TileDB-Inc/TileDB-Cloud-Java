

# StorageLocation

The path at which a given asset will be stored, and the credentials used to access that asset. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | The path to store this asset type. If unset, a suffix of the user&#39;s &#x60;default_s3_path&#x60; is used. When updating, explicitly set to &#x60;\&quot;\&quot;&#x60;, the empty string, to clear this path; leaving it &#x60;null&#x60; (or absent) will leave the path unchanged.  |  [optional] |
|**credentialsName** | **String** | The name of the credentials used to acess this storage path. If unset, the &#x60;default_s3_path_credentials_name&#x60; is used. When updating, explicitly set to &#x60;\&quot;\&quot;&#x60;, the empty string, to clear this name; leaving it &#x60;null&#x60; (or absent) will leave the name unchanged.  |  [optional] |



