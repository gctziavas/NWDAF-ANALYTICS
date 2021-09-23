package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.Accuracy;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventReportingRequirement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class EventReportingRequirement   {
  @JsonProperty("accuracy")
  private Accuracy accuracy = null;

  @JsonProperty("startTs")
  private OffsetDateTime startTs = null;

  @JsonProperty("endTs")
  private OffsetDateTime endTs = null;

  @JsonProperty("sampRatio")
  private Integer sampRatio = null;

  @JsonProperty("maxObjectNbr")
  private Integer maxObjectNbr = null;

  @JsonProperty("maxSupiNbr")
  private Integer maxSupiNbr = null;

  @JsonProperty("timeAnaNeeded")
  private OffsetDateTime timeAnaNeeded = null;

  public EventReportingRequirement accuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Accuracy getAccuracy() {
    
	return accuracy;
  }
  public String getStringAccuracy() {
	    
		return accuracy.stringAccuracy;
	  }

  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }

  public EventReportingRequirement startTs(OffsetDateTime startTs) {
    this.startTs = startTs;
    return this;
  }

  /**
   * Get startTs
   * @return startTs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartTs() {
    return startTs;
  }

  public void setStartTs(OffsetDateTime startTs) {
    this.startTs = startTs;
  }

  public EventReportingRequirement endTs(OffsetDateTime endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Get endTs
   * @return endTs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndTs() {
    return endTs;
  }

  public void setEndTs(OffsetDateTime endTs) {
    this.endTs = endTs;
  }

  public EventReportingRequirement sampRatio(Integer sampRatio) {
    this.sampRatio = sampRatio;
    return this;
  }

  /**
   * Get sampRatio
   * @return sampRatio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getSampRatio() {
    return sampRatio;
  }

  public void setSampRatio(Integer sampRatio) {
	  if(sampRatio == null) {
		  sampRatio = 0;
	  }
	  if(sampRatio<101 && sampRatio>0) {
		  this.sampRatio = sampRatio;
	  }
	  else {
		  this.sampRatio = null;
	  }
    
  }

  public EventReportingRequirement maxObjectNbr(Integer maxObjectNbr) {
    this.maxObjectNbr = maxObjectNbr;
    return this;
  }

  /**
   * Get maxObjectNbr
   * @return maxObjectNbr
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxObjectNbr() {
    return maxObjectNbr;
  }

  public void setMaxObjectNbr(Integer maxObjectNbr) {
    if(maxObjectNbr > 0) {
	  this.maxObjectNbr = maxObjectNbr;
	  }
    else {
    	this.maxObjectNbr = null;
    }
  }

  public EventReportingRequirement maxSupiNbr(Integer maxSupiNbr) {
	  if(maxSupiNbr > 0) {
		  this.maxSupiNbr = maxSupiNbr;
		  }
	    else {
	    	this.maxSupiNbr = null;
	    }
	  return this;
  }

  /**
   * Get maxSupiNbr
   * @return maxSupiNbr
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxSupiNbr() {
    return maxSupiNbr;
  }

  public void setMaxSupiNbr(Integer maxSupiNbr) {
    this.maxSupiNbr = maxSupiNbr;
  }

  public EventReportingRequirement timeAnaNeeded(OffsetDateTime timeAnaNeeded) {
    this.timeAnaNeeded = timeAnaNeeded;
    return this;
  }

  /**
   * Get timeAnaNeeded
   * @return timeAnaNeeded
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimeAnaNeeded() {
    return timeAnaNeeded;
  }

  public void setTimeAnaNeeded(OffsetDateTime timeAnaNeeded) {
    this.timeAnaNeeded = timeAnaNeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventReportingRequirement eventReportingRequirement = (EventReportingRequirement) o;
    return Objects.equals(this.accuracy, eventReportingRequirement.accuracy) &&
        Objects.equals(this.startTs, eventReportingRequirement.startTs) &&
        Objects.equals(this.endTs, eventReportingRequirement.endTs) &&
        Objects.equals(this.sampRatio, eventReportingRequirement.sampRatio) &&
        Objects.equals(this.maxObjectNbr, eventReportingRequirement.maxObjectNbr) &&
        Objects.equals(this.maxSupiNbr, eventReportingRequirement.maxSupiNbr) &&
        Objects.equals(this.timeAnaNeeded, eventReportingRequirement.timeAnaNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, startTs, endTs, sampRatio, maxObjectNbr, maxSupiNbr, timeAnaNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventReportingRequirement {\n");
    
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    sampRatio: ").append(toIndentedString(sampRatio)).append("\n");
    sb.append("    maxObjectNbr: ").append(toIndentedString(maxObjectNbr)).append("\n");
    sb.append("    maxSupiNbr: ").append(toIndentedString(maxSupiNbr)).append("\n");
    sb.append("    timeAnaNeeded: ").append(toIndentedString(timeAnaNeeded)).append("\n");
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
