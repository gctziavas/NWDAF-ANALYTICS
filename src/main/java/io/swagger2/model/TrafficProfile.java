package io.swagger2.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;

/**
 * Possible values are - SINGLE_TRANS_UL: Uplink single packet transmission. - SINGLE_TRANS_DL: Downlink single packet transmission. - DUAL_TRANS_UL_FIRST: Dual packet transmission, firstly uplink packet transmission with subsequent downlink packet transmission. - DUAL_TRANS_DL_FIRST: Dual packet transmission, firstly downlink packet transmission with subsequent uplink packet transmission. 
 */
@ApiModel(description = "Possible values are - SINGLE_TRANS_UL: Uplink single packet transmission. - SINGLE_TRANS_DL: Downlink single packet transmission. - DUAL_TRANS_UL_FIRST: Dual packet transmission, firstly uplink packet transmission with subsequent downlink packet transmission. - DUAL_TRANS_DL_FIRST: Dual packet transmission, firstly downlink packet transmission with subsequent uplink packet transmission. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-10T16:47:45.539693+03:00[Europe/Athens]")


	public class TrafficProfile  implements AnyOfTrafficProfile, AnyOfTrafficProfileRm {

		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    return true;
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash();
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class TrafficProfile {\n");
		    
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



