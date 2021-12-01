package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasNid;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasPlmnId;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasTac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tai
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Tai   {
  @JsonProperty("plmnId")
  private PlmnId plmnId = null;

  @JsonProperty("tac")
  private Tac tac = null;

  @JsonProperty("nid")
  private Nid nid = null;

  public Tai plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }
  
  public Tai(PlmnId plmnId, Tac tac) {
	  this.plmnId = plmnId;
	  this.tac = tac;
  }
  public Tai(PlmnId plmnId, Tac tac, Nid nid) {
	  this.plmnId = plmnId;
	  this.tac = tac;
	  this.nid = nid;
  }
  /**
   * Get plmnId
   * @return plmnId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PlmnId getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
  }

  public Tai tac(Tac tac) {
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
    public Tac getTac() {
    return tac;
  }

  public void setTac(Tac tac) {
    this.tac = tac;
  }

  public Tai nid(Nid nid) {
    this.nid = nid;
    return this;
  }

  /**
   * Get nid
   * @return nid
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Nid getNid() {
    return nid;
  }

  public void setNid(Nid nid) {
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
