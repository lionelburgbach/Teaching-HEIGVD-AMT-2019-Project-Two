package io.avalia.trailer.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.api.model.TrailOutputAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrailOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-16T23:52:42.789071+01:00[Europe/Zurich]")

public class TrailOutput   {
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

  public TrailOutput name(String name) {
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

  public TrailOutput length(Integer length) {
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

  public TrailOutput upAndDown(Integer upAndDown) {
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

  public TrailOutput desprition(String desprition) {
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

  public TrailOutput date(String date) {
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

  public TrailOutput id(Long id) {
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
    TrailOutput trailOutput = (TrailOutput) o;
    return Objects.equals(this.name, trailOutput.name) &&
        Objects.equals(this.length, trailOutput.length) &&
        Objects.equals(this.upAndDown, trailOutput.upAndDown) &&
        Objects.equals(this.desprition, trailOutput.desprition) &&
        Objects.equals(this.date, trailOutput.date) &&
        Objects.equals(this.id, trailOutput.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, length, upAndDown, desprition, date, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrailOutput {\n");
    
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

