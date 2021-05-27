package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29122CommonDataYamlcomponentsschemasDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimeWindow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class TimeWindow   {
  @JsonProperty("startTime")
  private TS29122CommonDataYamlcomponentsschemasDateTime startTime = null;

  @JsonProperty("stopTime")
  private TS29122CommonDataYamlcomponentsschemasDateTime stopTime = null;

  public TimeWindow startTime(TS29122CommonDataYamlcomponentsschemasDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29122CommonDataYamlcomponentsschemasDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(TS29122CommonDataYamlcomponentsschemasDateTime startTime) {
    this.startTime = startTime;
  }

  public TimeWindow stopTime(TS29122CommonDataYamlcomponentsschemasDateTime stopTime) {
    this.stopTime = stopTime;
    return this;
  }

  /**
   * Get stopTime
   * @return stopTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29122CommonDataYamlcomponentsschemasDateTime getStopTime() {
    return stopTime;
  }

  public void setStopTime(TS29122CommonDataYamlcomponentsschemasDateTime stopTime) {
    this.stopTime = stopTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeWindow timeWindow = (TimeWindow) o;
    return Objects.equals(this.startTime, timeWindow.startTime) &&
        Objects.equals(this.stopTime, timeWindow.stopTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindow {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
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
