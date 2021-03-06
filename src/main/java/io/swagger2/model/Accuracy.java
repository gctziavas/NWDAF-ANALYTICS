package io.swagger2.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - LOW: Low accuracy. - HIGH: High accuracy. 
 */
@ApiModel(description = "Possible values are - LOW: Low accuracy. - HIGH: High accuracy. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Accuracy  implements AnyOfAccuracy {
  String stringAccuracy;
  public Accuracy(String accuracy){
	  stringAccuracy = accuracy; 
	  if(accuracy==null) {
		  return;
	  }
	  String acc = accuracy.toUpperCase();
	  String H = "HIGH";
	  String L = "LOW";
	  if( acc.equals(L) || acc.equals(H)  ) {
		  stringAccuracy = acc; 
		  }
	  else {
		  stringAccuracy = null;
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
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class Accuracy {\n");
//    
//    sb.append("}");
//    return sb.toString();
//    
//  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  @SuppressWarnings("unused")
private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
// ADDED BY ME
public String toString(String accuracy) {
	String acc = accuracy.toUpperCase();
	if(acc=="HIGH" || acc=="LOW"  ) {
		return acc;
	}
	return "null";
}
}
