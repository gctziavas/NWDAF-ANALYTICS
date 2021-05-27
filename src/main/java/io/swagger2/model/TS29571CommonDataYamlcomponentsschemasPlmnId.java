package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMcc;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMnc;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlmnId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")

public class TS29571CommonDataYamlcomponentsschemasPlmnId {
	public class PlmnId   {
		  @JsonProperty("mcc")
		  private TS29571CommonDataYamlcomponentsschemasMcc mcc = null;

		  @JsonProperty("mnc")
		  private TS29571CommonDataYamlcomponentsschemasMnc mnc = null;

		  public PlmnId mcc(TS29571CommonDataYamlcomponentsschemasMcc mcc) {
		    this.mcc = mcc;
		    return this;
		  }

		  /**
		   * Get mcc
		   * @return mcc
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasMcc getMcc() {
		    return mcc;
		  }

		  public void setMcc(TS29571CommonDataYamlcomponentsschemasMcc mcc) {
		    this.mcc = mcc;
		  }

		  public PlmnId mnc(TS29571CommonDataYamlcomponentsschemasMnc mnc) {
		    this.mnc = mnc;
		    return this;
		  }

		  /**
		   * Get mnc
		   * @return mnc
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasMnc getMnc() {
		    return mnc;
		  }

		  public void setMnc(TS29571CommonDataYamlcomponentsschemasMnc mnc) {
		    this.mnc = mnc;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    PlmnId plmnId = (PlmnId) o;
		    return Objects.equals(this.mcc, plmnId.mcc) &&
		        Objects.equals(this.mnc, plmnId.mnc);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(mcc, mnc);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class PlmnId {\n");
		    
		    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
		    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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
