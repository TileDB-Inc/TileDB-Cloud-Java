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


package io.tiledb.cloud.rest_api.v1.model;

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

import io.tiledb.cloud.rest_api.v1.JSON;

/**
 * Parameterizable version of &#x60;QueryRanges&#x60;.
 */
@ApiModel(description = "Parameterizable version of `QueryRanges`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class TGQueryRanges {
  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private Layout layout;

  public static final String SERIALIZED_NAME_FRIENDLY_RANGES = "friendly_ranges";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_RANGES)
  private Object friendlyRanges;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private Object ranges;

  public TGQueryRanges() {
  }

  public TGQueryRanges layout(Layout layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Layout getLayout() {
    return layout;
  }


  public void setLayout(Layout layout) {
    this.layout = layout;
  }


  public TGQueryRanges friendlyRanges(Object friendlyRanges) {
    
    this.friendlyRanges = friendlyRanges;
    return this;
  }

   /**
   * An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a &#x60;TGSentinel&#x60;. For example this Python value:      {\&quot;a\&quot;: [1, \&quot;pipe\&quot;, range(30), None], \&quot;b\&quot;: b\&quot;bytes\&quot;}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \&quot;a\&quot;: [  // As is a list.         1,         \&quot;pipe\&quot;,         {  // A &#x60;range&#x60; is replaced with its pickle.           \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;,           \&quot;format\&quot;: \&quot;python_pickle\&quot;,           \&quot;base64_data\&quot;: \&quot;gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg&#x3D;&#x3D;\&quot;         },         null       ],       \&quot;b\&quot;: {  // Raw binary data is encoded into base64.         \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;         \&quot;format\&quot;: \&quot;bytes\&quot;,         \&quot;base64_data\&quot;: \&quot;Ynl0ZXM&#x3D;\&quot;       }     } 
   * @return friendlyRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a `TGSentinel`. For example this Python value:      {\"a\": [1, \"pipe\", range(30), None], \"b\": b\"bytes\"}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \"a\": [  // As is a list.         1,         \"pipe\",         {  // A `range` is replaced with its pickle.           \"__tdbudf__\": \"immediate\",           \"format\": \"python_pickle\",           \"base64_data\": \"gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg==\"         },         null       ],       \"b\": {  // Raw binary data is encoded into base64.         \"__tdbudf__\": \"immediate\"         \"format\": \"bytes\",         \"base64_data\": \"Ynl0ZXM=\"       }     } ")

  public Object getFriendlyRanges() {
    return friendlyRanges;
  }


  public void setFriendlyRanges(Object friendlyRanges) {
    this.friendlyRanges = friendlyRanges;
  }


  public TGQueryRanges ranges(Object ranges) {
    
    this.ranges = ranges;
    return this;
  }

   /**
   * An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a &#x60;TGSentinel&#x60;. For example this Python value:      {\&quot;a\&quot;: [1, \&quot;pipe\&quot;, range(30), None], \&quot;b\&quot;: b\&quot;bytes\&quot;}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \&quot;a\&quot;: [  // As is a list.         1,         \&quot;pipe\&quot;,         {  // A &#x60;range&#x60; is replaced with its pickle.           \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;,           \&quot;format\&quot;: \&quot;python_pickle\&quot;,           \&quot;base64_data\&quot;: \&quot;gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg&#x3D;&#x3D;\&quot;         },         null       ],       \&quot;b\&quot;: {  // Raw binary data is encoded into base64.         \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;         \&quot;format\&quot;: \&quot;bytes\&quot;,         \&quot;base64_data\&quot;: \&quot;Ynl0ZXM&#x3D;\&quot;       }     } 
   * @return ranges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a `TGSentinel`. For example this Python value:      {\"a\": [1, \"pipe\", range(30), None], \"b\": b\"bytes\"}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \"a\": [  // As is a list.         1,         \"pipe\",         {  // A `range` is replaced with its pickle.           \"__tdbudf__\": \"immediate\",           \"format\": \"python_pickle\",           \"base64_data\": \"gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg==\"         },         null       ],       \"b\": {  // Raw binary data is encoded into base64.         \"__tdbudf__\": \"immediate\"         \"format\": \"bytes\",         \"base64_data\": \"Ynl0ZXM=\"       }     } ")

  public Object getRanges() {
    return ranges;
  }


  public void setRanges(Object ranges) {
    this.ranges = ranges;
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
  public TGQueryRanges putAdditionalProperty(String key, Object value) {
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
    TGQueryRanges tgQueryRanges = (TGQueryRanges) o;
    return Objects.equals(this.layout, tgQueryRanges.layout) &&
        Objects.equals(this.friendlyRanges, tgQueryRanges.friendlyRanges) &&
        Objects.equals(this.ranges, tgQueryRanges.ranges)&&
        Objects.equals(this.additionalProperties, tgQueryRanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, friendlyRanges, ranges, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TGQueryRanges {\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    friendlyRanges: ").append(toIndentedString(friendlyRanges)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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
    openapiFields.add("layout");
    openapiFields.add("friendly_ranges");
    openapiFields.add("ranges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TGQueryRanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TGQueryRanges.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TGQueryRanges is not found in the empty JSON string", TGQueryRanges.openapiRequiredFields.toString()));
        }
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
           public TGQueryRanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TGQueryRanges instance = thisAdapter.fromJsonTree(jsonObj);
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
