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
 * Registration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-08T21:03:18.208+01:00[Europe/Zurich]")

public class Registration   {
  @JsonProperty("idTrail")
  private Long idTrail;

  @JsonProperty("email")
  private Long email;

  public Registration idTrail(Long idTrail) {
    this.idTrail = idTrail;
    return this;
  }

  /**
   * Get idTrail
   * @return idTrail
  */
  @ApiModelProperty(value = "")


  public Long getIdTrail() {
    return idTrail;
  }

  public void setIdTrail(Long idTrail) {
    this.idTrail = idTrail;
  }

  public Registration email(Long email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public Long getEmail() {
    return email;
  }

  public void setEmail(Long email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registration registration = (Registration) o;
    return Objects.equals(this.idTrail, registration.idTrail) &&
        Objects.equals(this.email, registration.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTrail, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registration {\n");
    
    sb.append("    idTrail: ").append(toIndentedString(idTrail)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

