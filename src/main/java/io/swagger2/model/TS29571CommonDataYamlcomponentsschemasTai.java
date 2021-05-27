package io.swagger2.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasTai {
	public class Tai   {
		  @JsonProperty("plmnId")
		  private TS29571CommonDataYamlcomponentsschemasPlmnId plmnId = null;

		  @JsonProperty("tac")
		  private TS29571CommonDataYamlcomponentsschemasTac tac = null;

		  @JsonProperty("nid")
		  private TS29571CommonDataYamlcomponentsschemasNid nid = null;

		  public Tai plmnId(TS29571CommonDataYamlcomponentsschemasPlmnId plmnId) {
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

		  public Tai tac(TS29571CommonDataYamlcomponentsschemasTac tac) {
		    this.tac = tac;
		    return this;
		  }

		  /**
		   * Get tac
		   * @return tac
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasTac getTac() {
		    return tac;
		  }

		  public void setTac(TS29571CommonDataYamlcomponentsschemasTac tac) {
		    this.tac = tac;
		  }

		  public Tai nid(TS29571CommonDataYamlcomponentsschemasNid nid) {
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


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    Tai tai = (Tai) o;
		    return Objects.equals(this.plmnId, tai.plmnId) &&
		        Objects.equals(this.tac, tai.tac) &&
		        Objects.equals(this.nid, tai.nid);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(plmnId, tac, nid);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class Tai {\n");
		    
		    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
		    sb.append("    tac: ").append(toIndentedString(tac)).append("\n");
		    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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
