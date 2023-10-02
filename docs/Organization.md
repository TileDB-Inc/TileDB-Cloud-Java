

# Organization

Organization

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique ID of organization |  [optional] |
|**role** | **OrganizationRoles** |  |  [optional] |
|**name** | **String** | organization name must be unique |  |
|**createdAt** | **OffsetDateTime** | Datetime organization was created in UTC |  [optional] |
|**updatedAt** | **OffsetDateTime** | Datetime organization was updated in UTC |  [optional] |
|**logo** | **String** | Organization logo |  [optional] |
|**description** | **String** | Organization description |  [optional] |
|**users** | [**List&lt;OrganizationUser&gt;**](OrganizationUser.md) |  |  [optional] |
|**allowedActions** | **List&lt;NamespaceActions&gt;** | list of actions user is allowed to do on this organization |  [optional] |
|**numOfArrays** | **BigDecimal** | number of registered arrays for this organization |  [optional] |
|**enabledFeatures** | **List&lt;String&gt;** | List of extra/optional/beta features to enable for namespace |  [optional] [readonly] |
|**unpaidSubscription** | **Boolean** | A notice that the user has an unpaid subscription |  [optional] [readonly] |
|**defaultS3Path** | **String** | The default location to store newly-created notebooks and other assets like UDFs. The name &#x60;default_s3_path&#x60; is a legacy holdover; it may refer to any supported storage location.  |  [optional] |
|**defaultS3PathCredentialsName** | **String** | The name of the credentials used to create and access files in the &#x60;default_s3_path&#x60;, if needed.  |  [optional] |
|**assetLocations** | [**AssetLocations**](AssetLocations.md) |  |  [optional] |
|**stripeConnect** | **Boolean** | Denotes that the organization is able to apply pricing to arrays by means of Stripe Connect |  [optional] [readonly] |



