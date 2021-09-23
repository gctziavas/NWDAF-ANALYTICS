package io.swagger2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - UNEXPECTED_UE_LOCATION: Unexpected UE location   - UNEXPECTED_LONG_LIVE_FLOW: Unexpected long-live rate flows   - UNEXPECTED_LARGE_RATE_FLOW: Unexpected large rate flows   - UNEXPECTED_WAKEUP: Unexpected wakeup   - SUSPICION_OF_DDOS_ATTACK: Suspicion of DDoS attack   - WRONG_DESTINATION_ADDRESS: Wrong destination address   - TOO_FREQUENT_SERVICE_ACCESS: Too frequent Service Access   - UNEXPECTED_RADIO_LINK_FAILURES: Unexpected radio link failures   - PING_PONG_ACROSS_CELLS: Ping-ponging across neighbouring cells 
 */
@ApiModel(description = "Possible values are   - UNEXPECTED_UE_LOCATION: Unexpected UE location   - UNEXPECTED_LONG_LIVE_FLOW: Unexpected long-live rate flows   - UNEXPECTED_LARGE_RATE_FLOW: Unexpected large rate flows   - UNEXPECTED_WAKEUP: Unexpected wakeup   - SUSPICION_OF_DDOS_ATTACK: Suspicion of DDoS attack   - WRONG_DESTINATION_ADDRESS: Wrong destination address   - TOO_FREQUENT_SERVICE_ACCESS: Too frequent Service Access   - UNEXPECTED_RADIO_LINK_FAILURES: Unexpected radio link failures   - PING_PONG_ACROSS_CELLS: Ping-ponging across neighbouring cells ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class ExceptionId  implements AnyOfExceptionId {
	String ExceptionIdString;
	public ExceptionId(String input) {
		if(input==null) {
			return ;
		}
		else {
			input = input.toUpperCase();
			List <String> ExceptionIdValues = new ArrayList<String>(
					Arrays.asList("UNEXPECTED_UE_LOCATION", "UNEXPECTED_LONG_LIVE_FLOW", "UNEXPECTED_LARGE_RATE_FLOw", "UNEXPECTED_WAKEUP", 
							"SUSPICION_OF_DDOS_ATTACK", "WRONG_DESTINATION_ADDRESS", "TOO_FREQUENT_SERVICE_ACCESS", "UNEXPECTED_RADIO_LINK_FAILURES", "PING_PONG_ACROSS_CELLS"));
			if(ExceptionIdValues.contains(input)) {
				ExceptionIdString = input;
			}
			else {
				ExceptionIdString = null;
			}
		}
	}
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
    sb.append("class ExceptionId {\n");
    
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
