

# SSODomainSetup

Configuration settings to verify ownership of a given domain. At least one of these must be completed enable user login from the domain. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**txt** | **String** | a DNS TXT record to set on the domain to claim. |  [optional] |
|**cnameSrc** | **String** | a DNS name to set a CNAME record on |  [optional] |
|**cnameDst** | **String** | the CNAME target of &#x60;cname_src&#x60;. |  [optional] |



