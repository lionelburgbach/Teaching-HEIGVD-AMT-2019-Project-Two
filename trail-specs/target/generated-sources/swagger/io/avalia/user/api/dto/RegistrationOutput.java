/*
 * Trailer API
 * An API to demonstrate Swagger and Spring Boot
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.avalia.user.api.dto;

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
 * RegistrationOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-19T21:19:28.396+01:00[Europe/Zurich]")
public class RegistrationOutput {
  public static final String SERIALIZED_NAME_ID_TRAIL = "idTrail";
  @SerializedName(SERIALIZED_NAME_ID_TRAIL)
  private Long idTrail;

  public static final String SERIALIZED_NAME_TRAIL_NAME = "trailName";
  @SerializedName(SERIALIZED_NAME_TRAIL_NAME)
  private String trailName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ID_REG = "idReg";
  @SerializedName(SERIALIZED_NAME_ID_REG)
  private Long idReg;


  public RegistrationOutput idTrail(Long idTrail) {
    
    this.idTrail = idTrail;
    return this;
  }

   /**
   * Get idTrail
   * @return idTrail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIdTrail() {
    return idTrail;
  }


  public void setIdTrail(Long idTrail) {
    this.idTrail = idTrail;
  }


  public RegistrationOutput trailName(String trailName) {
    
    this.trailName = trailName;
    return this;
  }

   /**
   * Get trailName
   * @return trailName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrailName() {
    return trailName;
  }


  public void setTrailName(String trailName) {
    this.trailName = trailName;
  }


  public RegistrationOutput email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public RegistrationOutput idReg(Long idReg) {
    
    this.idReg = idReg;
    return this;
  }

   /**
   * Get idReg
   * @return idReg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIdReg() {
    return idReg;
  }


  public void setIdReg(Long idReg) {
    this.idReg = idReg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationOutput registrationOutput = (RegistrationOutput) o;
    return Objects.equals(this.idTrail, registrationOutput.idTrail) &&
        Objects.equals(this.trailName, registrationOutput.trailName) &&
        Objects.equals(this.email, registrationOutput.email) &&
        Objects.equals(this.idReg, registrationOutput.idReg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTrail, trailName, email, idReg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationOutput {\n");
    sb.append("    idTrail: ").append(toIndentedString(idTrail)).append("\n");
    sb.append("    trailName: ").append(toIndentedString(trailName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idReg: ").append(toIndentedString(idReg)).append("\n");
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

