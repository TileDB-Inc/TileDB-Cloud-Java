

# OrganizationUpdate

OrganizationUpdate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | organization name must be unique |  [optional] |
|**logo** | **String** | Organization logo |  [optional] |
|**description** | **String** | Organization description |  [optional] |
|**defaultS3Path** | **String** | The default location to store newly-created notebooks and other assets like UDFs. The name &#x60;default_s3_path&#x60; is a legacy holdover; it may refer to any supported storage location.  |  [optional] |
|**defaultS3PathCredentialsName** | **String** | The name of the credentials used to create and access files in the &#x60;default_s3_path&#x60;, if needed.  |  [optional] |
|**assetLocations** | [**AssetLocations**](AssetLocations.md) |  |  [optional] |



