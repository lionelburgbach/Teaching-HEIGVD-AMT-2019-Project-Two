package io.avalia.user.api.model;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-11T02:40:10.341072+01:00[Europe/Zurich]")

public class Registration   {
  @JsonProperty("idTrail")
  private Integer idTrail;

  @JsonProperty("idUser")
  private Integer idUser;

  public Registration idTrail(Integer idTrail) {
    this.idTrail = idTrail;
    return this;
  }

  /**
   * Get idTrail
   * @return idTrail
  */
  @ApiModelProperty(value = "")


  public Integer getIdTrail() {
    return idTrail;
  }

  public void setIdTrail(Integer idTrail) {
    this.idTrail = idTrail;
  }

  public Registration idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * Get idUser
   * @return idUser
  */
  @ApiModelProperty(value = "")


  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
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
        Objects.equals(this.idUser, registration.idUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTrail, idUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registration {\n");
    
    sb.append("    idTrail: ").append(toIndentedString(idTrail)).append("\n");
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
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

