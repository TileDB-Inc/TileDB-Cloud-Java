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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * A api token and its metadata
 */
@ApiModel(description = "A api token and its metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class Token {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope = "*";

  public Token() { 
  }

  public Token token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * A api token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A api token")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public Token name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of token to revoke
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of token to revoke")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Token issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * datetime the token was created
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "datetime the token was created")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public Token expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * datetime the token when token will expire
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "datetime the token when token will expire")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Token scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Optional scope to limit token, defaults to all permissions, current supported values are password_reset or *
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*", value = "Optional scope to limit token, defaults to all permissions, current supported values are password_reset or *")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.token, token.token) &&
        Objects.equals(this.name, token.name) &&
        Objects.equals(this.issuedAt, token.issuedAt) &&
        Objects.equals(this.expiresAt, token.expiresAt) &&
        Objects.equals(this.scope, token.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, name, issuedAt, expiresAt, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

}

