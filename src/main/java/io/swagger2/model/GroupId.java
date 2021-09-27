package io.swagger2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

import io.swagger2.api.StringToList;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class GroupId   {
	
	public GroupId() {
		return;
	}
	
	public List<String> stringToGroupIds(String input) {
		List<String> inputString = new StringToList().stringToList(input);
		List<String> output = new ArrayList<String>();
		
		
		for(int i = 0; i < inputString.size(); i++) {
			List<String> current = new StringToList().stringToListOnMinus(inputString.get(i));
			String groupServiceIdentifier = current.get(0);
			String mcc = current.get(1);
			String mnc = current.get(2);
			String localGroupId = current.get(3);
			if(groupServiceIdentifier.getBytes().length <= 8  && mcc.length() <= 3 && mnc.length() <= 3 && localGroupId.getBytes().length <= 10 ) {
				output.add(inputString.get(i));
			}
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
    sb.append("class GroupId {\n");
    
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
