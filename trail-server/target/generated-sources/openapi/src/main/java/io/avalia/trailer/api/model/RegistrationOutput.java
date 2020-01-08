package io.avalia.trailer.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegistrationOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-08T21:03:18.208+01:00[Europe/Zurich]")

public class RegistrationOutput   {
  @JsonProperty("trailName")
  private String trailName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("idReg")
  private Long idReg;

  public RegistrationOutput trailName(String trailName) {
    this.trailName = trailName;
    return this;
  }

  /**
   * Get trailName
   * @return trailName
  */
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
  */
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
  */
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
    return Objects.equals(this.trailName, registrationOutput.trailName) &&
        Objects.equals(this.email, registrationOutput.email) &&
        Objects.equals(this.idReg, registrationOutput.idReg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trailName, email, idReg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationOutput {\n");
    
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

