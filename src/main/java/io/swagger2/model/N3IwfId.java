package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * N3IwfId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class N3IwfId   {
	@JsonProperty("n3IwfId")
	private String n3IwfId = null;
	
	public N3IwfId(String n3IwfId) {
		if(n3IwfId == null) {
			this.n3IwfId = null;
		}
		else {
			String pattern = "^[A-Fa-f0-9]+$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(n3IwfId);
			if(m.matches()) {
				
				this.n3IwfId = n3IwfId.toUpperCase();
			}
			else {
				this.n3IwfId = null;
			}
		}
	}
	
	public String getN3IwfId() {
		return n3IwfId;
	}

	public void setN3IwfId(String n3IwfId) {
		this.n3IwfId = n3IwfId;
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
  		sb.append("class N3IwfId {\n");
    
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
