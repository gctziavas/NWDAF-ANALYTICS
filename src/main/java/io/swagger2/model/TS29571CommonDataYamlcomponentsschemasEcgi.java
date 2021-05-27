package io.swagger2.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasEcgi {
	public class Ecgi   {
		  @JsonProperty("plmnId")
		  private TS29571CommonDataYamlcomponentsschemasPlmnId plmnId = null;

		  @JsonProperty("eutraCellId")
		  private TS29571CommonDataYamlcomponentsschemasEutraCellId eutraCellId = null;

		  @JsonProperty("nid")
		  private TS29571CommonDataYamlcomponentsschemasNid nid = null;

		  public Ecgi plmnId(TS29571CommonDataYamlcomponentsschemasPlmnId plmnId) {
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

		  public Ecgi eutraCellId(TS29571CommonDataYamlcomponentsschemasEutraCellId eutraCellId) {
		    this.eutraCellId = eutraCellId;
		    return this;
		  }

		  /**
		   * Get eutraCellId
		   * @return eutraCellId
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasEutraCellId getEutraCellId() {
		    return eutraCellId;
		  }

		  public void setEutraCellId(TS29571CommonDataYamlcomponentsschemasEutraCellId eutraCellId) {
		    this.eutraCellId = eutraCellId;
		  }

		  public Ecgi nid(TS29571CommonDataYamlcomponentsschemasNid nid) {
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
		    Ecgi ecgi = (Ecgi) o;
		    return Objects.equals(this.plmnId, ecgi.plmnId) &&
		        Objects.equals(this.eutraCellId, ecgi.eutraCellId) &&
		        Objects.equals(this.nid, ecgi.nid);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(plmnId, eutraCellId, nid);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class Ecgi {\n");
		    
		    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
		    sb.append("    eutraCellId: ").append(toIndentedString(eutraCellId)).append("\n");
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
