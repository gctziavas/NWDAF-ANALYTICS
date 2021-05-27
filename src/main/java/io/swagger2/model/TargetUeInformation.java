package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TargetUeInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class TargetUeInformation   {
  @JsonProperty("anyUe")
  private Boolean anyUe = null;

  @JsonProperty("supis")
  @Valid
  private List<String> supis = null;

  @JsonProperty("intGroupIds")
  @Valid
  private List<String> intGroupIds = null;

  public TargetUeInformation anyUe(Boolean anyUe) {
    this.anyUe = anyUe;
    return this;
  }

  /**
   * Get anyUe
   * @return anyUe
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isAnyUe() {
    return anyUe;
  }

  public void setAnyUe(Boolean anyUe) {
    this.anyUe = anyUe;
  }

  public TargetUeInformation supis(List<String> supis) {
    this.supis = supis;
    return this;
  }

  public TargetUeInformation addSupisItem(String supisItem) {
    if (this.supis == null) {
      this.supis = new ArrayList<>();
    }
    this.supis.add(supisItem);
    return this;
  }

  /**
   * Get supis
   * @return supis
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getSupis() {
    return supis;
  }

  public void setSupis(List<String> supis) {
    this.supis = supis;
  }

  public TargetUeInformation intGroupIds(List<String> intGroupIds) {
    this.intGroupIds = intGroupIds;
    return this;
  }

  public TargetUeInformation addIntGroupIdsItem(String intGroupIdsItem) {
    if (this.intGroupIds == null) {
      this.intGroupIds = new ArrayList<>();
    }
    this.intGroupIds.add(intGroupIdsItem);
    return this;
  }

  /**
   * Get intGroupIds
   * @return intGroupIds
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getIntGroupIds() {
    return intGroupIds;
  }

  public void setIntGroupIds(List<String> intGroupIds) {
    this.intGroupIds = intGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetUeInformation targetUeInformation = (TargetUeInformation) o;
    return Objects.equals(this.anyUe, targetUeInformation.anyUe) &&
        Objects.equals(this.supis, targetUeInformation.supis) &&
        Objects.equals(this.intGroupIds, targetUeInformation.intGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyUe, supis, intGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUeInformation {\n");
    
    sb.append("    anyUe: ").append(toIndentedString(anyUe)).append("\n");
    sb.append("    supis: ").append(toIndentedString(supis)).append("\n");
    sb.append("    intGroupIds: ").append(toIndentedString(intGroupIds)).append("\n");
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
