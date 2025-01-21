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
import org.openapitools.client.model.Layout;

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
 * Parameterizable version of &#x60;QueryRanges&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class TGQueryRanges {
  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  @javax.annotation.Nullable
  private Layout layout;

  public static final String SERIALIZED_NAME_FRIENDLY_RANGES = "friendly_ranges";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_RANGES)
  @javax.annotation.Nullable
  private Object friendlyRanges;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  @javax.annotation.Nullable
  private Object ranges;

  public TGQueryRanges() {
  }

  public TGQueryRanges layout(@javax.annotation.Nullable Layout layout) {
    this.layout = layout;
    return this;
  }

  /**
   * Get layout
   * @return layout
   */
  @javax.annotation.Nullable
  public Layout getLayout() {
    return layout;
  }

  public void setLayout(@javax.annotation.Nullable Layout layout) {
    this.layout = layout;
  }


  public TGQueryRanges friendlyRanges(@javax.annotation.Nullable Object friendlyRanges) {
    this.friendlyRanges = friendlyRanges;
    return this;
  }

  /**
   * An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a &#x60;TGSentinel&#x60;. For example this Python value:      {\&quot;a\&quot;: [1, \&quot;pipe\&quot;, range(30), None], \&quot;b\&quot;: b\&quot;bytes\&quot;}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \&quot;a\&quot;: [  // As is a list.         1,         \&quot;pipe\&quot;,         {  // A &#x60;range&#x60; is replaced with its pickle.           \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;,           \&quot;format\&quot;: \&quot;python_pickle\&quot;,           \&quot;base64_data\&quot;: \&quot;gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg&#x3D;&#x3D;\&quot;         },         null       ],       \&quot;b\&quot;: {  // Raw binary data is encoded into base64.         \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;         \&quot;format\&quot;: \&quot;bytes\&quot;,         \&quot;base64_data\&quot;: \&quot;Ynl0ZXM&#x3D;\&quot;       }     } 
   * @return friendlyRanges
   */
  @javax.annotation.Nullable
  public Object getFriendlyRanges() {
    return friendlyRanges;
  }

  public void setFriendlyRanges(@javax.annotation.Nullable Object friendlyRanges) {
    this.friendlyRanges = friendlyRanges;
  }


  public TGQueryRanges ranges(@javax.annotation.Nullable Object ranges) {
    this.ranges = ranges;
    return this;
  }

  /**
   * An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a &#x60;TGSentinel&#x60;. For example this Python value:      {\&quot;a\&quot;: [1, \&quot;pipe\&quot;, range(30), None], \&quot;b\&quot;: b\&quot;bytes\&quot;}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \&quot;a\&quot;: [  // As is a list.         1,         \&quot;pipe\&quot;,         {  // A &#x60;range&#x60; is replaced with its pickle.           \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;,           \&quot;format\&quot;: \&quot;python_pickle\&quot;,           \&quot;base64_data\&quot;: \&quot;gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg&#x3D;&#x3D;\&quot;         },         null       ],       \&quot;b\&quot;: {  // Raw binary data is encoded into base64.         \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;         \&quot;format\&quot;: \&quot;bytes\&quot;,         \&quot;base64_data\&quot;: \&quot;Ynl0ZXM&#x3D;\&quot;       }     } 
   * @return ranges
   */
  @javax.annotation.Nullable
  public Object getRanges() {
    return ranges;
  }

  public void setRanges(@javax.annotation.Nullable Object ranges) {
    this.ranges = ranges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TGQueryRanges tgQueryRanges = (TGQueryRanges) o;
    return Objects.equals(this.layout, tgQueryRanges.layout) &&
        Objects.equals(this.friendlyRanges, tgQueryRanges.friendlyRanges) &&
        Objects.equals(this.ranges, tgQueryRanges.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, friendlyRanges, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TGQueryRanges {\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    friendlyRanges: ").append(toIndentedString(friendlyRanges)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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
    openapiFields.add("layout");
    openapiFields.add("friendly_ranges");
    openapiFields.add("ranges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TGQueryRanges
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TGQueryRanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TGQueryRanges is not found in the empty JSON string", TGQueryRanges.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TGQueryRanges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TGQueryRanges` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `layout`
      if (jsonObj.get("layout") != null && !jsonObj.get("layout").isJsonNull()) {
        Layout.validateJsonElement(jsonObj.get("layout"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TGQueryRanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TGQueryRanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TGQueryRanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TGQueryRanges.class));

       return (TypeAdapter<T>) new TypeAdapter<TGQueryRanges>() {
           @Override
           public void write(JsonWriter out, TGQueryRanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TGQueryRanges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TGQueryRanges given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TGQueryRanges
   * @throws IOException if the JSON string is invalid with respect to TGQueryRanges
   */
  public static TGQueryRanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TGQueryRanges.class);
  }

  /**
   * Convert an instance of TGQueryRanges to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

