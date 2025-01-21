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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GroupContentActivity;
import org.openapitools.client.model.PaginationMetadata;

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
 * Object containing activity logs of group content along with the pagination metadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class GroupContentActivityResponse {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  @javax.annotation.Nullable
  private List<GroupContentActivity> activity = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGINATION_METADATA = "pagination_metadata";
  @SerializedName(SERIALIZED_NAME_PAGINATION_METADATA)
  @javax.annotation.Nullable
  private PaginationMetadata paginationMetadata;

  public GroupContentActivityResponse() {
  }

  public GroupContentActivityResponse activity(@javax.annotation.Nullable List<GroupContentActivity> activity) {
    this.activity = activity;
    return this;
  }

  public GroupContentActivityResponse addActivityItem(GroupContentActivity activityItem) {
    if (this.activity == null) {
      this.activity = new ArrayList<>();
    }
    this.activity.add(activityItem);
    return this;
  }

  /**
   * Activity of a group&#39;s content
   * @return activity
   */
  @javax.annotation.Nullable
  public List<GroupContentActivity> getActivity() {
    return activity;
  }

  public void setActivity(@javax.annotation.Nullable List<GroupContentActivity> activity) {
    this.activity = activity;
  }


  public GroupContentActivityResponse paginationMetadata(@javax.annotation.Nullable PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
    return this;
  }

  /**
   * Get paginationMetadata
   * @return paginationMetadata
   */
  @javax.annotation.Nullable
  public PaginationMetadata getPaginationMetadata() {
    return paginationMetadata;
  }

  public void setPaginationMetadata(@javax.annotation.Nullable PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupContentActivityResponse groupContentActivityResponse = (GroupContentActivityResponse) o;
    return Objects.equals(this.activity, groupContentActivityResponse.activity) &&
        Objects.equals(this.paginationMetadata, groupContentActivityResponse.paginationMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, paginationMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupContentActivityResponse {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    paginationMetadata: ").append(toIndentedString(paginationMetadata)).append("\n");
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
    openapiFields.add("activity");
    openapiFields.add("pagination_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupContentActivityResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupContentActivityResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupContentActivityResponse is not found in the empty JSON string", GroupContentActivityResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupContentActivityResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupContentActivityResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("activity") != null && !jsonObj.get("activity").isJsonNull()) {
        JsonArray jsonArrayactivity = jsonObj.getAsJsonArray("activity");
        if (jsonArrayactivity != null) {
          // ensure the json data is an array
          if (!jsonObj.get("activity").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `activity` to be an array in the JSON string but got `%s`", jsonObj.get("activity").toString()));
          }

          // validate the optional field `activity` (array)
          for (int i = 0; i < jsonArrayactivity.size(); i++) {
            GroupContentActivity.validateJsonElement(jsonArrayactivity.get(i));
          };
        }
      }
      // validate the optional field `pagination_metadata`
      if (jsonObj.get("pagination_metadata") != null && !jsonObj.get("pagination_metadata").isJsonNull()) {
        PaginationMetadata.validateJsonElement(jsonObj.get("pagination_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupContentActivityResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupContentActivityResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupContentActivityResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupContentActivityResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupContentActivityResponse>() {
           @Override
           public void write(JsonWriter out, GroupContentActivityResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupContentActivityResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupContentActivityResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupContentActivityResponse
   * @throws IOException if the JSON string is invalid with respect to GroupContentActivityResponse
   */
  public static GroupContentActivityResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupContentActivityResponse.class);
  }

  /**
   * Convert an instance of GroupContentActivityResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

