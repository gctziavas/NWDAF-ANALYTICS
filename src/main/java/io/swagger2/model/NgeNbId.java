package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NgeNbId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class NgeNbId   {
  


@JsonProperty("ngeNbId")	
  private String ngeNbId = null;
  
  public NgeNbId(String ngeNbId) {
	  if(ngeNbId == null) {
		  this.ngeNbId = null;
	  }
	  else {
		  String patternMacro = "^MacroNGeNB-[A-Fa-f0-9]{5}$";
		  Pattern macroPat = Pattern.compile(patternMacro);
		  Matcher macroMatcher = macroPat.matcher(ngeNbId);
		  
		  String patternSMacro = "^SMacroNGeNB-[A-Fa-f0-9]{5}$";
		  Pattern sMacroPat = Pattern.compile(patternSMacro);
		  Matcher sMacroMatcher = sMacroPat.matcher(ngeNbId);
		  
		  String patternLMacro = "^LMacroNGeNB-[A-Fa-f0-9]{6}$";;
		  Pattern lMacroPat = Pattern.compile(patternLMacro);
		  Matcher lMacroMatcher = lMacroPat.matcher(ngeNbId);
		  
		  if(macroMatcher.matches() || sMacroMatcher.matches() || lMacroMatcher.matches()) {
			  this.ngeNbId = ngeNbId;
		  }
		  else {
			  this.ngeNbId = null;
		  }
	  }
  }
  
  public String getNgeNbId() {
		return ngeNbId;
	}


	public void setNgeNbId(String ngeNbId) {
		this.ngeNbId = ngeNbId;
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
    sb.append("class NgeNbId {\n");
    
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
