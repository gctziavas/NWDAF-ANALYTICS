package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasBytes;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TnapId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class TnapId   {
  @JsonProperty("ssId")
  private String ssId = null;

  @JsonProperty("bssId")
  private String bssId = null;

  @JsonProperty("civicAddress")
  private TS29571CommonDataYamlcomponentsschemasBytes civicAddress = null;

  public TnapId ssId(String ssId) {
    this.ssId = ssId;
    return this;
  }

  /**
   * Get ssId
   * @return ssId
  **/
  @ApiModelProperty(value = "")
  
    public String getSsId() {
    return ssId;
  }

  public void setSsId(String ssId) {
    this.ssId = ssId;
  }

  public TnapId bssId(String bssId) {
    this.bssId = bssId;
    return this;
  }

  /**
   * Get bssId
   * @return bssId
  **/
  @ApiModelProperty(value = "")
  
    public String getBssId() {
    return bssId;
  }

  public void setBssId(String bssId) {
    this.bssId = bssId;
  }

  public TnapId civicAddress(TS29571CommonDataYamlcomponentsschemasBytes civicAddress) {
    this.civicAddress = civicAddress;
    return this;
  }

  /**
   * Get civicAddress
   * @return civicAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29571CommonDataYamlcomponentsschemasBytes getCivicAddress() {
    return civicAddress;
  }

  public void setCivicAddress(TS29571CommonDataYamlcomponentsschemasBytes civicAddress) {
    this.civicAddress = civicAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TnapId tnapId = (TnapId) o;
    return Objects.equals(this.ssId, tnapId.ssId) &&
        Objects.equals(this.bssId, tnapId.bssId) &&
        Objects.equals(this.civicAddress, tnapId.civicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssId, bssId, civicAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TnapId {\n");
    
    sb.append("    ssId: ").append(toIndentedString(ssId)).append("\n");
    sb.append("    bssId: ").append(toIndentedString(bssId)).append("\n");
    sb.append("    civicAddress: ").append(toIndentedString(civicAddress)).append("\n");
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
