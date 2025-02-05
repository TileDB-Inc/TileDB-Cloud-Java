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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Status details of a notebook server
 */
@ApiModel(description = "Status details of a notebook server")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class NotebookStatus {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_UPTIME = "uptime";
  @SerializedName(SERIALIZED_NAME_UPTIME)
  private Integer uptime;

  public static final String SERIALIZED_NAME_CPU_USAGE = "cpu_usage";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE)
  private Integer cpuUsage;

  public static final String SERIALIZED_NAME_GPU_USAGE = "gpu_usage";
  @SerializedName(SERIALIZED_NAME_GPU_USAGE)
  private Integer gpuUsage;

  public static final String SERIALIZED_NAME_MEMORY_USAGE = "memory_usage";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE)
  private Integer memoryUsage;

  public static final String SERIALIZED_NAME_GPU_LIMIT = "gpu_limit";
  @SerializedName(SERIALIZED_NAME_GPU_LIMIT)
  private Integer gpuLimit;

  public static final String SERIALIZED_NAME_MEMORY_LIMIT = "memory_limit";
  @SerializedName(SERIALIZED_NAME_MEMORY_LIMIT)
  private Integer memoryLimit;

  public static final String SERIALIZED_NAME_STORAGE_USAGE = "storage_usage";
  @SerializedName(SERIALIZED_NAME_STORAGE_USAGE)
  private Integer storageUsage;

  public static final String SERIALIZED_NAME_STORAGE_LIMIT = "storage_limit";
  @SerializedName(SERIALIZED_NAME_STORAGE_LIMIT)
  private Integer storageLimit;

  public static final String SERIALIZED_NAME_CPU_COUNT = "cpu_count";
  @SerializedName(SERIALIZED_NAME_CPU_COUNT)
  private Integer cpuCount;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public static final String SERIALIZED_NAME_POD_STATUS = "pod_status";
  @SerializedName(SERIALIZED_NAME_POD_STATUS)
  private PodStatus podStatus;

  public NotebookStatus() {
  }

  public NotebookStatus namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * namespace of notebook
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "namespace of notebook")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public NotebookStatus uptime(Integer uptime) {
    
    this.uptime = uptime;
    return this;
  }

   /**
   * duration notebook has been running in seconds
   * @return uptime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "duration notebook has been running in seconds")

  public Integer getUptime() {
    return uptime;
  }


  public void setUptime(Integer uptime) {
    this.uptime = uptime;
  }


  public NotebookStatus cpuUsage(Integer cpuUsage) {
    
    this.cpuUsage = cpuUsage;
    return this;
  }

   /**
   * current cpu usage in millicpu
   * @return cpuUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4000", value = "current cpu usage in millicpu")

  public Integer getCpuUsage() {
    return cpuUsage;
  }


  public void setCpuUsage(Integer cpuUsage) {
    this.cpuUsage = cpuUsage;
  }


  public NotebookStatus gpuUsage(Integer gpuUsage) {
    
    this.gpuUsage = gpuUsage;
    return this;
  }

   /**
   * gpu usage in milligpu
   * @return gpuUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4000", value = "gpu usage in milligpu")

  public Integer getGpuUsage() {
    return gpuUsage;
  }


  public void setGpuUsage(Integer gpuUsage) {
    this.gpuUsage = gpuUsage;
  }


  public NotebookStatus memoryUsage(Integer memoryUsage) {
    
    this.memoryUsage = memoryUsage;
    return this;
  }

   /**
   * memory usage in bytes
   * @return memoryUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "memory usage in bytes")

  public Integer getMemoryUsage() {
    return memoryUsage;
  }


  public void setMemoryUsage(Integer memoryUsage) {
    this.memoryUsage = memoryUsage;
  }


  public NotebookStatus gpuLimit(Integer gpuLimit) {
    
    this.gpuLimit = gpuLimit;
    return this;
  }

   /**
   * gpu limit in milligpu
   * @return gpuLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "gpu limit in milligpu")

  public Integer getGpuLimit() {
    return gpuLimit;
  }


  public void setGpuLimit(Integer gpuLimit) {
    this.gpuLimit = gpuLimit;
  }


  public NotebookStatus memoryLimit(Integer memoryLimit) {
    
    this.memoryLimit = memoryLimit;
    return this;
  }

   /**
   * memory allocated to notebook server in bytes
   * @return memoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "memory allocated to notebook server in bytes")

  public Integer getMemoryLimit() {
    return memoryLimit;
  }


  public void setMemoryLimit(Integer memoryLimit) {
    this.memoryLimit = memoryLimit;
  }


  public NotebookStatus storageUsage(Integer storageUsage) {
    
    this.storageUsage = storageUsage;
    return this;
  }

   /**
   * storage usage in bytes
   * @return storageUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "storage usage in bytes")

  public Integer getStorageUsage() {
    return storageUsage;
  }


  public void setStorageUsage(Integer storageUsage) {
    this.storageUsage = storageUsage;
  }


  public NotebookStatus storageLimit(Integer storageLimit) {
    
    this.storageLimit = storageLimit;
    return this;
  }

   /**
   * storage allocated to notebook server in bytes
   * @return storageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "storage allocated to notebook server in bytes")

  public Integer getStorageLimit() {
    return storageLimit;
  }


  public void setStorageLimit(Integer storageLimit) {
    this.storageLimit = storageLimit;
  }


  public NotebookStatus cpuCount(Integer cpuCount) {
    
    this.cpuCount = cpuCount;
    return this;
  }

   /**
   * millicpu allocated to notebook server
   * @return cpuCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4000", value = "millicpu allocated to notebook server")

  public Integer getCpuCount() {
    return cpuCount;
  }


  public void setCpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
  }


  public NotebookStatus cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * cost in USD for the current notebook session
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.27", value = "cost in USD for the current notebook session")

  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public NotebookStatus podStatus(PodStatus podStatus) {
    
    this.podStatus = podStatus;
    return this;
  }

   /**
   * Get podStatus
   * @return podStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PodStatus getPodStatus() {
    return podStatus;
  }


  public void setPodStatus(PodStatus podStatus) {
    this.podStatus = podStatus;
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
  public NotebookStatus putAdditionalProperty(String key, Object value) {
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
    NotebookStatus notebookStatus = (NotebookStatus) o;
    return Objects.equals(this.namespace, notebookStatus.namespace) &&
        Objects.equals(this.uptime, notebookStatus.uptime) &&
        Objects.equals(this.cpuUsage, notebookStatus.cpuUsage) &&
        Objects.equals(this.gpuUsage, notebookStatus.gpuUsage) &&
        Objects.equals(this.memoryUsage, notebookStatus.memoryUsage) &&
        Objects.equals(this.gpuLimit, notebookStatus.gpuLimit) &&
        Objects.equals(this.memoryLimit, notebookStatus.memoryLimit) &&
        Objects.equals(this.storageUsage, notebookStatus.storageUsage) &&
        Objects.equals(this.storageLimit, notebookStatus.storageLimit) &&
        Objects.equals(this.cpuCount, notebookStatus.cpuCount) &&
        Objects.equals(this.cost, notebookStatus.cost) &&
        Objects.equals(this.podStatus, notebookStatus.podStatus)&&
        Objects.equals(this.additionalProperties, notebookStatus.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, uptime, cpuUsage, gpuUsage, memoryUsage, gpuLimit, memoryLimit, storageUsage, storageLimit, cpuCount, cost, podStatus, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookStatus {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    gpuUsage: ").append(toIndentedString(gpuUsage)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    gpuLimit: ").append(toIndentedString(gpuLimit)).append("\n");
    sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
    sb.append("    storageUsage: ").append(toIndentedString(storageUsage)).append("\n");
    sb.append("    storageLimit: ").append(toIndentedString(storageLimit)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    podStatus: ").append(toIndentedString(podStatus)).append("\n");
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
    openapiFields.add("namespace");
    openapiFields.add("uptime");
    openapiFields.add("cpu_usage");
    openapiFields.add("gpu_usage");
    openapiFields.add("memory_usage");
    openapiFields.add("gpu_limit");
    openapiFields.add("memory_limit");
    openapiFields.add("storage_usage");
    openapiFields.add("storage_limit");
    openapiFields.add("cpu_count");
    openapiFields.add("cost");
    openapiFields.add("pod_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotebookStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NotebookStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotebookStatus is not found in the empty JSON string", NotebookStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotebookStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotebookStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotebookStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotebookStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<NotebookStatus>() {
           @Override
           public void write(JsonWriter out, NotebookStatus value) throws IOException {
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
           public NotebookStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NotebookStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NotebookStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotebookStatus
  * @throws IOException if the JSON string is invalid with respect to NotebookStatus
  */
  public static NotebookStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotebookStatus.class);
  }

 /**
  * Convert an instance of NotebookStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

