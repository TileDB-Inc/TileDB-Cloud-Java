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
import org.openapitools.client.model.ResultFormat;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A node specifying an SQL query to execute in TileDB Cloud. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class TGSQLNodeData {
  public static final String SERIALIZED_NAME_INIT_COMMANDS = "init_commands";
  @SerializedName(SERIALIZED_NAME_INIT_COMMANDS)
  @javax.annotation.Nullable
  private List<String> initCommands = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nullable
  private String query;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  @javax.annotation.Nullable
  private List<Object> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT_FORMAT = "result_format";
  @SerializedName(SERIALIZED_NAME_RESULT_FORMAT)
  @javax.annotation.Nullable
  private ResultFormat resultFormat;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @javax.annotation.Nullable
  private String namespace;

  public TGSQLNodeData() {
  }

  public TGSQLNodeData initCommands(@javax.annotation.Nullable List<String> initCommands) {
    this.initCommands = initCommands;
    return this;
  }

  public TGSQLNodeData addInitCommandsItem(String initCommandsItem) {
    if (this.initCommands == null) {
      this.initCommands = new ArrayList<>();
    }
    this.initCommands.add(initCommandsItem);
    return this;
  }

  /**
   * The commands to execute before running the query itself.
   * @return initCommands
   */
  @javax.annotation.Nullable
  public List<String> getInitCommands() {
    return initCommands;
  }

  public void setInitCommands(@javax.annotation.Nullable List<String> initCommands) {
    this.initCommands = initCommands;
  }


  public TGSQLNodeData query(@javax.annotation.Nullable String query) {
    this.query = query;
    return this;
  }

  /**
   * The text of the SQL query to execute. Parameters are substituted in for &#x60;?&#x60;s, just as in a regular MariaDB query. 
   * @return query
   */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nullable String query) {
    this.query = query;
  }


  public TGSQLNodeData parameters(@javax.annotation.Nullable List<Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TGSQLNodeData addParametersItem(Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * The parameters to substitute in for arguments in the &#x60;query&#x60;. Fixed-length. Arguments must be in JSON format. 
   * @return parameters
   */
  @javax.annotation.Nullable
  public List<Object> getParameters() {
    return parameters;
  }

  public void setParameters(@javax.annotation.Nullable List<Object> parameters) {
    this.parameters = parameters;
  }


  public TGSQLNodeData resultFormat(@javax.annotation.Nullable ResultFormat resultFormat) {
    this.resultFormat = resultFormat;
    return this;
  }

  /**
   * Get resultFormat
   * @return resultFormat
   */
  @javax.annotation.Nullable
  public ResultFormat getResultFormat() {
    return resultFormat;
  }

  public void setResultFormat(@javax.annotation.Nullable ResultFormat resultFormat) {
    this.resultFormat = resultFormat;
  }


  public TGSQLNodeData namespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * If set, the non-default namespace to execute this SQL query under. 
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@javax.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TGSQLNodeData tgSQLNodeData = (TGSQLNodeData) o;
    return Objects.equals(this.initCommands, tgSQLNodeData.initCommands) &&
        Objects.equals(this.query, tgSQLNodeData.query) &&
        Objects.equals(this.parameters, tgSQLNodeData.parameters) &&
        Objects.equals(this.resultFormat, tgSQLNodeData.resultFormat) &&
        Objects.equals(this.namespace, tgSQLNodeData.namespace);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(initCommands, query, parameters, resultFormat, namespace);
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
    sb.append("class TGSQLNodeData {\n");
    sb.append("    initCommands: ").append(toIndentedString(initCommands)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
    openapiFields.add("init_commands");
    openapiFields.add("query");
    openapiFields.add("parameters");
    openapiFields.add("result_format");
    openapiFields.add("namespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TGSQLNodeData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TGSQLNodeData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TGSQLNodeData is not found in the empty JSON string", TGSQLNodeData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TGSQLNodeData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TGSQLNodeData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("init_commands") != null && !jsonObj.get("init_commands").isJsonNull() && !jsonObj.get("init_commands").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `init_commands` to be an array in the JSON string but got `%s`", jsonObj.get("init_commands").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull() && !jsonObj.get("parameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
      }
      // validate the optional field `result_format`
      if (jsonObj.get("result_format") != null && !jsonObj.get("result_format").isJsonNull()) {
        ResultFormat.validateJsonElement(jsonObj.get("result_format"));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TGSQLNodeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TGSQLNodeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TGSQLNodeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TGSQLNodeData.class));

       return (TypeAdapter<T>) new TypeAdapter<TGSQLNodeData>() {
           @Override
           public void write(JsonWriter out, TGSQLNodeData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TGSQLNodeData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TGSQLNodeData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TGSQLNodeData
   * @throws IOException if the JSON string is invalid with respect to TGSQLNodeData
   */
  public static TGSQLNodeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TGSQLNodeData.class);
  }

  /**
   * Convert an instance of TGSQLNodeData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

