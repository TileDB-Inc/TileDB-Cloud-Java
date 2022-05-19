

# User

User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique ID of user |  [optional]
**username** | **String** | username must be unique | 
**password** | **String** | password |  [optional]
**name** | **String** | the user&#39;s full, real name |  [optional]
**email** | **String** | the user&#39;s email |  [optional]
**isValidEmail** | **Boolean** | user&#39;s email is validated to be correct |  [optional] [readonly]
**stripeConnect** | **Boolean** | Denotes that the user is able to apply pricing to arrays by means of Stripe Connect |  [optional] [readonly]
**company** | **String** | the user&#39;s company |  [optional]
**logo** | **String** | the user&#39;s logo |  [optional]
**lastActivityDate** | **OffsetDateTime** | when the user last logged in (set by the server) |  [optional] [readonly]
**timezone** | **String** |  |  [optional]
**organizations** | [**List&lt;OrganizationUser&gt;**](OrganizationUser.md) | Array of organizations a user is part of and their roles |  [optional] [readonly]
**allowedActions** | **List&lt;NamespaceActions&gt;** | list of actions user is allowed to do on this organization |  [optional]
**enabledFeatures** | **List&lt;String&gt;** | List of extra/optional/beta features to enable for namespace |  [optional] [readonly]
**unpaidSubscription** | **Boolean** | A notice that the user has an unpaid subscription |  [optional] [readonly]
**defaultS3Path** | **String** | default S3 path to store newly created notebooks |  [optional]
**defaultS3PathCredentialsName** | **String** | Default S3 path credentials name is the credentials name to use along with default_s3_path |  [optional]
**defaultNamespaceCharged** | **String** | Override the default namespace charged for actions when no namespace is specified |  [optional]



