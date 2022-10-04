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


package io.tiledb.cloud.rest_api.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.tiledb.cloud.rest_api.JSON;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Subscription of a user (customer) to another user&#39;s arrays
 */
@ApiModel(description = "Subscription of a user (customer) to another user's arrays")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
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
      this.pricing = new ArrayList<>();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("owner_namespace_uuid");
    openapiFields.add("customer_namespace_uuid");
    openapiFields.add("pricing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Subscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Subscription.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subscription is not found in the empty JSON string", Subscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!Subscription.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subscription` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("owner_namespace_uuid") != null && !jsonObj.get("owner_namespace_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_namespace_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_namespace_uuid").toString()));
      }
      if (jsonObj.get("customer_namespace_uuid") != null && !jsonObj.get("customer_namespace_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_namespace_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_namespace_uuid").toString()));
      }
      JsonArray jsonArraypricing = jsonObj.getAsJsonArray("pricing");
      if (jsonArraypricing != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pricing").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pricing` to be an array in the JSON string but got `%s`", jsonObj.get("pricing").toString()));
        }

        // validate the optional field `pricing` (array)
        for (int i = 0; i < jsonArraypricing.size(); i++) {
          Pricing.validateJsonObject(jsonArraypricing.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subscription.class));

       return (TypeAdapter<T>) new TypeAdapter<Subscription>() {
           @Override
           public void write(JsonWriter out, Subscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Subscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Subscription
  * @throws IOException if the JSON string is invalid with respect to Subscription
  */
  public static Subscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subscription.class);
  }

 /**
  * Convert an instance of Subscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
