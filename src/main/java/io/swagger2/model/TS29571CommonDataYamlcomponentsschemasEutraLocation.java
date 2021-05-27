package io.swagger2.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasEutraLocation {
	public class EutraLocation   {
		  @JsonProperty("tai")
		  private TS29571CommonDataYamlcomponentsschemasTai tai = null;

		  @JsonProperty("ecgi")
		  private TS29571CommonDataYamlcomponentsschemasEcgi ecgi = null;

		  @JsonProperty("ignoreEcgi")
		  private Boolean ignoreEcgi = false;

		  @JsonProperty("ageOfLocationInformation")
		  private Integer ageOfLocationInformation = null;

		  @JsonProperty("ueLocationTimestamp")
		  private TS29571CommonDataYamlcomponentsschemasDateTime ueLocationTimestamp = null;

		  @JsonProperty("geographicalInformation")
		  private String geographicalInformation = null;

		  @JsonProperty("geodeticInformation")
		  private String geodeticInformation = null;

		  @JsonProperty("globalNgenbId")
		  private TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalNgenbId = null;

		  @JsonProperty("globalENbId")
		  private TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalENbId = null;

		  public EutraLocation tai(TS29571CommonDataYamlcomponentsschemasTai tai) {
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

		  public EutraLocation ecgi(TS29571CommonDataYamlcomponentsschemasEcgi ecgi) {
		    this.ecgi = ecgi;
		    return this;
		  }

		  /**
		   * Get ecgi
		   * @return ecgi
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasEcgi getEcgi() {
		    return ecgi;
		  }

		  public void setEcgi(TS29571CommonDataYamlcomponentsschemasEcgi ecgi) {
		    this.ecgi = ecgi;
		  }

		  public EutraLocation ignoreEcgi(Boolean ignoreEcgi) {
		    this.ignoreEcgi = ignoreEcgi;
		    return this;
		  }

		  /**
		   * Get ignoreEcgi
		   * @return ignoreEcgi
		  **/
		  @ApiModelProperty(value = "")
		  
		    public Boolean isIgnoreEcgi() {
		    return ignoreEcgi;
		  }

		  public void setIgnoreEcgi(Boolean ignoreEcgi) {
		    this.ignoreEcgi = ignoreEcgi;
		  }

		  public EutraLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
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

		  public EutraLocation ueLocationTimestamp(TS29571CommonDataYamlcomponentsschemasDateTime ueLocationTimestamp) {
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

		  public EutraLocation geographicalInformation(String geographicalInformation) {
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

		  public EutraLocation geodeticInformation(String geodeticInformation) {
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

		  public EutraLocation globalNgenbId(TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalNgenbId) {
		    this.globalNgenbId = globalNgenbId;
		    return this;
		  }

		  /**
		   * Get globalNgenbId
		   * @return globalNgenbId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId getGlobalNgenbId() {
		    return globalNgenbId;
		  }

		  public void setGlobalNgenbId(TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalNgenbId) {
		    this.globalNgenbId = globalNgenbId;
		  }

		  public EutraLocation globalENbId(TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalENbId) {
		    this.globalENbId = globalENbId;
		    return this;
		  }

		  /**
		   * Get globalENbId
		   * @return globalENbId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId getGlobalENbId() {
		    return globalENbId;
		  }

		  public void setGlobalENbId(TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId globalENbId) {
		    this.globalENbId = globalENbId;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    EutraLocation eutraLocation = (EutraLocation) o;
		    return Objects.equals(this.tai, eutraLocation.tai) &&
		        Objects.equals(this.ecgi, eutraLocation.ecgi) &&
		        Objects.equals(this.ignoreEcgi, eutraLocation.ignoreEcgi) &&
		        Objects.equals(this.ageOfLocationInformation, eutraLocation.ageOfLocationInformation) &&
		        Objects.equals(this.ueLocationTimestamp, eutraLocation.ueLocationTimestamp) &&
		        Objects.equals(this.geographicalInformation, eutraLocation.geographicalInformation) &&
		        Objects.equals(this.geodeticInformation, eutraLocation.geodeticInformation) &&
		        Objects.equals(this.globalNgenbId, eutraLocation.globalNgenbId) &&
		        Objects.equals(this.globalENbId, eutraLocation.globalENbId);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(tai, ecgi, ignoreEcgi, ageOfLocationInformation, ueLocationTimestamp, geographicalInformation, geodeticInformation, globalNgenbId, globalENbId);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class EutraLocation {\n");
		    
		    sb.append("    tai: ").append(toIndentedString(tai)).append("\n");
		    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
		    sb.append("    ignoreEcgi: ").append(toIndentedString(ignoreEcgi)).append("\n");
		    sb.append("    ageOfLocationInformation: ").append(toIndentedString(ageOfLocationInformation)).append("\n");
		    sb.append("    ueLocationTimestamp: ").append(toIndentedString(ueLocationTimestamp)).append("\n");
		    sb.append("    geographicalInformation: ").append(toIndentedString(geographicalInformation)).append("\n");
		    sb.append("    geodeticInformation: ").append(toIndentedString(geodeticInformation)).append("\n");
		    sb.append("    globalNgenbId: ").append(toIndentedString(globalNgenbId)).append("\n");
		    sb.append("    globalENbId: ").append(toIndentedString(globalENbId)).append("\n");
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

}
