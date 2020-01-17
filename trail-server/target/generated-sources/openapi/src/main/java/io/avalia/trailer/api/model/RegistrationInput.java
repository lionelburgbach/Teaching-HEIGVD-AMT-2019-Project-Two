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
 * RegistrationInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-17T10:28:07.467667+01:00[Europe/Zurich]")

public class RegistrationInput   {
  @JsonProperty("idTrail")
  private Long idTrail;

  public RegistrationInput idTrail(Long idTrail) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationInput registrationInput = (RegistrationInput) o;
    return Objects.equals(this.idTrail, registrationInput.idTrail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTrail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationInput {\n");
    
    sb.append("    idTrail: ").append(toIndentedString(idTrail)).append("\n");
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

