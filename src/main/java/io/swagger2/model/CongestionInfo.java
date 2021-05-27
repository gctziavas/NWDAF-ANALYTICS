package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.CongestionType;
import io.swagger2.model.ThresholdLevel;
import io.swagger2.model.TimeWindow;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CongestionInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class CongestionInfo   {
  @JsonProperty("congType")
  private CongestionType congType = null;

  @JsonProperty("timeIntev")
  private TimeWindow timeIntev = null;

  @JsonProperty("nsi")
  private ThresholdLevel nsi = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public CongestionInfo congType(CongestionType congType) {
    this.congType = congType;
    return this;
  }

  /**
   * Get congType
   * @return congType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CongestionType getCongType() {
    return congType;
  }

  public void setCongType(CongestionType congType) {
    this.congType = congType;
  }

  public CongestionInfo timeIntev(TimeWindow timeIntev) {
    this.timeIntev = timeIntev;
    return this;
  }

  /**
   * Get timeIntev
   * @return timeIntev
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TimeWindow getTimeIntev() {
    return timeIntev;
  }

  public void setTimeIntev(TimeWindow timeIntev) {
    this.timeIntev = timeIntev;
  }

  public CongestionInfo nsi(ThresholdLevel nsi) {
    this.nsi = nsi;
    return this;
  }

  /**
   * Get nsi
   * @return nsi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ThresholdLevel getNsi() {
    return nsi;
  }

  public void setNsi(ThresholdLevel nsi) {
    this.nsi = nsi;
  }

  public CongestionInfo confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  
    public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CongestionInfo congestionInfo = (CongestionInfo) o;
    return Objects.equals(this.congType, congestionInfo.congType) &&
        Objects.equals(this.timeIntev, congestionInfo.timeIntev) &&
        Objects.equals(this.nsi, congestionInfo.nsi) &&
        Objects.equals(this.confidence, congestionInfo.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(congType, timeIntev, nsi, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CongestionInfo {\n");
    
    sb.append("    congType: ").append(toIndentedString(congType)).append("\n");
    sb.append("    timeIntev: ").append(toIndentedString(timeIntev)).append("\n");
    sb.append("    nsi: ").append(toIndentedString(nsi)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
