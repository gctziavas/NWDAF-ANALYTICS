package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasTrafficProfile.TrafficProfile;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpectedUeBehaviourData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class ExpectedUeBehaviourData   {
  @JsonProperty("afInstanceId")  
  private String afInstanceId = null;
  
  @JsonProperty("referenceId")
  private Integer referenceId = null; //The numeric value should not be higher than 2^64-1
  
  @JsonProperty("stationaryIndication")
  private StationaryIndication stationaryIndication = null;

  @JsonProperty("communicationDurationTime")
  private Integer communicationDurationTime = null;

  @JsonProperty("periodicTime")
  private Integer periodicTime = null;

  @JsonProperty("scheduledCommunicationTime")
  private ScheduledCommunicationTime scheduledCommunicationTime = null;

  @JsonProperty("scheduledCommunicationType")
  private ScheduledCommunicationType scheduledCommunicationType = null;

  @JsonProperty("expectedUmts")
  @Valid
  private List<LocationArea> expectedUmts = null;

  @JsonProperty("trafficProfile")
  private TrafficProfile trafficProfile = null;

  @JsonProperty("batteryIndication")
  private BatteryIndication batteryIndication = null;

  @JsonProperty("validityTime")
  private DateTime validityTime = null;

  public ExpectedUeBehaviourData stationaryIndication(StationaryIndication stationaryIndication) {
    this.stationaryIndication = stationaryIndication;
    return this;
  }

  public ExpectedUeBehaviourData(String afInstanceId, Integer referenceId, StationaryIndication stationaryIndication, Integer communicationDurationTime, Integer periodicTime, 
		  ScheduledCommunicationTime scheduledCommunicationTime, ScheduledCommunicationType scheduledCommunicationType, List<LocationArea> expectedUmts, TrafficProfile trafficProfile, 
		  BatteryIndication batteryIndication, DateTime validityTime) {
	  Nullify();
	  if(afInstanceId == null && referenceId == null) {
		 
	  }
	  else if(stationaryIndication==null && communicationDurationTime==null && periodicTime==null && scheduledCommunicationTime==null && scheduledCommunicationType==null && 
			  expectedUmts==null && trafficProfile==null && batteryIndication==null && validityTime==null){
			  
	  }
	  else {
		  this.afInstanceId = afInstanceId;
		  this.referenceId = referenceId;
		  
	  }
  }
  
  
  private void Nullify() {
	  this.afInstanceId = null;
	  this.referenceId = null;
	  this.stationaryIndication = null;
	  this.communicationDurationTime = null;
	  this.periodicTime = null;
	  this.scheduledCommunicationTime = null;
	  this.scheduledCommunicationType = null;
	  this.expectedUmts = null;
	  this.trafficProfile = null;
	  this.batteryIndication = null;
	  this.validityTime = null;
  }
  
  /**
   * Get stationaryIndication
   * @return stationaryIndication
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StationaryIndication getStationaryIndication() {
    return stationaryIndication;
  }

  public void setStationaryIndication(StationaryIndication stationaryIndication) {
    this.stationaryIndication = stationaryIndication;
  }

  public ExpectedUeBehaviourData communicationDurationTime(Integer communicationDurationTime) {
    this.communicationDurationTime = communicationDurationTime;
    return this;
  }

  /**
   * Get communicationDurationTime
   * @return communicationDurationTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCommunicationDurationTime() {
    return communicationDurationTime;
  }

  public void setCommunicationDurationTime(Integer communicationDurationTime) {
    this.communicationDurationTime = communicationDurationTime;
  }

  public ExpectedUeBehaviourData periodicTime(Integer periodicTime) {
    this.periodicTime = periodicTime;
    return this;
  }

  /**
   * Get periodicTime
   * @return periodicTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPeriodicTime() {
    return periodicTime;
  }

  public void setPeriodicTime(Integer periodicTime) {
    this.periodicTime = periodicTime;
  }

  public ExpectedUeBehaviourData scheduledCommunicationTime(ScheduledCommunicationTime scheduledCommunicationTime) {
    this.scheduledCommunicationTime = scheduledCommunicationTime;
    return this;
  }

  /**
   * Get scheduledCommunicationTime
   * @return scheduledCommunicationTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ScheduledCommunicationTime getScheduledCommunicationTime() {
    return scheduledCommunicationTime;
  }

  public void setScheduledCommunicationTime(ScheduledCommunicationTime scheduledCommunicationTime) {
    this.scheduledCommunicationTime = scheduledCommunicationTime;
  }

  public ExpectedUeBehaviourData scheduledCommunicationType(ScheduledCommunicationType scheduledCommunicationType) {
    this.scheduledCommunicationType = scheduledCommunicationType;
    return this;
  }

  /**
   * Get scheduledCommunicationType
   * @return scheduledCommunicationType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ScheduledCommunicationType getScheduledCommunicationType() {
    return scheduledCommunicationType;
  }

  public void setScheduledCommunicationType(ScheduledCommunicationType scheduledCommunicationType) {
    this.scheduledCommunicationType = scheduledCommunicationType;
  }

  public ExpectedUeBehaviourData expectedUmts(List<LocationArea> expectedUmts) {
    this.expectedUmts = expectedUmts;
    return this;
  }

  public ExpectedUeBehaviourData addExpectedUmtsItem(LocationArea expectedUmtsItem) {
    if (this.expectedUmts == null) {
      this.expectedUmts = new ArrayList<>();
    }
    this.expectedUmts.add(expectedUmtsItem);
    return this;
  }

  /**
   * Identifies the UE's expected geographical movement. The attribute is only applicable in 5G.
   * @return expectedUmts
  **/
  @ApiModelProperty(value = "Identifies the UE's expected geographical movement. The attribute is only applicable in 5G.")
      @Valid
  @Size(min=1)   public List<LocationArea> getExpectedUmts() {
    return expectedUmts;
  }

  public void setExpectedUmts(List<LocationArea> expectedUmts) {
    this.expectedUmts = expectedUmts;
  }

  public ExpectedUeBehaviourData trafficProfile(TrafficProfile trafficProfile) {
    this.trafficProfile = trafficProfile;
    return this;
  }

  /**
   * Get trafficProfile
   * @return trafficProfile
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TrafficProfile getTrafficProfile() {
    return trafficProfile;
  }

  public void setTrafficProfile(TrafficProfile trafficProfile) {
    this.trafficProfile = trafficProfile;
  }

  public ExpectedUeBehaviourData batteryIndication(BatteryIndication batteryIndication) {
    this.batteryIndication = batteryIndication;
    return this;
  }

  /**
   * Get batteryIndication
   * @return batteryIndication
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BatteryIndication getBatteryIndication() {
    return batteryIndication;
  }

  public void setBatteryIndication(BatteryIndication batteryIndication) {
    this.batteryIndication = batteryIndication;
  }

  public ExpectedUeBehaviourData validityTime(DateTime validityTime) {
    this.validityTime = validityTime;
    return this;
  }

  /**
   * Get validityTime
   * @return validityTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DateTime getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(DateTime validityTime) {
    this.validityTime = validityTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpectedUeBehaviourData expectedUeBehaviourData = (ExpectedUeBehaviourData) o;
    return Objects.equals(this.stationaryIndication, expectedUeBehaviourData.stationaryIndication) &&
        Objects.equals(this.communicationDurationTime, expectedUeBehaviourData.communicationDurationTime) &&
        Objects.equals(this.periodicTime, expectedUeBehaviourData.periodicTime) &&
        Objects.equals(this.scheduledCommunicationTime, expectedUeBehaviourData.scheduledCommunicationTime) &&
        Objects.equals(this.scheduledCommunicationType, expectedUeBehaviourData.scheduledCommunicationType) &&
        Objects.equals(this.expectedUmts, expectedUeBehaviourData.expectedUmts) &&
        Objects.equals(this.trafficProfile, expectedUeBehaviourData.trafficProfile) &&
        Objects.equals(this.batteryIndication, expectedUeBehaviourData.batteryIndication) &&
        Objects.equals(this.validityTime, expectedUeBehaviourData.validityTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stationaryIndication, communicationDurationTime, periodicTime, scheduledCommunicationTime, scheduledCommunicationType, expectedUmts, trafficProfile, batteryIndication, validityTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpectedUeBehaviourData {\n");
    
    sb.append("    stationaryIndication: ").append(toIndentedString(stationaryIndication)).append("\n");
    sb.append("    communicationDurationTime: ").append(toIndentedString(communicationDurationTime)).append("\n");
    sb.append("    periodicTime: ").append(toIndentedString(periodicTime)).append("\n");
    sb.append("    scheduledCommunicationTime: ").append(toIndentedString(scheduledCommunicationTime)).append("\n");
    sb.append("    scheduledCommunicationType: ").append(toIndentedString(scheduledCommunicationType)).append("\n");
    sb.append("    expectedUmts: ").append(toIndentedString(expectedUmts)).append("\n");
    sb.append("    trafficProfile: ").append(toIndentedString(trafficProfile)).append("\n");
    sb.append("    batteryIndication: ").append(toIndentedString(batteryIndication)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
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
