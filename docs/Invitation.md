

# Invitation

Invitations to share or collaborate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID of invitation added to magic link |  [optional] |
|**invitationType** | **InvitationType** |  |  [optional] |
|**ownerNamespaceUuid** | **String** | Namespace of the owner of the invitation (user or organization) |  [optional] |
|**inviterUuid** | **String** | Unique ID of the user that sent the invitation |  [optional] |
|**userNamespaceUuid** | **String** | Unique ID of the user accepted the invitation |  [optional] |
|**organizationUserUuid** | **String** | Unique ID of the organization user accepted the invitation |  [optional] |
|**organizationName** | **String** | Name of the organization, does not persist in database |  [optional] |
|**organizationRole** | **OrganizationRoles** |  |  [optional] |
|**organizationUuid** | **String** | Unique ID of the organization whose user(s) accepted the invitation |  [optional] |
|**arrayUuid** | **String** | Unique ID of the array |  [optional] |
|**groupUuid** | **String** | Unique ID of the group |  [optional] |
|**arrayName** | **String** | Name of the array, does not persist in database |  [optional] |
|**email** | **String** | Email of the individual we send the invitation to |  [optional] |
|**actions** | **String** | A comma separated list of ArrayActions or NamespaceActions |  [optional] |
|**groupActions** | **String** | A comma separated list of GroupActions |  [optional] |
|**status** | **InvitationStatus** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Datetime the invitation was created in UTC |  [optional] |
|**expiresAt** | **OffsetDateTime** | Datetime the invitation is expected to expire in UTC |  [optional] |
|**acceptedAt** | **OffsetDateTime** | Datetime the invitation was accepted in UTC |  [optional] |
|**namespaceInvited** | **String** | The namespace invited (user or organization, if it exists in the DB) |  [optional] |



