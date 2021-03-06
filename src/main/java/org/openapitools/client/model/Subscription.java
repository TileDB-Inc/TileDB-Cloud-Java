/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.2.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Pricing;

/**
 * Subscription of a user (customer) to another user&#39;s arrays
 */
@ApiModel(description = "Subscription of a user (customer) to another user's arrays")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class Subscription {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OWNER_NAMESPACE_UUID = "owner_namespace_uuid";
  @SerializedName(SERIALIZED_NAME_OWNER_NAMESPACE_UUID)
  private String ownerNamespaceUuid;

  public static final String SERIALIZED_NAME_CUSTOMER_NAMESPACE_UUID = "customer_namespace_uuid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAMESPACE_UUID)
  private String customerNamespaceUuid;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private List<Pricing> pricing = null;

  public Subscription() { 
  }

  public Subscription id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of subscription as defined by Stripe
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "subscriptionID", value = "Unique ID of subscription as defined by Stripe")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Subscription ownerNamespaceUuid(String ownerNamespaceUuid) {
    
    this.ownerNamespaceUuid = ownerNamespaceUuid;
    return this;
  }

   /**
   * Unique ID of the array (product) owner
   * @return ownerNamespaceUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique ID of the array (product) owner")

  public String getOwnerNamespaceUuid() {
    return ownerNamespaceUuid;
  }


  public void setOwnerNamespaceUuid(String ownerNamespaceUuid) {
    this.ownerNamespaceUuid = ownerNamespaceUuid;
  }


  public Subscription customerNamespaceUuid(String customerNamespaceUuid) {
    
    this.customerNamespaceUuid = customerNamespaceUuid;
    return this;
  }

   /**
   * Unique ID of the array (product) user (customer)
   * @return customerNamespaceUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique ID of the array (product) user (customer)")

  public String getCustomerNamespaceUuid() {
    return customerNamespaceUuid;
  }


  public void setCustomerNamespaceUuid(String customerNamespaceUuid) {
    this.customerNamespaceUuid = customerNamespaceUuid;
  }


  public Subscription pricing(List<Pricing> pricing) {
    
    this.pricing = pricing;
    return this;
  }

  public Subscription addPricingItem(Pricing pricingItem) {
    if (this.pricing == null) {
      this.pricing = new ArrayList<Pricing>();
    }
    this.pricing.add(pricingItem);
    return this;
  }

   /**
   * list of pricing used by this subscription
   * @return pricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of pricing used by this subscription")

  public List<Pricing> getPricing() {
    return pricing;
  }


  public void setPricing(List<Pricing> pricing) {
    this.pricing = pricing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.ownerNamespaceUuid, subscription.ownerNamespaceUuid) &&
        Objects.equals(this.customerNamespaceUuid, subscription.customerNamespaceUuid) &&
        Objects.equals(this.pricing, subscription.pricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerNamespaceUuid, customerNamespaceUuid, pricing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerNamespaceUuid: ").append(toIndentedString(ownerNamespaceUuid)).append("\n");
    sb.append("    customerNamespaceUuid: ").append(toIndentedString(customerNamespaceUuid)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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

}

