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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.tiledb.cloud.rest_api.JSON;

/**
 * Model representing aws keys or service role, service roles are currently ignored, but will be preferred option in the future
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class AWSAccessCredentials {
  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY = "secret_access_key";
  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY)
  private String secretAccessKey;

  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access_key_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_SERVICE_ROLE_ARN = "service_role_arn";
  @SerializedName(SERIALIZED_NAME_SERVICE_ROLE_ARN)
  private String serviceRoleArn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_BUCKETS = "buckets";
  @SerializedName(SERIALIZED_NAME_BUCKETS)
  private List<String> buckets = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AWSAccessCredentials() {
  }

  public AWSAccessCredentials(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public AWSAccessCredentials secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * aws secret access key, never returned in get requests
   * @return secretAccessKey
   */
  @javax.annotation.Nullable
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  public AWSAccessCredentials accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * aws access key
   * @return accessKeyId
   */
  @javax.annotation.Nullable
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AWSAccessCredentials serviceRoleArn(String serviceRoleArn) {
    this.serviceRoleArn = serviceRoleArn;
    return this;
  }

  /**
   * aws service role to use for access
   * @return serviceRoleArn
   */
  @javax.annotation.Nullable
  public String getServiceRoleArn() {
    return serviceRoleArn;
  }

  public void setServiceRoleArn(String serviceRoleArn) {
    this.serviceRoleArn = serviceRoleArn;
  }


  public AWSAccessCredentials name(String name) {
    this.name = name;
    return this;
  }

  /**
   * human readable name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AWSAccessCredentials _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * true if this is the default credential to be used within this namespace
   * @return _default
   */
  @javax.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public AWSAccessCredentials buckets(List<String> buckets) {
    this.buckets = buckets;
    return this;
  }

  public AWSAccessCredentials addBucketsItem(String bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    return this;
  }

  /**
   * a whitelist of one or more buckets this key should access
   * @return buckets
   */
  @javax.annotation.Nullable
  public List<String> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<String> buckets) {
    this.buckets = buckets;
  }


  /**
   * Time when UDF dependencies were created (rfc3339)
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Time when UDF dependencies was last updated (rfc3339)
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AWSAccessCredentials instance itself
   */
  public AWSAccessCredentials putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
    AWSAccessCredentials awSAccessCredentials = (AWSAccessCredentials) o;
    return Objects.equals(this.secretAccessKey, awSAccessCredentials.secretAccessKey) &&
        Objects.equals(this.accessKeyId, awSAccessCredentials.accessKeyId) &&
        Objects.equals(this.serviceRoleArn, awSAccessCredentials.serviceRoleArn) &&
        Objects.equals(this.name, awSAccessCredentials.name) &&
        Objects.equals(this._default, awSAccessCredentials._default) &&
        Objects.equals(this.buckets, awSAccessCredentials.buckets) &&
        Objects.equals(this.createdAt, awSAccessCredentials.createdAt) &&
        Objects.equals(this.updatedAt, awSAccessCredentials.updatedAt)&&
        Objects.equals(this.additionalProperties, awSAccessCredentials.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretAccessKey, accessKeyId, serviceRoleArn, name, _default, buckets, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccessCredentials {\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    serviceRoleArn: ").append(toIndentedString(serviceRoleArn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("secret_access_key");
    openapiFields.add("access_key_id");
    openapiFields.add("service_role_arn");
    openapiFields.add("name");
    openapiFields.add("default");
    openapiFields.add("buckets");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AWSAccessCredentials
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AWSAccessCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AWSAccessCredentials is not found in the empty JSON string", AWSAccessCredentials.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("secret_access_key") != null && !jsonObj.get("secret_access_key").isJsonNull()) && !jsonObj.get("secret_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_access_key").toString()));
      }
      if ((jsonObj.get("access_key_id") != null && !jsonObj.get("access_key_id").isJsonNull()) && !jsonObj.get("access_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_key_id").toString()));
      }
      if ((jsonObj.get("service_role_arn") != null && !jsonObj.get("service_role_arn").isJsonNull()) && !jsonObj.get("service_role_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_role_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_role_arn").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buckets") != null && !jsonObj.get("buckets").isJsonNull() && !jsonObj.get("buckets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buckets` to be an array in the JSON string but got `%s`", jsonObj.get("buckets").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AWSAccessCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AWSAccessCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AWSAccessCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AWSAccessCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<AWSAccessCredentials>() {
           @Override
           public void write(JsonWriter out, AWSAccessCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AWSAccessCredentials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AWSAccessCredentials instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
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
   * Create an instance of AWSAccessCredentials given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AWSAccessCredentials
   * @throws IOException if the JSON string is invalid with respect to AWSAccessCredentials
   */
  public static AWSAccessCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AWSAccessCredentials.class);
  }

  /**
   * Convert an instance of AWSAccessCredentials to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

