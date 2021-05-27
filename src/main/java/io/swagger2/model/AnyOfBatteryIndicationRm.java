package io.swagger2.model;

import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * BatteryIndicationRm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-10T16:47:45.539693+03:00[Europe/Athens]")

public interface AnyOfBatteryIndicationRm {
	public class BatteryIndicationRm  implements AnyOfBatteryIndicationRm {

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
		    sb.append("class BatteryIndicationRm {\n");
		    
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
