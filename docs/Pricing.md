

# Pricing

Pricing created by converting an array to product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID of plan as defined by Stripe |  [optional]
**arrayUuid** | **String** | Unique ID of registered array |  [optional]
**pricingName** | **String** | Name of pricing |  [optional]
**pricingType** | **PricingType** |  |  [optional]
**productName** | **String** | Name of product |  [optional]
**productStatementDescriptor** | **String** | Extra information about a product which will appear on the credit card statement of the customer |  [optional]
**productUnitLabel** | **PricingUnitLabel** |  |  [optional]
**currency** | **PricingCurrency** |  |  [optional]
**aggregateUsage** | **PricingAggregateUsage** |  |  [optional]
**interval** | **PricingInterval** |  |  [optional]
**dividedBy** | **Long** | Group of n product unit labels |  [optional]
**charge** | **Double** | Price in cents (decimal) per unitlabel |  [optional]
**activated** | **Boolean** | If pricing is activated |  [optional]



