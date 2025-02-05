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


package io.tiledb.cloud.rest_api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * A user-favorite MLModel item
 */
@ApiModel(description = "A user-favorite MLModel item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class MLModelFavorite {
  public static final String SERIALIZED_NAME_MLMODEL_UUID = "mlmodel_uuid";
  @SerializedName(SERIALIZED_NAME_MLMODEL_UUID)
  private String mlmodelUuid;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public MLModelFavorite() {
  }

  public MLModelFavorite mlmodelUuid(String mlmodelUuid) {
    
    this.mlmodelUuid = mlmodelUuid;
    return this;
  }

   /**
   * unique UUID of the MLModel
   * @return mlmodelUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique UUID of the MLModel")

  public String getMlmodelUuid() {
    return mlmodelUuid;
  }


  public void setMlmodelUuid(String mlmodelUuid) {
    this.mlmodelUuid = mlmodelUuid;
  }


  public MLModelFavorite namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * the namespace of the MLModel
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the namespace of the MLModel")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public MLModelFavorite name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of the MLModel
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the MLModel")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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
  public MLModelFavorite putAdditionalProperty(String key, Object value) {
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
    MLModelFavorite mlModelFavorite = (MLModelFavorite) o;
    return Objects.equals(this.mlmodelUuid, mlModelFavorite.mlmodelUuid) &&
        Objects.equals(this.namespace, mlModelFavorite.namespace) &&
        Objects.equals(this.name, mlModelFavorite.name)&&
        Objects.equals(this.additionalProperties, mlModelFavorite.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mlmodelUuid, namespace, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MLModelFavorite {\n");
    sb.append("    mlmodelUuid: ").append(toIndentedString(mlmodelUuid)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("mlmodel_uuid");
    openapiFields.add("namespace");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MLModelFavorite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MLModelFavorite.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MLModelFavorite is not found in the empty JSON string", MLModelFavorite.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("mlmodel_uuid") != null && !jsonObj.get("mlmodel_uuid").isJsonNull()) && !jsonObj.get("mlmodel_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mlmodel_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mlmodel_uuid").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MLModelFavorite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MLModelFavorite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MLModelFavorite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MLModelFavorite.class));

       return (TypeAdapter<T>) new TypeAdapter<MLModelFavorite>() {
           @Override
           public void write(JsonWriter out, MLModelFavorite value) throws IOException {
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
           public MLModelFavorite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MLModelFavorite instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MLModelFavorite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MLModelFavorite
  * @throws IOException if the JSON string is invalid with respect to MLModelFavorite
  */
  public static MLModelFavorite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MLModelFavorite.class);
  }

 /**
  * Convert an instance of MLModelFavorite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

