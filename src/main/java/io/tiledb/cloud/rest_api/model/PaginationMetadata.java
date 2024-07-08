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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.JSON;

/**
 * PaginationMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
/**
 * @deprecated This class is now moved to io.tiledb.cloud.rest_api.v1.model
 */
@Deprecated
public class PaginationMetadata {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private BigDecimal page;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private BigDecimal perPage;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private BigDecimal totalPages;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "total_items";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private BigDecimal totalItems;

  public PaginationMetadata() {
  }

  public PaginationMetadata page(BigDecimal page) {
    
    this.page = page;
    return this;
  }

   /**
   * pagination offset. Use it to skip the first ((page - 1) * per_page) items
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "pagination offset. Use it to skip the first ((page - 1) * per_page) items")

  public BigDecimal getPage() {
    return page;
  }


  public void setPage(BigDecimal page) {
    this.page = page;
  }


  public PaginationMetadata perPage(BigDecimal perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * pagination limit (page size)
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "pagination limit (page size)")

  public BigDecimal getPerPage() {
    return perPage;
  }


  public void setPerPage(BigDecimal perPage) {
    this.perPage = perPage;
  }


  public PaginationMetadata totalPages(BigDecimal totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * number of total pages with current limit
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14.0", value = "number of total pages with current limit")

  public BigDecimal getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(BigDecimal totalPages) {
    this.totalPages = totalPages;
  }


  public PaginationMetadata totalItems(BigDecimal totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * number of total available items
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "138.0", value = "number of total available items")

  public BigDecimal getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(BigDecimal totalItems) {
    this.totalItems = totalItems;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public PaginationMetadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationMetadata paginationMetadata = (PaginationMetadata) o;
    return Objects.equals(this.page, paginationMetadata.page) &&
        Objects.equals(this.perPage, paginationMetadata.perPage) &&
        Objects.equals(this.totalPages, paginationMetadata.totalPages) &&
        Objects.equals(this.totalItems, paginationMetadata.totalItems)&&
        Objects.equals(this.additionalProperties, paginationMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, perPage, totalPages, totalItems, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationMetadata {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("per_page");
    openapiFields.add("total_pages");
    openapiFields.add("total_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaginationMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaginationMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaginationMetadata is not found in the empty JSON string", PaginationMetadata.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaginationMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaginationMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaginationMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaginationMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<PaginationMetadata>() {
           @Override
           public void write(JsonWriter out, PaginationMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PaginationMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaginationMetadata instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaginationMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaginationMetadata
  * @throws IOException if the JSON string is invalid with respect to PaginationMetadata
  */
  public static PaginationMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaginationMetadata.class);
  }

 /**
  * Convert an instance of PaginationMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

