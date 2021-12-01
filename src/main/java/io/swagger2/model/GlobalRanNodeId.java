package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.ENbId;
import io.swagger2.model.GNbId;
import io.swagger2.model.N3IwfId;
import io.swagger2.model.NgeNbId;
import io.swagger2.model.Nid;
import io.swagger2.model.PlmnId;
import io.swagger2.model.TngfId;
import io.swagger2.model.WAgfId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GlobalRanNodeId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class GlobalRanNodeId  implements OneOfGlobalRanNodeId {
  @JsonProperty("plmnId")
  private PlmnId plmnId = null;

  @JsonProperty("n3IwfId")
  private N3IwfId n3IwfId = null;

  @JsonProperty("gNbId")
  private GNbId gNbId = null;

  @JsonProperty("ngeNbId")
  private NgeNbId ngeNbId = null;

  @JsonProperty("wagfId")
  private WAgfId wagfId = null;

  @JsonProperty("tngfId")
  private TngfId tngfId = null;

  @JsonProperty("nid")
  private Nid nid = null;

  @JsonProperty("eNbId")
  private ENbId eNbId = null;

  public GlobalRanNodeId plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }
  
  public GlobalRanNodeId(PlmnId plmnId, N3IwfId n3IwfId, GNbId gNbId, NgeNbId ngeNbId, WAgfId wagfId, TngfId tngfId, Nid nid, ENbId eNbId) {
	  if(plmnId == null) {
		  this.plmnId = null;
	  }
	  else  {
		  if(n3IwfId==null && gNbId==null && ngeNbId==null && wagfId==null && tngfId==null && eNbId==null) {
			  this.plmnId = null;
			  this.nid = null;
		  }
		  else {
			  this.plmnId = plmnId;
			  this.nid = nid;
		  }
		  this.eNbId = eNbId;
		  this.gNbId = gNbId;
		  this.n3IwfId = n3IwfId;
		  this.ngeNbId = ngeNbId;
		  this.tngfId = tngfId;
		  this.wagfId = wagfId;
	  }
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

  public GlobalRanNodeId n3IwfId(N3IwfId n3IwfId) {
    this.n3IwfId = n3IwfId;
    return this;
  }

  /**
   * Get n3IwfId
   * @return n3IwfId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public N3IwfId getN3IwfId() {
    return n3IwfId;
  }

  public void setN3IwfId(N3IwfId n3IwfId) {
    this.n3IwfId = n3IwfId;
  }

  public GlobalRanNodeId gNbId(GNbId gNbId) {
    this.gNbId = gNbId;
    return this;
  }

  /**
   * Get gNbId
   * @return gNbId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GNbId getGNbId() {
    return gNbId;
  }

  public void setGNbId(GNbId gNbId) {
    this.gNbId = gNbId;
  }

  public GlobalRanNodeId ngeNbId(NgeNbId ngeNbId) {
    this.ngeNbId = ngeNbId;
    return this;
  }

  /**
   * Get ngeNbId
   * @return ngeNbId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NgeNbId getNgeNbId() {
    return ngeNbId;
  }

  public void setNgeNbId(NgeNbId ngeNbId) {
    this.ngeNbId = ngeNbId;
  }

  public GlobalRanNodeId wagfId(WAgfId wagfId) {
    this.wagfId = wagfId;
    return this;
  }

  /**
   * Get wagfId
   * @return wagfId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WAgfId getWagfId() {
    return wagfId;
  }

  public void setWagfId(WAgfId wagfId) {
    this.wagfId = wagfId;
  }

  public GlobalRanNodeId tngfId(TngfId tngfId) {
    this.tngfId = tngfId;
    return this;
  }

  /**
   * Get tngfId
   * @return tngfId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TngfId getTngfId() {
    return tngfId;
  }

  public void setTngfId(TngfId tngfId) {
    this.tngfId = tngfId;
  }

  public GlobalRanNodeId nid(Nid nid) {
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

  public GlobalRanNodeId eNbId(ENbId eNbId) {
    this.eNbId = eNbId;
    return this;
  }

  /**
   * Get eNbId
   * @return eNbId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ENbId getENbId() {
    return eNbId;
  }

  public void setENbId(ENbId eNbId) {
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
