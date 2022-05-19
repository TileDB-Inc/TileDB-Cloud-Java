

# Invitation

Invitations to share or collaborate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID of invitation added to magic link |  [optional]
**invitationType** | **InvitationType** |  |  [optional]
**ownerNamespaceUuid** | **String** | Namespace of the owner of the invitation (user or organization) |  [optional]
**userNamespaceUuid** | **String** | Unique ID of the user accepted the invitation |  [optional]
**organizationUserUuid** | **String** | Unique ID of the organization user accepted the invitation |  [optional]
**organizationName** | **String** | Name of the organization, does not persist in database |  [optional]
**organizationRole** | **OrganizationRoles** |  |  [optional]
**arrayUuid** | **String** | Unique ID of the array |  [optional]
**arrayName** | **String** | Name of the array, does not persist in database |  [optional]
**email** | **String** | Email of the individual we send the invitation to |  [optional]
**actions** | **String** | A comma separated list of ArrayActions or NamespaceActions |  [optional]
**status** | **InvitationStatus** |  |  [optional]
**createdAt** | **OffsetDateTime** | Datetime the invitation was created in UTC |  [optional]
**expiresAt** | **OffsetDateTime** | Datetime the invitation is expected to expire in UTC |  [optional]
**acceptedAt** | **OffsetDateTime** | Datetime the invitation was accepted in UTC |  [optional]



