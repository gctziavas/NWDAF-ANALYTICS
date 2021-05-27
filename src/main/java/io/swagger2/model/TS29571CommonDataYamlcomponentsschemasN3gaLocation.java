package io.swagger2.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasN3gaLocation {
	public class N3gaLocation   {
		  @JsonProperty("n3gppTai")
		  private TS29571CommonDataYamlcomponentsschemasTai n3gppTai = null;

		  @JsonProperty("n3IwfId")
		  private String n3IwfId = null;

		  @JsonProperty("ueIpv4Addr")
		  private TS29571CommonDataYamlcomponentsschemasIpv4Addr ueIpv4Addr = null;

		  @JsonProperty("ueIpv6Addr")
		  private TS29571CommonDataYamlcomponentsschemasIpv6Addr ueIpv6Addr = null;

		  @JsonProperty("portNumber")
		  private TS29571CommonDataYamlcomponentsschemasUinteger portNumber = null;

		  @JsonProperty("tnapId")
		  private TS29571CommonDataYamlcomponentsschemasTnapId tnapId = null;

		  @JsonProperty("twapId")
		  private TS29571CommonDataYamlcomponentsschemasTwapId twapId = null;

		  @JsonProperty("hfcNodeId")
		  private TS29571CommonDataYamlcomponentsschemasHfcNodeId hfcNodeId = null;

		  @JsonProperty("gli")
		  private TS29571CommonDataYamlcomponentsschemasGli gli = null;

		  @JsonProperty("w5gbanLineType")
		  private TS29571CommonDataYamlcomponentsschemasLineType w5gbanLineType = null;

		  @JsonProperty("gci")
		  private TS29571CommonDataYamlcomponentsschemasGci gci = null;

		  public N3gaLocation n3gppTai(TS29571CommonDataYamlcomponentsschemasTai n3gppTai) {
		    this.n3gppTai = n3gppTai;
		    return this;
		  }

		  /**
		   * Get n3gppTai
		   * @return n3gppTai
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasTai getN3gppTai() {
		    return n3gppTai;
		  }

		  public void setN3gppTai(TS29571CommonDataYamlcomponentsschemasTai n3gppTai) {
		    this.n3gppTai = n3gppTai;
		  }

		  public N3gaLocation n3IwfId(String n3IwfId) {
		    this.n3IwfId = n3IwfId;
		    return this;
		  }

		  /**
		   * Get n3IwfId
		   * @return n3IwfId
		  **/
		  @ApiModelProperty(value = "")
		  
		  @Pattern(regexp="^[A-Fa-f0-9]+$")   public String getN3IwfId() {
		    return n3IwfId;
		  }

		  public void setN3IwfId(String n3IwfId) {
		    this.n3IwfId = n3IwfId;
		  }

		  public N3gaLocation ueIpv4Addr(TS29571CommonDataYamlcomponentsschemasIpv4Addr ueIpv4Addr) {
		    this.ueIpv4Addr = ueIpv4Addr;
		    return this;
		  }

		  /**
		   * Get ueIpv4Addr
		   * @return ueIpv4Addr
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasIpv4Addr getUeIpv4Addr() {
		    return ueIpv4Addr;
		  }

		  public void setUeIpv4Addr(TS29571CommonDataYamlcomponentsschemasIpv4Addr ueIpv4Addr) {
		    this.ueIpv4Addr = ueIpv4Addr;
		  }

		  public N3gaLocation ueIpv6Addr(TS29571CommonDataYamlcomponentsschemasIpv6Addr ueIpv6Addr) {
		    this.ueIpv6Addr = ueIpv6Addr;
		    return this;
		  }

		  /**
		   * Get ueIpv6Addr
		   * @return ueIpv6Addr
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasIpv6Addr getUeIpv6Addr() {
		    return ueIpv6Addr;
		  }

		  public void setUeIpv6Addr(TS29571CommonDataYamlcomponentsschemasIpv6Addr ueIpv6Addr) {
		    this.ueIpv6Addr = ueIpv6Addr;
		  }

		  public N3gaLocation portNumber(TS29571CommonDataYamlcomponentsschemasUinteger portNumber) {
		    this.portNumber = portNumber;
		    return this;
		  }

		  /**
		   * Get portNumber
		   * @return portNumber
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasUinteger getPortNumber() {
		    return portNumber;
		  }

		  public void setPortNumber(TS29571CommonDataYamlcomponentsschemasUinteger portNumber) {
		    this.portNumber = portNumber;
		  }

		  public N3gaLocation tnapId(TS29571CommonDataYamlcomponentsschemasTnapId tnapId) {
		    this.tnapId = tnapId;
		    return this;
		  }

		  /**
		   * Get tnapId
		   * @return tnapId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasTnapId getTnapId() {
		    return tnapId;
		  }

		  public void setTnapId(TS29571CommonDataYamlcomponentsschemasTnapId tnapId) {
		    this.tnapId = tnapId;
		  }

		  public N3gaLocation twapId(TS29571CommonDataYamlcomponentsschemasTwapId twapId) {
		    this.twapId = twapId;
		    return this;
		  }

		  /**
		   * Get twapId
		   * @return twapId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasTwapId getTwapId() {
		    return twapId;
		  }

		  public void setTwapId(TS29571CommonDataYamlcomponentsschemasTwapId twapId) {
		    this.twapId = twapId;
		  }

		  public N3gaLocation hfcNodeId(TS29571CommonDataYamlcomponentsschemasHfcNodeId hfcNodeId) {
		    this.hfcNodeId = hfcNodeId;
		    return this;
		  }

		  /**
		   * Get hfcNodeId
		   * @return hfcNodeId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasHfcNodeId getHfcNodeId() {
		    return hfcNodeId;
		  }

		  public void setHfcNodeId(TS29571CommonDataYamlcomponentsschemasHfcNodeId hfcNodeId) {
		    this.hfcNodeId = hfcNodeId;
		  }

		  public N3gaLocation gli(TS29571CommonDataYamlcomponentsschemasGli gli) {
		    this.gli = gli;
		    return this;
		  }

		  /**
		   * Get gli
		   * @return gli
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasGli getGli() {
		    return gli;
		  }

		  public void setGli(TS29571CommonDataYamlcomponentsschemasGli gli) {
		    this.gli = gli;
		  }

		  public N3gaLocation w5gbanLineType(TS29571CommonDataYamlcomponentsschemasLineType w5gbanLineType) {
		    this.w5gbanLineType = w5gbanLineType;
		    return this;
		  }

		  /**
		   * Get w5gbanLineType
		   * @return w5gbanLineType
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasLineType getW5gbanLineType() {
		    return w5gbanLineType;
		  }

		  public void setW5gbanLineType(TS29571CommonDataYamlcomponentsschemasLineType w5gbanLineType) {
		    this.w5gbanLineType = w5gbanLineType;
		  }

		  public N3gaLocation gci(TS29571CommonDataYamlcomponentsschemasGci gci) {
		    this.gci = gci;
		    return this;
		  }

		  /**
		   * Get gci
		   * @return gci
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasGci getGci() {
		    return gci;
		  }

		  public void setGci(TS29571CommonDataYamlcomponentsschemasGci gci) {
		    this.gci = gci;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    N3gaLocation n3gaLocation = (N3gaLocation) o;
		    return Objects.equals(this.n3gppTai, n3gaLocation.n3gppTai) &&
		        Objects.equals(this.n3IwfId, n3gaLocation.n3IwfId) &&
		        Objects.equals(this.ueIpv4Addr, n3gaLocation.ueIpv4Addr) &&
		        Objects.equals(this.ueIpv6Addr, n3gaLocation.ueIpv6Addr) &&
		        Objects.equals(this.portNumber, n3gaLocation.portNumber) &&
		        Objects.equals(this.tnapId, n3gaLocation.tnapId) &&
		        Objects.equals(this.twapId, n3gaLocation.twapId) &&
		        Objects.equals(this.hfcNodeId, n3gaLocation.hfcNodeId) &&
		        Objects.equals(this.gli, n3gaLocation.gli) &&
		        Objects.equals(this.w5gbanLineType, n3gaLocation.w5gbanLineType) &&
		        Objects.equals(this.gci, n3gaLocation.gci);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(n3gppTai, n3IwfId, ueIpv4Addr, ueIpv6Addr, portNumber, tnapId, twapId, hfcNodeId, gli, w5gbanLineType, gci);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class N3gaLocation {\n");
		    
		    sb.append("    n3gppTai: ").append(toIndentedString(n3gppTai)).append("\n");
		    sb.append("    n3IwfId: ").append(toIndentedString(n3IwfId)).append("\n");
		    sb.append("    ueIpv4Addr: ").append(toIndentedString(ueIpv4Addr)).append("\n");
		    sb.append("    ueIpv6Addr: ").append(toIndentedString(ueIpv6Addr)).append("\n");
		    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
		    sb.append("    tnapId: ").append(toIndentedString(tnapId)).append("\n");
		    sb.append("    twapId: ").append(toIndentedString(twapId)).append("\n");
		    sb.append("    hfcNodeId: ").append(toIndentedString(hfcNodeId)).append("\n");
		    sb.append("    gli: ").append(toIndentedString(gli)).append("\n");
		    sb.append("    w5gbanLineType: ").append(toIndentedString(w5gbanLineType)).append("\n");
		    sb.append("    gci: ").append(toIndentedString(gci)).append("\n");
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
