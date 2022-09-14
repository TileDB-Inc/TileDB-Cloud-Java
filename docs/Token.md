

# Token

A api token and its metadata

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**token** | **String** | A api token |  [optional] |
|**name** | **String** | Name of token to revoke |  [optional] |
|**issuedAt** | **OffsetDateTime** | datetime the token was created |  [optional] |
|**expiresAt** | **OffsetDateTime** | datetime the token when token will expire |  [optional] |
|**scope** | **String** | Optional scope to limit token, defaults to all permissions, current supported values are password_reset or * |  [optional] |



