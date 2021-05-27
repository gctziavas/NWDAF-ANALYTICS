package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasHfcNId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HfcNodeId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class HfcNodeId   {
  @JsonProperty("hfcNId")
  private TS29571CommonDataYamlcomponentsschemasHfcNId hfcNId = null;

  public HfcNodeId hfcNId(TS29571CommonDataYamlcomponentsschemasHfcNId hfcNId) {
    this.hfcNId = hfcNId;
    return this;
  }

  /**
   * Get hfcNId
   * @return hfcNId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29571CommonDataYamlcomponentsschemasHfcNId getHfcNId() {
    return hfcNId;
  }

  public void setHfcNId(TS29571CommonDataYamlcomponentsschemasHfcNId hfcNId) {
    this.hfcNId = hfcNId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HfcNodeId hfcNodeId = (HfcNodeId) o;
    return Objects.equals(this.hfcNId, hfcNodeId.hfcNId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hfcNId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HfcNodeId {\n");
    
    sb.append("    hfcNId: ").append(toIndentedString(hfcNId)).append("\n");
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
