package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasFloat;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SvcExperience
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class SvcExperience   {
  @JsonProperty("mos")
  private TS29571CommonDataYamlcomponentsschemasFloat mos = null;

  @JsonProperty("upperRange")
  private TS29571CommonDataYamlcomponentsschemasFloat upperRange = null;

  @JsonProperty("lowerRange")
  private TS29571CommonDataYamlcomponentsschemasFloat lowerRange = null;

  public SvcExperience mos(TS29571CommonDataYamlcomponentsschemasFloat mos) {
    this.mos = mos;
    return this;
  }

  /**
   * Get mos
   * @return mos
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasFloat getMos() {
    return mos;
  }

  public void setMos(TS29571CommonDataYamlcomponentsschemasFloat mos) {
    this.mos = mos;
  }

  public SvcExperience upperRange(TS29571CommonDataYamlcomponentsschemasFloat upperRange) {
    this.upperRange = upperRange;
    return this;
  }

  /**
   * Get upperRange
   * @return upperRange
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasFloat getUpperRange() {
    return upperRange;
  }

  public void setUpperRange(TS29571CommonDataYamlcomponentsschemasFloat upperRange) {
    this.upperRange = upperRange;
  }

  public SvcExperience lowerRange(TS29571CommonDataYamlcomponentsschemasFloat lowerRange) {
    this.lowerRange = lowerRange;
    return this;
  }

  /**
   * Get lowerRange
   * @return lowerRange
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasFloat getLowerRange() {
    return lowerRange;
  }

  public void setLowerRange(TS29571CommonDataYamlcomponentsschemasFloat lowerRange) {
    this.lowerRange = lowerRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvcExperience svcExperience = (SvcExperience) o;
    return Objects.equals(this.mos, svcExperience.mos) &&
        Objects.equals(this.upperRange, svcExperience.upperRange) &&
        Objects.equals(this.lowerRange, svcExperience.lowerRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mos, upperRange, lowerRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvcExperience {\n");
    
    sb.append("    mos: ").append(toIndentedString(mos)).append("\n");
    sb.append("    upperRange: ").append(toIndentedString(upperRange)).append("\n");
    sb.append("    lowerRange: ").append(toIndentedString(lowerRange)).append("\n");
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
