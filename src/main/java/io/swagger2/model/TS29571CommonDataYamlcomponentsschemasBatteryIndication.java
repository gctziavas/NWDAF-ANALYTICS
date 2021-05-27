package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * BatteryIndication
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-10T16:47:45.539693+03:00[Europe/Athens]")

public class TS29571CommonDataYamlcomponentsschemasBatteryIndication {
	public class BatteryIndication  implements AnyOfBatteryIndicationRm {
		  @JsonProperty("batteryInd")
		  private Boolean batteryInd = null;

		  @JsonProperty("replaceableInd")
		  private Boolean replaceableInd = null;

		  @JsonProperty("rechargeableInd")
		  private Boolean rechargeableInd = null;

		  public BatteryIndication batteryInd(Boolean batteryInd) {
		    this.batteryInd = batteryInd;
		    return this;
		  }

		  /**
		   * Get batteryInd
		   * @return batteryInd
		  **/
		  @ApiModelProperty(value = "")
		  
		    public Boolean isBatteryInd() {
		    return batteryInd;
		  }

		  public void setBatteryInd(Boolean batteryInd) {
		    this.batteryInd = batteryInd;
		  }

		  public BatteryIndication replaceableInd(Boolean replaceableInd) {
		    this.replaceableInd = replaceableInd;
		    return this;
		  }

		  /**
		   * Get replaceableInd
		   * @return replaceableInd
		  **/
		  @ApiModelProperty(value = "")
		  
		    public Boolean isReplaceableInd() {
		    return replaceableInd;
		  }

		  public void setReplaceableInd(Boolean replaceableInd) {
		    this.replaceableInd = replaceableInd;
		  }

		  public BatteryIndication rechargeableInd(Boolean rechargeableInd) {
		    this.rechargeableInd = rechargeableInd;
		    return this;
		  }

		  /**
		   * Get rechargeableInd
		   * @return rechargeableInd
		  **/
		  @ApiModelProperty(value = "")
		  
		    public Boolean isRechargeableInd() {
		    return rechargeableInd;
		  }

		  public void setRechargeableInd(Boolean rechargeableInd) {
		    this.rechargeableInd = rechargeableInd;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    BatteryIndication batteryIndication = (BatteryIndication) o;
		    return Objects.equals(this.batteryInd, batteryIndication.batteryInd) &&
		        Objects.equals(this.replaceableInd, batteryIndication.replaceableInd) &&
		        Objects.equals(this.rechargeableInd, batteryIndication.rechargeableInd);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(batteryInd, replaceableInd, rechargeableInd);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class BatteryIndication {\n");
		    
		    sb.append("    batteryInd: ").append(toIndentedString(batteryInd)).append("\n");
		    sb.append("    replaceableInd: ").append(toIndentedString(replaceableInd)).append("\n");
		    sb.append("    rechargeableInd: ").append(toIndentedString(rechargeableInd)).append("\n");
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
