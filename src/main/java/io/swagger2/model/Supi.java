package io.swagger2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

import io.swagger2.api.JsonToMap;
import io.swagger2.api.StringToList;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Supi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Supi   {

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
  
  public Supi() {
	  return;
	  
  }
  
  public List<String> stringToSupis (String input) {
	  List<String> inputString = new StringToList().stringToList(input);
	  List<String> output = new ArrayList<String>();
	  //Map<String, String> inputMap = new JsonToMap().MinusSignToMap(input);
	  //System.out.println(inputString);
	  for(int i = 0; i < inputString.size(); i++) {
		  Map<String, String> inputMap = new JsonToMap().MinusSignToMap(inputString.get(i));
		  //System.out.println(inputMap);
		  if(inputMap.get("imsi") != null) {
			  if(inputMap.get("imsi").matches("[0-9]{5,15}")) {
				  output.add(inputString.get(i));
				  //System.out.println(inputMap);
				  }
			  }
		  if(inputMap.get("nai") != null) {
			  output.add(inputString.get(i));
			  //System.out.println(inputMap);
			  }
		  if(inputMap.get("gci") != null) {
			  output.add(inputString.get(i));
			  //System.out.println(inputMap);
			  }
		  if(inputMap.get("gli") != null) {
			  output.add(inputString.get(i));
			  //System.out.println(inputMap);
			  }
		//System.out.println(output);  
	  }
	return output;
  }
  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Supi {\n");
    
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
