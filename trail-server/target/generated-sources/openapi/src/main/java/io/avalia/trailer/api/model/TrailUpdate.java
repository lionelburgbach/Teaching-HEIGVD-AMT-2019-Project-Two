package io.avalia.trailer.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.api.model.TrailOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrailUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T19:07:07.141+01:00[Europe/Zurich]")

public class TrailUpdate   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("length")
  private Integer length;

  @JsonProperty("upAndDown")
  private Integer upAndDown;

  @JsonProperty("desprition")
  private String desprition;

  @JsonProperty("date")
  private String date;

  @JsonProperty("id")
  private Long id;

  public TrailUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrailUpdate length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  */
  @ApiModelProperty(value = "")


  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public TrailUpdate upAndDown(Integer upAndDown) {
    this.upAndDown = upAndDown;
    return this;
  }

  /**
   * Get upAndDown
   * @return upAndDown
  */
  @ApiModelProperty(value = "")


  public Integer getUpAndDown() {
    return upAndDown;
  }

  public void setUpAndDown(Integer upAndDown) {
    this.upAndDown = upAndDown;
  }

  public TrailUpdate desprition(String desprition) {
    this.desprition = desprition;
    return this;
  }

  /**
   * Get desprition
   * @return desprition
  */
  @ApiModelProperty(value = "")


  public String getDesprition() {
    return desprition;
  }

  public void setDesprition(String desprition) {
    this.desprition = desprition;
  }

  public TrailUpdate date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TrailUpdate id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrailUpdate trailUpdate = (TrailUpdate) o;
    return Objects.equals(this.name, trailUpdate.name) &&
        Objects.equals(this.length, trailUpdate.length) &&
        Objects.equals(this.upAndDown, trailUpdate.upAndDown) &&
        Objects.equals(this.desprition, trailUpdate.desprition) &&
        Objects.equals(this.date, trailUpdate.date) &&
        Objects.equals(this.id, trailUpdate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, length, upAndDown, desprition, date, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrailUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    upAndDown: ").append(toIndentedString(upAndDown)).append("\n");
    sb.append("    desprition: ").append(toIndentedString(desprition)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

