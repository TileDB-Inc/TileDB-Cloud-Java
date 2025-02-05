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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.JSON;

/**
 * The information used to set up a single-sign on connection to a customer domain. 
 */
@ApiModel(description = "The information used to set up a single-sign on connection to a customer domain. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class SSODomainConfig {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_OIDC_ISSUER = "oidc_issuer";
  @SerializedName(SERIALIZED_NAME_OIDC_ISSUER)
  private String oidcIssuer;

  public static final String SERIALIZED_NAME_OIDC_CLIENT_ID = "oidc_client_id";
  @SerializedName(SERIALIZED_NAME_OIDC_CLIENT_ID)
  private String oidcClientId;

  public static final String SERIALIZED_NAME_OIDC_CLIENT_SECRET = "oidc_client_secret";
  @SerializedName(SERIALIZED_NAME_OIDC_CLIENT_SECRET)
  private String oidcClientSecret;

  public static final String SERIALIZED_NAME_DOMAIN_SETUP = "domain_setup";
  @SerializedName(SERIALIZED_NAME_DOMAIN_SETUP)
  private SSODomainSetup domainSetup;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private DomainVerificationStatus verificationStatus;

  public static final String SERIALIZED_NAME_CHECK_RESULTS = "check_results";
  @SerializedName(SERIALIZED_NAME_CHECK_RESULTS)
  private List<DomainCheckResult> checkResults = null;

  public SSODomainConfig() {
  }

  public SSODomainConfig uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * A server-generated ID for the configuration.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A server-generated ID for the configuration.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public SSODomainConfig domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * The fully-qualified domain (but with no trailing dot) to connect for single sign-on. This may not be changed after creation. 
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fully-qualified domain (but with no trailing dot) to connect for single sign-on. This may not be changed after creation. ")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public SSODomainConfig oidcIssuer(String oidcIssuer) {
    
    this.oidcIssuer = oidcIssuer;
    return this;
  }

   /**
   * The URL of the OpenID Connect issuer that can be used to authenticate this domain&#39;s users. The prefix where the &#x60;/.well-known/openid-configuration&#x60; file can be found; usually without a trailing slash. 
   * @return oidcIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the OpenID Connect issuer that can be used to authenticate this domain's users. The prefix where the `/.well-known/openid-configuration` file can be found; usually without a trailing slash. ")

  public String getOidcIssuer() {
    return oidcIssuer;
  }


  public void setOidcIssuer(String oidcIssuer) {
    this.oidcIssuer = oidcIssuer;
  }


  public SSODomainConfig oidcClientId(String oidcClientId) {
    
    this.oidcClientId = oidcClientId;
    return this;
  }

   /**
   * The OpenID Connect client ID for this SSO instance.
   * @return oidcClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OpenID Connect client ID for this SSO instance.")

  public String getOidcClientId() {
    return oidcClientId;
  }


  public void setOidcClientId(String oidcClientId) {
    this.oidcClientId = oidcClientId;
  }


  public SSODomainConfig oidcClientSecret(String oidcClientSecret) {
    
    this.oidcClientSecret = oidcClientSecret;
    return this;
  }

   /**
   * The OpenID Connect client secret for this SSO instance.
   * @return oidcClientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OpenID Connect client secret for this SSO instance.")

  public String getOidcClientSecret() {
    return oidcClientSecret;
  }


  public void setOidcClientSecret(String oidcClientSecret) {
    this.oidcClientSecret = oidcClientSecret;
  }


  public SSODomainConfig domainSetup(SSODomainSetup domainSetup) {
    
    this.domainSetup = domainSetup;
    return this;
  }

   /**
   * Get domainSetup
   * @return domainSetup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SSODomainSetup getDomainSetup() {
    return domainSetup;
  }


  public void setDomainSetup(SSODomainSetup domainSetup) {
    this.domainSetup = domainSetup;
  }


  public SSODomainConfig verificationStatus(DomainVerificationStatus verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DomainVerificationStatus getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(DomainVerificationStatus verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public SSODomainConfig checkResults(List<DomainCheckResult> checkResults) {
    
    this.checkResults = checkResults;
    return this;
  }

  public SSODomainConfig addCheckResultsItem(DomainCheckResult checkResultsItem) {
    if (this.checkResults == null) {
      this.checkResults = new ArrayList<>();
    }
    this.checkResults.add(checkResultsItem);
    return this;
  }

   /**
   * A list of the results of recent attempts to verify this domain. 
   * @return checkResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the results of recent attempts to verify this domain. ")

  public List<DomainCheckResult> getCheckResults() {
    return checkResults;
  }


  public void setCheckResults(List<DomainCheckResult> checkResults) {
    this.checkResults = checkResults;
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
  public SSODomainConfig putAdditionalProperty(String key, Object value) {
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
    SSODomainConfig ssODomainConfig = (SSODomainConfig) o;
    return Objects.equals(this.uuid, ssODomainConfig.uuid) &&
        Objects.equals(this.domain, ssODomainConfig.domain) &&
        Objects.equals(this.oidcIssuer, ssODomainConfig.oidcIssuer) &&
        Objects.equals(this.oidcClientId, ssODomainConfig.oidcClientId) &&
        Objects.equals(this.oidcClientSecret, ssODomainConfig.oidcClientSecret) &&
        Objects.equals(this.domainSetup, ssODomainConfig.domainSetup) &&
        Objects.equals(this.verificationStatus, ssODomainConfig.verificationStatus) &&
        Objects.equals(this.checkResults, ssODomainConfig.checkResults)&&
        Objects.equals(this.additionalProperties, ssODomainConfig.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, domain, oidcIssuer, oidcClientId, oidcClientSecret, domainSetup, verificationStatus, checkResults, additionalProperties);
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
    sb.append("class SSODomainConfig {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    oidcIssuer: ").append(toIndentedString(oidcIssuer)).append("\n");
    sb.append("    oidcClientId: ").append(toIndentedString(oidcClientId)).append("\n");
    sb.append("    oidcClientSecret: ").append(toIndentedString(oidcClientSecret)).append("\n");
    sb.append("    domainSetup: ").append(toIndentedString(domainSetup)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    checkResults: ").append(toIndentedString(checkResults)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("domain");
    openapiFields.add("oidc_issuer");
    openapiFields.add("oidc_client_id");
    openapiFields.add("oidc_client_secret");
    openapiFields.add("domain_setup");
    openapiFields.add("verification_status");
    openapiFields.add("check_results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SSODomainConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SSODomainConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SSODomainConfig is not found in the empty JSON string", SSODomainConfig.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("oidc_issuer") != null && !jsonObj.get("oidc_issuer").isJsonNull()) && !jsonObj.get("oidc_issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oidc_issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oidc_issuer").toString()));
      }
      if ((jsonObj.get("oidc_client_id") != null && !jsonObj.get("oidc_client_id").isJsonNull()) && !jsonObj.get("oidc_client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oidc_client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oidc_client_id").toString()));
      }
      if ((jsonObj.get("oidc_client_secret") != null && !jsonObj.get("oidc_client_secret").isJsonNull()) && !jsonObj.get("oidc_client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oidc_client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oidc_client_secret").toString()));
      }
      // validate the optional field `domain_setup`
      if (jsonObj.get("domain_setup") != null && !jsonObj.get("domain_setup").isJsonNull()) {
        SSODomainSetup.validateJsonObject(jsonObj.getAsJsonObject("domain_setup"));
      }
      JsonArray jsonArraycheckResults = jsonObj.getAsJsonArray("check_results");
      if (jsonArraycheckResults != null) {
        // ensure the json data is an array
        if (!jsonObj.get("check_results").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `check_results` to be an array in the JSON string but got `%s`", jsonObj.get("check_results").toString()));
        }

        // validate the optional field `check_results` (array)
        for (int i = 0; i < jsonArraycheckResults.size(); i++) {
          DomainCheckResult.validateJsonObject(jsonArraycheckResults.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SSODomainConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SSODomainConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SSODomainConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SSODomainConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<SSODomainConfig>() {
           @Override
           public void write(JsonWriter out, SSODomainConfig value) throws IOException {
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
           public SSODomainConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SSODomainConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SSODomainConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SSODomainConfig
  * @throws IOException if the JSON string is invalid with respect to SSODomainConfig
  */
  public static SSODomainConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SSODomainConfig.class);
  }

 /**
  * Convert an instance of SSODomainConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

