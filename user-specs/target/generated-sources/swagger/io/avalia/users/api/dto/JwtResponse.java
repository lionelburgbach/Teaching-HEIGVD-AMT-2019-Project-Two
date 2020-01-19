/*
 * Users API
 * An API to demonstrate Swagger and Spring Boot
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.avalia.users.api.dto;

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

/**
 * JwtResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-19T15:55:05.557+01:00[Europe/Zurich]")
public class JwtResponse {
  public static final String SERIALIZED_NAME_JWTTOKEN = "jwttoken";
  @SerializedName(SERIALIZED_NAME_JWTTOKEN)
  private String jwttoken;


  public JwtResponse jwttoken(String jwttoken) {
    
    this.jwttoken = jwttoken;
    return this;
  }

   /**
   * Get jwttoken
   * @return jwttoken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJwttoken() {
    return jwttoken;
  }


  public void setJwttoken(String jwttoken) {
    this.jwttoken = jwttoken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtResponse jwtResponse = (JwtResponse) o;
    return Objects.equals(this.jwttoken, jwtResponse.jwttoken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwttoken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtResponse {\n");
    sb.append("    jwttoken: ").append(toIndentedString(jwttoken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

