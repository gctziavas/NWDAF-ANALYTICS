package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasDateTime;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasNcgi;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasTai;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NrLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class NrLocation   {
  @JsonProperty("tai")
  private TS29571CommonDataYamlcomponentsschemasTai tai = null;

  @JsonProperty("ncgi")
  private TS29571CommonDataYamlcomponentsschemasNcgi ncgi = null;

  @JsonProperty("ageOfLocationInformation")
  private Integer ageOfLocationInformation = null;

  @JsonProperty("ueLocationTimestamp")
  private TS29571CommonDataYamlcomponentsschemasDateTime ueLocationTimestamp = null;

  @JsonProperty("geographicalInformation")
  private String geographicalInformation = null;

  @JsonProperty("geodeticInformation")
  private String geodeticInformation = null;

  @JsonProperty("globalGnbId")
  private TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalGnbId = null;

  public NrLocation tai(TS29571CommonDataYamlcomponentsschemasTai tai) {
    this.tai = tai;
    return this;
  }

  /**
   * Get tai
   * @return tai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29571CommonDataYamlcomponentsschemasTai getTai() {
    return tai;
  }

  public void setTai(TS29571CommonDataYamlcomponentsschemasTai tai) {
    this.tai = tai;
  }

  public NrLocation ncgi(TS29571CommonDataYamlcomponentsschemasNcgi ncgi) {
    this.ncgi = ncgi;
    return this;
  }

  /**
   * Get ncgi
   * @return ncgi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29571CommonDataYamlcomponentsschemasNcgi getNcgi() {
    return ncgi;
  }

  public void setNcgi(TS29571CommonDataYamlcomponentsschemasNcgi ncgi) {
    this.ncgi = ncgi;
  }

  public NrLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
    return this;
  }

  /**
   * Get ageOfLocationInformation
   * minimum: 0
   * maximum: 32767
   * @return ageOfLocationInformation
  **/
  @ApiModelProperty(value = "")
  
  @Min(0) @Max(32767)   public Integer getAgeOfLocationInformation() {
    return ageOfLocationInformation;
  }

  public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
  }

  public NrLocation ueLocationTimestamp(TS29571CommonDataYamlcomponentsschemasDateTime ueLocationTimestamp) {
    this.ueLocationTimestamp = ueLocationTimestamp;
    return this;
  }

  /**
   * Get ueLocationTimestamp
   * @return ueLocationTimestamp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasDateTime getUeLocationTimestamp() {
    return ueLocationTimestamp;
  }

  public void setUeLocationTimestamp(TS29571CommonDataYamlcomponentsschemasDateTime ueLocationTimestamp) {
    this.ueLocationTimestamp = ueLocationTimestamp;
  }

  public NrLocation geographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
    return this;
  }

  /**
   * Get geographicalInformation
   * @return geographicalInformation
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[0-9A-F]{16}$")   public String getGeographicalInformation() {
    return geographicalInformation;
  }

  public void setGeographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
  }

  public NrLocation geodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
    return this;
  }

  /**
   * Get geodeticInformation
   * @return geodeticInformation
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[0-9A-F]{20}$")   public String getGeodeticInformation() {
    return geodeticInformation;
  }

  public void setGeodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
  }

  public NrLocation globalGnbId(TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalGnbId) {
    this.globalGnbId = globalGnbId;
    return this;
  }

  /**
   * Get globalGnbId
   * @return globalGnbId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId getGlobalGnbId() {
    return globalGnbId;
  }

  public void setGlobalGnbId(TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalGnbId) {
    this.globalGnbId = globalGnbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrLocation nrLocation = (NrLocation) o;
    return Objects.equals(this.tai, nrLocation.tai) &&
        Objects.equals(this.ncgi, nrLocation.ncgi) &&
        Objects.equals(this.ageOfLocationInformation, nrLocation.ageOfLocationInformation) &&
        Objects.equals(this.ueLocationTimestamp, nrLocation.ueLocationTimestamp) &&
        Objects.equals(this.geographicalInformation, nrLocation.geographicalInformation) &&
        Objects.equals(this.geodeticInformation, nrLocation.geodeticInformation) &&
        Objects.equals(this.globalGnbId, nrLocation.globalGnbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tai, ncgi, ageOfLocationInformation, ueLocationTimestamp, geographicalInformation, geodeticInformation, globalGnbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrLocation {\n");
    
    sb.append("    tai: ").append(toIndentedString(tai)).append("\n");
    sb.append("    ncgi: ").append(toIndentedString(ncgi)).append("\n");
    sb.append("    ageOfLocationInformation: ").append(toIndentedString(ageOfLocationInformation)).append("\n");
    sb.append("    ueLocationTimestamp: ").append(toIndentedString(ueLocationTimestamp)).append("\n");
    sb.append("    geographicalInformation: ").append(toIndentedString(geographicalInformation)).append("\n");
    sb.append("    geodeticInformation: ").append(toIndentedString(geodeticInformation)).append("\n");
    sb.append("    globalGnbId: ").append(toIndentedString(globalGnbId)).append("\n");
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
