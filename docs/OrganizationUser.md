

# OrganizationUser

user in an organization

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | unique ID of user |  [optional] |
|**organizationId** | **String** | unique ID of organization |  [optional] |
|**username** | **String** | username for user |  [optional] |
|**userFullName** | **String** | full name of the user; available to organization admins |  [optional] |
|**userEmail** | **String** | email address of the user; available to organization admins |  [optional] |
|**organizationName** | **String** | name of organization |  [optional] |
|**role** | **OrganizationRoles** |  |  [optional] |
|**allowedActions** | **List&lt;NamespaceActions&gt;** | list of actions user is allowed to do on this organization |  [optional] |



