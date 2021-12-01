package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WAgfId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class WAgfId   {
  @JsonProperty("wAgfId")
  private String wAgfId = null;
	
  public WAgfId(String wAgfId) {
	  if(wAgfId == null) {
		  this.wAgfId = null;
	  }
	  else {
		  String pattern = "^[A-Fa-f0-9]+$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(wAgfId);
		  if(m.matches()) {
			  this.wAgfId = wAgfId.toUpperCase();
		  }
		  else {
			  this.wAgfId = null;
			}
	  }
  }
	
  public String getwAgfId() {
		return wAgfId;
	}

  public void setwAgfId(String wAgfId) {
	  this.wAgfId = wAgfId;
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
    sb.append("class WAgfId {\n");
    
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
