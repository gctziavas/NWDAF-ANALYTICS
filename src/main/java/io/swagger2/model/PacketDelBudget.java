package io.swagger2.model;

import java.util.Objects;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PacketDelBudget
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class PacketDelBudget   {
  @JsonProperty("packetDelBudget")
  private Integer packetDelBudget = null;
  
  public PacketDelBudget(Integer packetDelBudget) {
	  if(packetDelBudget>=1) {
		  this.packetDelBudget = packetDelBudget;
	  }
	  else {
		  this.packetDelBudget = null;
	  }
  }
	
  public static boolean checkIfValid(Integer input) {
	  boolean output = false;
	  PacketDelBudget rate = new PacketDelBudget(input);
	  if(rate !=null) {
		  output = true;
	  }
	  return output;
  }
  
  public Integer getPacketDelBudget() {
	return packetDelBudget;
  }

	public void setPacketDelBudget(Integer packetDelBudget) {
		this.packetDelBudget = packetDelBudget;
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
    sb.append("class PacketDelBudget {\n");
    
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
