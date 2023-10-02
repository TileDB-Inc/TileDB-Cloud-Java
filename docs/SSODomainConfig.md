

# SSODomainConfig

The information used to set up a single-sign on connection to a customer domain. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | A server-generated ID for the configuration. |  [optional] |
|**domain** | **String** | The fully-qualified domain (but with no trailing dot) to connect for single sign-on. This may not be changed after creation.  |  [optional] |
|**oidcIssuer** | **String** | The URL of the OpenID Connect issuer that can be used to authenticate this domain&#39;s users. The prefix where the &#x60;/.well-known/openid-configuration&#x60; file can be found; usually without a trailing slash.  |  [optional] |
|**oidcClientId** | **String** | The OpenID Connect client ID for this SSO instance. |  [optional] |
|**oidcClientSecret** | **String** | The OpenID Connect client secret for this SSO instance. |  [optional] |
|**domainSetup** | [**SSODomainSetup**](SSODomainSetup.md) |  |  [optional] |
|**verificationStatus** | **DomainVerificationStatus** |  |  [optional] |
|**checkResults** | [**List&lt;DomainCheckResult&gt;**](DomainCheckResult.md) | A list of the results of recent attempts to verify this domain.  |  [optional] |



