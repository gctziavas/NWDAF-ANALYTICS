package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.EutraCellId;
import io.swagger2.model.Nid;
import io.swagger2.model.PlmnId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ecgi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Ecgi   {
  @JsonProperty("plmnId")
  private PlmnId plmnId = null;

  @JsonProperty("eutraCellId")
  private EutraCellId eutraCellId = null;

  @JsonProperty("nid")
  private Nid nid = null;

  public Ecgi plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }
  
  public Ecgi(PlmnId plmnId, EutraCellId eutraCellId) {
	this.plmnId = plmnId;
	this.eutraCellId = eutraCellId;
  }
  
  public Ecgi(PlmnId plmnId, EutraCellId eutraCellId, Nid nid) {
	  this.plmnId = plmnId;
	  this.eutraCellId = eutraCellId;
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

  public Ecgi eutraCellId(EutraCellId eutraCellId) {
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
    public EutraCellId getEutraCellId() {
    return eutraCellId;
  }

  public void setEutraCellId(EutraCellId eutraCellId) {
    this.eutraCellId = eutraCellId;
  }

  public Ecgi nid(Nid nid) {
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
