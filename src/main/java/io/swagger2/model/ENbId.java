package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ENbId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class ENbId   {
	
	@JsonProperty("eNbId")	
	private String eNbId = null;
	  
	public ENbId(String eNbId) {
		if(eNbId == null) {
			this.eNbId = null;
		}
		else {
			String patternMacro = "^MacroeNB-[A-Fa-f0-9]{5}$";
			Pattern macroPat = Pattern.compile(patternMacro);
			Matcher macroMatcher = macroPat.matcher(eNbId);
			  
			String patternSMacro = "^SMacroeNB-[A-Fa-f0-9]{5}$";
			Pattern sMacroPat = Pattern.compile(patternSMacro);
			Matcher sMacroMatcher = sMacroPat.matcher(eNbId);
			  
			String patternLMacro = "^LMacroeNB-[A-Fa-f0-9]{6}$";;
			Pattern lMacroPat = Pattern.compile(patternLMacro);
			Matcher lMacroMatcher = lMacroPat.matcher(eNbId);
			
			String patternHomeeNB = "^HomeeNB-[A-Fa-f0-9]{7}$";
			Pattern homeeNBPat = Pattern.compile(patternHomeeNB);
			Matcher homeeNbMatcher = homeeNBPat.matcher(eNbId);
			
			if( macroMatcher.matches() || sMacroMatcher.matches() || lMacroMatcher.matches() || homeeNbMatcher.matches() ){
				this.eNbId = eNbId;
			}
			else {
				this.eNbId = null;
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
    sb.append("class ENbId {\n");
    
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
