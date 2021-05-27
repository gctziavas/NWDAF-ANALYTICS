package io.swagger2.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasGlobalRanNodeId {
	public class GlobalRanNodeId  implements OneOfGlobalRanNodeId {
		  @JsonProperty("plmnId")
		  private TS29571CommonDataYamlcomponentsschemasPlmnId plmnId = null;

		  @JsonProperty("n3IwfId")
		  private TS29571CommonDataYamlcomponentsschemasN3IwfId n3IwfId = null;

		  @JsonProperty("gNbId")
		  private TS29571CommonDataYamlcomponentsschemasGNbId gNbId = null;

		  @JsonProperty("ngeNbId")
		  private TS29571CommonDataYamlcomponentsschemasNgeNbId ngeNbId = null;

		  @JsonProperty("wagfId")
		  private TS29571CommonDataYamlcomponentsschemasWAgfId wagfId = null;

		  @JsonProperty("tngfId")
		  private TS29571CommonDataYamlcomponentsschemasTngfId tngfId = null;

		  @JsonProperty("nid")
		  private TS29571CommonDataYamlcomponentsschemasNid nid = null;

		  @JsonProperty("eNbId")
		  private TS29571CommonDataYamlcomponentsschemasENbId eNbId = null;

		  public GlobalRanNodeId plmnId(TS29571CommonDataYamlcomponentsschemasPlmnId plmnId) {
		    this.plmnId = plmnId;
		    return this;
		  }

		  /**
		   * Get plmnId
		   * @return plmnId
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasPlmnId getPlmnId() {
		    return plmnId;
		  }

		  public void setPlmnId(TS29571CommonDataYamlcomponentsschemasPlmnId plmnId) {
		    this.plmnId = plmnId;
		  }

		  public GlobalRanNodeId n3IwfId(TS29571CommonDataYamlcomponentsschemasN3IwfId n3IwfId) {
		    this.n3IwfId = n3IwfId;
		    return this;
		  }

		  /**
		   * Get n3IwfId
		   * @return n3IwfId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasN3IwfId getN3IwfId() {
		    return n3IwfId;
		  }

		  public void setN3IwfId(TS29571CommonDataYamlcomponentsschemasN3IwfId n3IwfId) {
		    this.n3IwfId = n3IwfId;
		  }

		  public GlobalRanNodeId gNbId(TS29571CommonDataYamlcomponentsschemasGNbId gNbId) {
		    this.gNbId = gNbId;
		    return this;
		  }

		  /**
		   * Get gNbId
		   * @return gNbId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasGNbId getGNbId() {
		    return gNbId;
		  }

		  public void setGNbId(TS29571CommonDataYamlcomponentsschemasGNbId gNbId) {
		    this.gNbId = gNbId;
		  }

		  public GlobalRanNodeId ngeNbId(TS29571CommonDataYamlcomponentsschemasNgeNbId ngeNbId) {
		    this.ngeNbId = ngeNbId;
		    return this;
		  }

		  /**
		   * Get ngeNbId
		   * @return ngeNbId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasNgeNbId getNgeNbId() {
		    return ngeNbId;
		  }

		  public void setNgeNbId(TS29571CommonDataYamlcomponentsschemasNgeNbId ngeNbId) {
		    this.ngeNbId = ngeNbId;
		  }

		  public GlobalRanNodeId wagfId(TS29571CommonDataYamlcomponentsschemasWAgfId wagfId) {
		    this.wagfId = wagfId;
		    return this;
		  }

		  /**
		   * Get wagfId
		   * @return wagfId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasWAgfId getWagfId() {
		    return wagfId;
		  }

		  public void setWagfId(TS29571CommonDataYamlcomponentsschemasWAgfId wagfId) {
		    this.wagfId = wagfId;
		  }

		  public GlobalRanNodeId tngfId(TS29571CommonDataYamlcomponentsschemasTngfId tngfId) {
		    this.tngfId = tngfId;
		    return this;
		  }

		  /**
		   * Get tngfId
		   * @return tngfId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasTngfId getTngfId() {
		    return tngfId;
		  }

		  public void setTngfId(TS29571CommonDataYamlcomponentsschemasTngfId tngfId) {
		    this.tngfId = tngfId;
		  }

		  public GlobalRanNodeId nid(TS29571CommonDataYamlcomponentsschemasNid nid) {
		    this.nid = nid;
		    return this;
		  }

		  /**
		   * Get nid
		   * @return nid
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasNid getNid() {
		    return nid;
		  }

		  public void setNid(TS29571CommonDataYamlcomponentsschemasNid nid) {
		    this.nid = nid;
		  }

		  public GlobalRanNodeId eNbId(TS29571CommonDataYamlcomponentsschemasENbId eNbId) {
		    this.eNbId = eNbId;
		    return this;
		  }

		  /**
		   * Get eNbId
		   * @return eNbId
		  **/
		  @ApiModelProperty(value = "")
		  
		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasENbId getENbId() {
		    return eNbId;
		  }

		  public void setENbId(TS29571CommonDataYamlcomponentsschemasENbId eNbId) {
		    this.eNbId = eNbId;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    GlobalRanNodeId globalRanNodeId = (GlobalRanNodeId) o;
		    return Objects.equals(this.plmnId, globalRanNodeId.plmnId) &&
		        Objects.equals(this.n3IwfId, globalRanNodeId.n3IwfId) &&
		        Objects.equals(this.gNbId, globalRanNodeId.gNbId) &&
		        Objects.equals(this.ngeNbId, globalRanNodeId.ngeNbId) &&
		        Objects.equals(this.wagfId, globalRanNodeId.wagfId) &&
		        Objects.equals(this.tngfId, globalRanNodeId.tngfId) &&
		        Objects.equals(this.nid, globalRanNodeId.nid) &&
		        Objects.equals(this.eNbId, globalRanNodeId.eNbId);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(plmnId, n3IwfId, gNbId, ngeNbId, wagfId, tngfId, nid, eNbId);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class GlobalRanNodeId {\n");
		    
		    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
		    sb.append("    n3IwfId: ").append(toIndentedString(n3IwfId)).append("\n");
		    sb.append("    gNbId: ").append(toIndentedString(gNbId)).append("\n");
		    sb.append("    ngeNbId: ").append(toIndentedString(ngeNbId)).append("\n");
		    sb.append("    wagfId: ").append(toIndentedString(wagfId)).append("\n");
		    sb.append("    tngfId: ").append(toIndentedString(tngfId)).append("\n");
		    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
		    sb.append("    eNbId: ").append(toIndentedString(eNbId)).append("\n");
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
