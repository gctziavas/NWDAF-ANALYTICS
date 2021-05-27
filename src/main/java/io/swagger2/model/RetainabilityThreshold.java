package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TimeUnit;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetainabilityThreshold
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class RetainabilityThreshold   {
  @JsonProperty("relFlowNum")
  private Integer relFlowNum = null;

  @JsonProperty("relTimeUnit")
  private TimeUnit relTimeUnit = null;

  @JsonProperty("relFlowRatio")
  private Integer relFlowRatio = null;

  public RetainabilityThreshold relFlowNum(Integer relFlowNum) {
    this.relFlowNum = relFlowNum;
    return this;
  }

  /**
   * Get relFlowNum
   * @return relFlowNum
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRelFlowNum() {
    return relFlowNum;
  }

  public void setRelFlowNum(Integer relFlowNum) {
    this.relFlowNum = relFlowNum;
  }

  public RetainabilityThreshold relTimeUnit(TimeUnit relTimeUnit) {
    this.relTimeUnit = relTimeUnit;
    return this;
  }

  /**
   * Get relTimeUnit
   * @return relTimeUnit
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TimeUnit getRelTimeUnit() {
    return relTimeUnit;
  }

  public void setRelTimeUnit(TimeUnit relTimeUnit) {
    this.relTimeUnit = relTimeUnit;
  }

  public RetainabilityThreshold relFlowRatio(Integer relFlowRatio) {
    this.relFlowRatio = relFlowRatio;
    return this;
  }

  /**
   * Get relFlowRatio
   * @return relFlowRatio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRelFlowRatio() {
    return relFlowRatio;
  }

  public void setRelFlowRatio(Integer relFlowRatio) {
    this.relFlowRatio = relFlowRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetainabilityThreshold retainabilityThreshold = (RetainabilityThreshold) o;
    return Objects.equals(this.relFlowNum, retainabilityThreshold.relFlowNum) &&
        Objects.equals(this.relTimeUnit, retainabilityThreshold.relTimeUnit) &&
        Objects.equals(this.relFlowRatio, retainabilityThreshold.relFlowRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relFlowNum, relTimeUnit, relFlowRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetainabilityThreshold {\n");
    
    sb.append("    relFlowNum: ").append(toIndentedString(relFlowNum)).append("\n");
    sb.append("    relTimeUnit: ").append(toIndentedString(relTimeUnit)).append("\n");
    sb.append("    relFlowRatio: ").append(toIndentedString(relFlowRatio)).append("\n");
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
