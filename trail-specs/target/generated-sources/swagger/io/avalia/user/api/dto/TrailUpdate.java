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
import io.avalia.user.api.dto.Trail;
import io.avalia.user.api.dto.TrailOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TrailUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-19T14:00:29.769+01:00[Europe/Zurich]")
public class TrailUpdate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_UP_AND_DOWN = "upAndDown";
  @SerializedName(SERIALIZED_NAME_UP_AND_DOWN)
  private Integer upAndDown;

  public static final String SERIALIZED_NAME_DESPRITION = "desprition";
  @SerializedName(SERIALIZED_NAME_DESPRITION)
  private String desprition;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;


  public TrailUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

