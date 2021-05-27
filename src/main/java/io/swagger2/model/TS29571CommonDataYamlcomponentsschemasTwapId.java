package io.swagger2.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasTwapId {
	public class TwapId   {
		  @JsonProperty("ssId")
		  private String ssId = null;

		  @JsonProperty("bssId")
		  private String bssId = null;

		  @JsonProperty("civicAddress")
		  private TS29571CommonDataYamlcomponentsschemasBytes civicAddress = null;

		  public TwapId ssId(String ssId) {
		    this.ssId = ssId;
		    return this;
		  }

		  /**
		   * Get ssId
		   * @return ssId
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    public String getSsId() {
		    return ssId;
		  }

		  public void setSsId(String ssId) {
		    this.ssId = ssId;
		  }

		  public TwapId bssId(String bssId) {
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

		  public TwapId civicAddress(TS29571CommonDataYamlcomponentsschemasBytes civicAddress) {
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
		    TwapId twapId = (TwapId) o;
		    return Objects.equals(this.ssId, twapId.ssId) &&
		        Objects.equals(this.bssId, twapId.bssId) &&
		        Objects.equals(this.civicAddress, twapId.civicAddress);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(ssId, bssId, civicAddress);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class TwapId {\n");
		    
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
}
