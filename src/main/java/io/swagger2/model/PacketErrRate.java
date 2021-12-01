package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PacketErrRate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class PacketErrRate   {
  @JsonProperty("packetErrRate")
  private String packetErrRate = null;
  
  public PacketErrRate(String packetErrRate) {
	  if(packetErrRate == null || packetErrRate.length() > 7) {
			this.packetErrRate = null;
		}
		else {
			String pattern = "^[0-9]E-[0-9])$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(packetErrRate);
			if(m.matches()) {
				this.packetErrRate = packetErrRate.toUpperCase();
			}
			else {
				this.packetErrRate = null;
			}
		}
	}

  public static boolean checkIfValid(String input) {
	  boolean output = false;
	  PacketErrRate rate = new PacketErrRate(input);
	  if(rate !=null) {
		  output = true;
	  }
	  return output;
  }
	
  public String getPacketErrRate() {
	return packetErrRate;
}



public void setPacketErrRate(String packetErrRate) {
	this.packetErrRate = packetErrRate;
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
    sb.append("class PacketErrRate {\n");
    
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
