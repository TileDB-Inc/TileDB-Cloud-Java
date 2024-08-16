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
 * Custom storage locations on a per–asset type basis. If any is unset, a suffix of the owning (user/organization) &#x60;default_s3_path&#x60; is used. 
 */
@ApiModel(description = "Custom storage locations on a per–asset type basis. If any is unset, a suffix of the owning (user/organization) `default_s3_path` is used. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class AssetLocations {
  public static final String SERIALIZED_NAME_ARRAYS = "arrays";
  @SerializedName(SERIALIZED_NAME_ARRAYS)
  private StorageLocation arrays;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private StorageLocation files;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private StorageLocation groups;

  public static final String SERIALIZED_NAME_ML_MODELS = "ml_models";
  @SerializedName(SERIALIZED_NAME_ML_MODELS)
  private StorageLocation mlModels;

  public static final String SERIALIZED_NAME_NOTEBOOKS = "notebooks";
  @SerializedName(SERIALIZED_NAME_NOTEBOOKS)
  private StorageLocation notebooks;

  public static final String SERIALIZED_NAME_TASK_GRAPHS = "task_graphs";
  @SerializedName(SERIALIZED_NAME_TASK_GRAPHS)
  private StorageLocation taskGraphs;

  public static final String SERIALIZED_NAME_UDFS = "udfs";
  @SerializedName(SERIALIZED_NAME_UDFS)
  private StorageLocation udfs;

  public AssetLocations() {
  }

  public AssetLocations arrays(StorageLocation arrays) {
    
    this.arrays = arrays;
    return this;
  }

   /**
   * Get arrays
   * @return arrays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getArrays() {
    return arrays;
  }


  public void setArrays(StorageLocation arrays) {
    this.arrays = arrays;
  }


  public AssetLocations files(StorageLocation files) {
    
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getFiles() {
    return files;
  }


  public void setFiles(StorageLocation files) {
    this.files = files;
  }


  public AssetLocations groups(StorageLocation groups) {
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getGroups() {
    return groups;
  }


  public void setGroups(StorageLocation groups) {
    this.groups = groups;
  }


  public AssetLocations mlModels(StorageLocation mlModels) {
    
    this.mlModels = mlModels;
    return this;
  }

   /**
   * Get mlModels
   * @return mlModels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getMlModels() {
    return mlModels;
  }


  public void setMlModels(StorageLocation mlModels) {
    this.mlModels = mlModels;
  }


  public AssetLocations notebooks(StorageLocation notebooks) {
    
    this.notebooks = notebooks;
    return this;
  }

   /**
   * Get notebooks
   * @return notebooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getNotebooks() {
    return notebooks;
  }


  public void setNotebooks(StorageLocation notebooks) {
    this.notebooks = notebooks;
  }


  public AssetLocations taskGraphs(StorageLocation taskGraphs) {
    
    this.taskGraphs = taskGraphs;
    return this;
  }

   /**
   * Get taskGraphs
   * @return taskGraphs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getTaskGraphs() {
    return taskGraphs;
  }


  public void setTaskGraphs(StorageLocation taskGraphs) {
    this.taskGraphs = taskGraphs;
  }


  public AssetLocations udfs(StorageLocation udfs) {
    
    this.udfs = udfs;
    return this;
  }

   /**
   * Get udfs
   * @return udfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageLocation getUdfs() {
    return udfs;
  }


  public void setUdfs(StorageLocation udfs) {
    this.udfs = udfs;
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
  public AssetLocations putAdditionalProperty(String key, Object value) {
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
    AssetLocations assetLocations = (AssetLocations) o;
    return Objects.equals(this.arrays, assetLocations.arrays) &&
        Objects.equals(this.files, assetLocations.files) &&
        Objects.equals(this.groups, assetLocations.groups) &&
        Objects.equals(this.mlModels, assetLocations.mlModels) &&
        Objects.equals(this.notebooks, assetLocations.notebooks) &&
        Objects.equals(this.taskGraphs, assetLocations.taskGraphs) &&
        Objects.equals(this.udfs, assetLocations.udfs)&&
        Objects.equals(this.additionalProperties, assetLocations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrays, files, groups, mlModels, notebooks, taskGraphs, udfs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetLocations {\n");
    sb.append("    arrays: ").append(toIndentedString(arrays)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    mlModels: ").append(toIndentedString(mlModels)).append("\n");
    sb.append("    notebooks: ").append(toIndentedString(notebooks)).append("\n");
    sb.append("    taskGraphs: ").append(toIndentedString(taskGraphs)).append("\n");
    sb.append("    udfs: ").append(toIndentedString(udfs)).append("\n");
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
    openapiFields.add("arrays");
    openapiFields.add("files");
    openapiFields.add("groups");
    openapiFields.add("ml_models");
    openapiFields.add("notebooks");
    openapiFields.add("task_graphs");
    openapiFields.add("udfs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetLocations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetLocations.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetLocations is not found in the empty JSON string", AssetLocations.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `arrays`
      if (jsonObj.get("arrays") != null && !jsonObj.get("arrays").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("arrays"));
      }
      // validate the optional field `files`
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("files"));
      }
      // validate the optional field `groups`
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("groups"));
      }
      // validate the optional field `ml_models`
      if (jsonObj.get("ml_models") != null && !jsonObj.get("ml_models").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("ml_models"));
      }
      // validate the optional field `notebooks`
      if (jsonObj.get("notebooks") != null && !jsonObj.get("notebooks").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("notebooks"));
      }
      // validate the optional field `task_graphs`
      if (jsonObj.get("task_graphs") != null && !jsonObj.get("task_graphs").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("task_graphs"));
      }
      // validate the optional field `udfs`
      if (jsonObj.get("udfs") != null && !jsonObj.get("udfs").isJsonNull()) {
        StorageLocation.validateJsonObject(jsonObj.getAsJsonObject("udfs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetLocations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetLocations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetLocations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetLocations.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetLocations>() {
           @Override
           public void write(JsonWriter out, AssetLocations value) throws IOException {
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
           public AssetLocations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssetLocations instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssetLocations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetLocations
  * @throws IOException if the JSON string is invalid with respect to AssetLocations
  */
  public static AssetLocations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetLocations.class);
  }

 /**
  * Convert an instance of AssetLocations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

