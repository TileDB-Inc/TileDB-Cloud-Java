

# UDFInfoUpdate

User-defined function that can persist in db, used and shared multiple times

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name of UDF |  [optional]
**language** | **UDFLanguage** |  |  [optional]
**version** | **String** | Type-specific version |  [optional]
**imageName** | **String** | Docker image name to use for UDF |  [optional]
**type** | **UDFType** |  |  [optional]
**exec** | **String** | Type-specific executable text |  [optional]
**execRaw** | **String** | optional raw text to store of serialized function, used for showing in UI |  [optional]
**readme** | **String** | Markdown readme of UDFs |  [optional]
**licenseId** | **String** | License identifier from SPDX License List or Custom |  [optional]
**licenseText** | **String** | License text |  [optional]
**tags** | **List&lt;String&gt;** | optional tags for UDF |  [optional]



