package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasNid;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasNrCellId;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasPlmnId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ncgi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Ncgi   {
  @JsonProperty("plmnId")
  private TS29571CommonDataYamlcomponentsschemasPlmnId plmnId = null;

  @JsonProperty("nrCellId")
  private TS29571CommonDataYamlcomponentsschemasNrCellId nrCellId = null;

  @JsonProperty("nid")
  private TS29571CommonDataYamlcomponentsschemasNid nid = null;

  public Ncgi plmnId(TS29571CommonDataYamlcomponentsschemasPlmnId plmnId) {
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

  public Ncgi nrCellId(TS29571CommonDataYamlcomponentsschemasNrCellId nrCellId) {
    this.nrCellId = nrCellId;
    return this;
  }

  /**
   * Get nrCellId
   * @return nrCellId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29571CommonDataYamlcomponentsschemasNrCellId getNrCellId() {
    return nrCellId;
  }

  public void setNrCellId(TS29571CommonDataYamlcomponentsschemasNrCellId nrCellId) {
    this.nrCellId = nrCellId;
  }

  public Ncgi nid(TS29571CommonDataYamlcomponentsschemasNid nid) {
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
    Ncgi ncgi = (Ncgi) o;
    return Objects.equals(this.plmnId, ncgi.plmnId) &&
        Objects.equals(this.nrCellId, ncgi.nrCellId) &&
        Objects.equals(this.nid, ncgi.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, nrCellId, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ncgi {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    nrCellId: ").append(toIndentedString(nrCellId)).append("\n");
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
