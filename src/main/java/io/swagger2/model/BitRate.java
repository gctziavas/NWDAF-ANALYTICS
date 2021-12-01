package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BitRate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class BitRate   {
  
  @JsonProperty("bitRate")	
  private String bitRate = null;	

  public BitRate(String bitRate) {
	  String pattern = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$";
	  Pattern r = Pattern.compile(pattern);
	  Matcher m = r.matcher(bitRate);
	  if(m.matches()) {
		  this.bitRate = bitRate.toUpperCase();
	  }
	  else {
		  this.bitRate = null;
	  }
  }
  
  public static boolean checkIfValid(String input) {
	  boolean output = false;
	  BitRate rate = new BitRate(input);
	  if(rate != null) {
		  output = true;
	  }
	  return output;
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
    sb.append("class BitRate {\n");
    
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
