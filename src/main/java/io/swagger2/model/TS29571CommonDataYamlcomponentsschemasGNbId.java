package io.swagger2.model;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TS29571CommonDataYamlcomponentsschemasGNbId {
	public class GNbId   {
		  @JsonProperty("bitLength")
		  private Integer bitLength = null;

		  @JsonProperty("gNBValue")
		  private String gNBValue = null;

		  public GNbId bitLength(Integer bitLength) {
		    this.bitLength = bitLength;
		    return this;
		  }

		  /**
		   * Get bitLength
		   * minimum: 22
		   * maximum: 32
		   * @return bitLength
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		  @Min(22) @Max(32)   public Integer getBitLength() {
		    return bitLength;
		  }

		  public void setBitLength(Integer bitLength) {
		    this.bitLength = bitLength;
		  }

		  public GNbId gNBValue(String gNBValue) {
		    this.gNBValue = gNBValue;
		    return this;
		  }

		  /**
		   * Get gNBValue
		   * @return gNBValue
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		  @Pattern(regexp="^[A-Fa-f0-9]{6,8}$")   public String getGNBValue() {
		    return gNBValue;
		  }

		  public void setGNBValue(String gNBValue) {
		    this.gNBValue = gNBValue;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    GNbId gnbId = (GNbId) o;
		    return Objects.equals(this.bitLength, gnbId.bitLength) &&
		        Objects.equals(this.gNBValue, gnbId.gNBValue);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(bitLength, gNBValue);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class GNbId {\n");
		    
		    sb.append("    bitLength: ").append(toIndentedString(bitLength)).append("\n");
		    sb.append("    gNBValue: ").append(toIndentedString(gNBValue)).append("\n");
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
