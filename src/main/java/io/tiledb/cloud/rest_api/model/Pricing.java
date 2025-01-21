/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.17.51
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.PricingAggregateUsage;
import org.openapitools.client.model.PricingCurrency;
import org.openapitools.client.model.PricingInterval;
import org.openapitools.client.model.PricingType;
import org.openapitools.client.model.PricingUnitLabel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Pricing created by converting an array to product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class Pricing {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_ARRAY_UUID = "array_uuid";
  @SerializedName(SERIALIZED_NAME_ARRAY_UUID)
  @javax.annotation.Nullable
  private String arrayUuid;

  public static final String SERIALIZED_NAME_PRICING_NAME = "pricing_name";
  @SerializedName(SERIALIZED_NAME_PRICING_NAME)
  @javax.annotation.Nullable
  private String pricingName;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  @javax.annotation.Nullable
  private PricingType pricingType;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  @javax.annotation.Nullable
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_STATEMENT_DESCRIPTOR = "product_statement_descriptor";
  @SerializedName(SERIALIZED_NAME_PRODUCT_STATEMENT_DESCRIPTOR)
  @javax.annotation.Nullable
  private String productStatementDescriptor;

  public static final String SERIALIZED_NAME_PRODUCT_UNIT_LABEL = "product_unit_label";
  @SerializedName(SERIALIZED_NAME_PRODUCT_UNIT_LABEL)
  @javax.annotation.Nullable
  private PricingUnitLabel productUnitLabel;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private PricingCurrency currency;

  public static final String SERIALIZED_NAME_AGGREGATE_USAGE = "aggregate_usage";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_USAGE)
  @javax.annotation.Nullable
  private PricingAggregateUsage aggregateUsage;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  @javax.annotation.Nullable
  private PricingInterval interval;

  public static final String SERIALIZED_NAME_DIVIDED_BY = "divided_by";
  @SerializedName(SERIALIZED_NAME_DIVIDED_BY)
  @javax.annotation.Nullable
  private Long dividedBy;

  public static final String SERIALIZED_NAME_CHARGE = "charge";
  @SerializedName(SERIALIZED_NAME_CHARGE)
  @javax.annotation.Nullable
  private Double charge;

  public static final String SERIALIZED_NAME_ACTIVATED = "activated";
  @SerializedName(SERIALIZED_NAME_ACTIVATED)
  @javax.annotation.Nullable
  private Boolean activated;

  public Pricing() {
  }

  public Pricing id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of plan as defined by Stripe
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Pricing arrayUuid(@javax.annotation.Nullable String arrayUuid) {
    this.arrayUuid = arrayUuid;
    return this;
  }

  /**
   * Unique ID of registered array
   * @return arrayUuid
   */
  @javax.annotation.Nullable
  public String getArrayUuid() {
    return arrayUuid;
  }

  public void setArrayUuid(@javax.annotation.Nullable String arrayUuid) {
    this.arrayUuid = arrayUuid;
  }


  public Pricing pricingName(@javax.annotation.Nullable String pricingName) {
    this.pricingName = pricingName;
    return this;
  }

  /**
   * Name of pricing
   * @return pricingName
   */
  @javax.annotation.Nullable
  public String getPricingName() {
    return pricingName;
  }

  public void setPricingName(@javax.annotation.Nullable String pricingName) {
    this.pricingName = pricingName;
  }


  public Pricing pricingType(@javax.annotation.Nullable PricingType pricingType) {
    this.pricingType = pricingType;
    return this;
  }

  /**
   * Get pricingType
   * @return pricingType
   */
  @javax.annotation.Nullable
  public PricingType getPricingType() {
    return pricingType;
  }

  public void setPricingType(@javax.annotation.Nullable PricingType pricingType) {
    this.pricingType = pricingType;
  }


  public Pricing productName(@javax.annotation.Nullable String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Name of product
   * @return productName
   */
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(@javax.annotation.Nullable String productName) {
    this.productName = productName;
  }


  public Pricing productStatementDescriptor(@javax.annotation.Nullable String productStatementDescriptor) {
    this.productStatementDescriptor = productStatementDescriptor;
    return this;
  }

  /**
   * Extra information about a product which will appear on the credit card statement of the customer
   * @return productStatementDescriptor
   */
  @javax.annotation.Nullable
  public String getProductStatementDescriptor() {
    return productStatementDescriptor;
  }

  public void setProductStatementDescriptor(@javax.annotation.Nullable String productStatementDescriptor) {
    this.productStatementDescriptor = productStatementDescriptor;
  }


  public Pricing productUnitLabel(@javax.annotation.Nullable PricingUnitLabel productUnitLabel) {
    this.productUnitLabel = productUnitLabel;
    return this;
  }

  /**
   * Get productUnitLabel
   * @return productUnitLabel
   */
  @javax.annotation.Nullable
  public PricingUnitLabel getProductUnitLabel() {
    return productUnitLabel;
  }

  public void setProductUnitLabel(@javax.annotation.Nullable PricingUnitLabel productUnitLabel) {
    this.productUnitLabel = productUnitLabel;
  }


  public Pricing currency(@javax.annotation.Nullable PricingCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public PricingCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable PricingCurrency currency) {
    this.currency = currency;
  }


  public Pricing aggregateUsage(@javax.annotation.Nullable PricingAggregateUsage aggregateUsage) {
    this.aggregateUsage = aggregateUsage;
    return this;
  }

  /**
   * Get aggregateUsage
   * @return aggregateUsage
   */
  @javax.annotation.Nullable
  public PricingAggregateUsage getAggregateUsage() {
    return aggregateUsage;
  }

  public void setAggregateUsage(@javax.annotation.Nullable PricingAggregateUsage aggregateUsage) {
    this.aggregateUsage = aggregateUsage;
  }


  public Pricing interval(@javax.annotation.Nullable PricingInterval interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @javax.annotation.Nullable
  public PricingInterval getInterval() {
    return interval;
  }

  public void setInterval(@javax.annotation.Nullable PricingInterval interval) {
    this.interval = interval;
  }


  public Pricing dividedBy(@javax.annotation.Nullable Long dividedBy) {
    this.dividedBy = dividedBy;
    return this;
  }

  /**
   * Group of n product unit labels
   * @return dividedBy
   */
  @javax.annotation.Nullable
  public Long getDividedBy() {
    return dividedBy;
  }

  public void setDividedBy(@javax.annotation.Nullable Long dividedBy) {
    this.dividedBy = dividedBy;
  }


  public Pricing charge(@javax.annotation.Nullable Double charge) {
    this.charge = charge;
    return this;
  }

  /**
   * Price in cents (decimal) per unitlabel
   * @return charge
   */
  @javax.annotation.Nullable
  public Double getCharge() {
    return charge;
  }

  public void setCharge(@javax.annotation.Nullable Double charge) {
    this.charge = charge;
  }


  public Pricing activated(@javax.annotation.Nullable Boolean activated) {
    this.activated = activated;
    return this;
  }

  /**
   * If pricing is activated
   * @return activated
   */
  @javax.annotation.Nullable
  public Boolean getActivated() {
    return activated;
  }

  public void setActivated(@javax.annotation.Nullable Boolean activated) {
    this.activated = activated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pricing pricing = (Pricing) o;
    return Objects.equals(this.id, pricing.id) &&
        Objects.equals(this.arrayUuid, pricing.arrayUuid) &&
        Objects.equals(this.pricingName, pricing.pricingName) &&
        Objects.equals(this.pricingType, pricing.pricingType) &&
        Objects.equals(this.productName, pricing.productName) &&
        Objects.equals(this.productStatementDescriptor, pricing.productStatementDescriptor) &&
        Objects.equals(this.productUnitLabel, pricing.productUnitLabel) &&
        Objects.equals(this.currency, pricing.currency) &&
        Objects.equals(this.aggregateUsage, pricing.aggregateUsage) &&
        Objects.equals(this.interval, pricing.interval) &&
        Objects.equals(this.dividedBy, pricing.dividedBy) &&
        Objects.equals(this.charge, pricing.charge) &&
        Objects.equals(this.activated, pricing.activated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, arrayUuid, pricingName, pricingType, productName, productStatementDescriptor, productUnitLabel, currency, aggregateUsage, interval, dividedBy, charge, activated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pricing {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    arrayUuid: ").append(toIndentedString(arrayUuid)).append("\n");
    sb.append("    pricingName: ").append(toIndentedString(pricingName)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productStatementDescriptor: ").append(toIndentedString(productStatementDescriptor)).append("\n");
    sb.append("    productUnitLabel: ").append(toIndentedString(productUnitLabel)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    aggregateUsage: ").append(toIndentedString(aggregateUsage)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    dividedBy: ").append(toIndentedString(dividedBy)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("array_uuid");
    openapiFields.add("pricing_name");
    openapiFields.add("pricing_type");
    openapiFields.add("product_name");
    openapiFields.add("product_statement_descriptor");
    openapiFields.add("product_unit_label");
    openapiFields.add("currency");
    openapiFields.add("aggregate_usage");
    openapiFields.add("interval");
    openapiFields.add("divided_by");
    openapiFields.add("charge");
    openapiFields.add("activated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Pricing
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Pricing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pricing is not found in the empty JSON string", Pricing.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Pricing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Pricing` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("array_uuid") != null && !jsonObj.get("array_uuid").isJsonNull()) && !jsonObj.get("array_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("array_uuid").toString()));
      }
      if ((jsonObj.get("pricing_name") != null && !jsonObj.get("pricing_name").isJsonNull()) && !jsonObj.get("pricing_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricing_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricing_name").toString()));
      }
      // validate the optional field `pricing_type`
      if (jsonObj.get("pricing_type") != null && !jsonObj.get("pricing_type").isJsonNull()) {
        PricingType.validateJsonElement(jsonObj.get("pricing_type"));
      }
      if ((jsonObj.get("product_name") != null && !jsonObj.get("product_name").isJsonNull()) && !jsonObj.get("product_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_name").toString()));
      }
      if ((jsonObj.get("product_statement_descriptor") != null && !jsonObj.get("product_statement_descriptor").isJsonNull()) && !jsonObj.get("product_statement_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_statement_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_statement_descriptor").toString()));
      }
      // validate the optional field `product_unit_label`
      if (jsonObj.get("product_unit_label") != null && !jsonObj.get("product_unit_label").isJsonNull()) {
        PricingUnitLabel.validateJsonElement(jsonObj.get("product_unit_label"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        PricingCurrency.validateJsonElement(jsonObj.get("currency"));
      }
      // validate the optional field `aggregate_usage`
      if (jsonObj.get("aggregate_usage") != null && !jsonObj.get("aggregate_usage").isJsonNull()) {
        PricingAggregateUsage.validateJsonElement(jsonObj.get("aggregate_usage"));
      }
      // validate the optional field `interval`
      if (jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) {
        PricingInterval.validateJsonElement(jsonObj.get("interval"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Pricing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pricing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pricing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pricing.class));

       return (TypeAdapter<T>) new TypeAdapter<Pricing>() {
           @Override
           public void write(JsonWriter out, Pricing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Pricing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Pricing given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Pricing
   * @throws IOException if the JSON string is invalid with respect to Pricing
   */
  public static Pricing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pricing.class);
  }

  /**
   * Convert an instance of Pricing to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

