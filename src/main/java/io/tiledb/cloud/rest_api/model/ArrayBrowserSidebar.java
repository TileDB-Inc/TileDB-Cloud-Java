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
 * Object for ui array tasks browser page
 */
@ApiModel(description = "Object for ui array tasks browser page")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class ArrayBrowserSidebar {
  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces = null;

  public static final String SERIALIZED_NAME_RESULT_COUNT_FOR_ALL = "result_count_for_all";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT_FOR_ALL)
  private Integer resultCountForAll;

  public static final String SERIALIZED_NAME_RESULT_COUNT_BY_NAMESPACE = "result_count_by_namespace";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT_BY_NAMESPACE)
  private Object resultCountByNamespace;

  public ArrayBrowserSidebar() {
  }

  public ArrayBrowserSidebar namespaces(List<String> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public ArrayBrowserSidebar addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * list of all unique namespaces to display
   * @return namespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of all unique namespaces to display")

  public List<String> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public ArrayBrowserSidebar resultCountForAll(Integer resultCountForAll) {
    
    this.resultCountForAll = resultCountForAll;
    return this;
  }

   /**
   * A count of \&quot;all\&quot; of category
   * @return resultCountForAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A count of \"all\" of category")

  public Integer getResultCountForAll() {
    return resultCountForAll;
  }


  public void setResultCountForAll(Integer resultCountForAll) {
    this.resultCountForAll = resultCountForAll;
  }


  public ArrayBrowserSidebar resultCountByNamespace(Object resultCountByNamespace) {
    
    this.resultCountByNamespace = resultCountByNamespace;
    return this;
  }

   /**
   * A map that includes the result count by namespace
   * @return resultCountByNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map that includes the result count by namespace")

  public Object getResultCountByNamespace() {
    return resultCountByNamespace;
  }


  public void setResultCountByNamespace(Object resultCountByNamespace) {
    this.resultCountByNamespace = resultCountByNamespace;
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
  public ArrayBrowserSidebar putAdditionalProperty(String key, Object value) {
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
    ArrayBrowserSidebar arrayBrowserSidebar = (ArrayBrowserSidebar) o;
    return Objects.equals(this.namespaces, arrayBrowserSidebar.namespaces) &&
        Objects.equals(this.resultCountForAll, arrayBrowserSidebar.resultCountForAll) &&
        Objects.equals(this.resultCountByNamespace, arrayBrowserSidebar.resultCountByNamespace)&&
        Objects.equals(this.additionalProperties, arrayBrowserSidebar.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces, resultCountForAll, resultCountByNamespace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayBrowserSidebar {\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    resultCountForAll: ").append(toIndentedString(resultCountForAll)).append("\n");
    sb.append("    resultCountByNamespace: ").append(toIndentedString(resultCountByNamespace)).append("\n");
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
    openapiFields.add("namespaces");
    openapiFields.add("result_count_for_all");
    openapiFields.add("result_count_by_namespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArrayBrowserSidebar
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArrayBrowserSidebar.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayBrowserSidebar is not found in the empty JSON string", ArrayBrowserSidebar.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("namespaces") != null && !jsonObj.get("namespaces").isJsonNull()) && !jsonObj.get("namespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaces` to be an array in the JSON string but got `%s`", jsonObj.get("namespaces").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayBrowserSidebar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayBrowserSidebar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayBrowserSidebar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayBrowserSidebar.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayBrowserSidebar>() {
           @Override
           public void write(JsonWriter out, ArrayBrowserSidebar value) throws IOException {
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
           public ArrayBrowserSidebar read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArrayBrowserSidebar instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArrayBrowserSidebar given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayBrowserSidebar
  * @throws IOException if the JSON string is invalid with respect to ArrayBrowserSidebar
  */
  public static ArrayBrowserSidebar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayBrowserSidebar.class);
  }

 /**
  * Convert an instance of ArrayBrowserSidebar to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

