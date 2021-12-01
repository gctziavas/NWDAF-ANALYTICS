package io.swagger2.model;

import java.util.Objects;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QosResourceType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class QosResourceType  implements AnyOfQosResourceType {
  
  @JsonProperty("qosResourceType")  
  private String qosResourceType = null;	
  
  public QosResourceType(String qosResourceType) {
	  qosResourceType = qosResourceType.toUpperCase();
	  if(qosResourceType == "NON_GBR" || qosResourceType == "NON_CRITICAL_GBR" || qosResourceType == "CRITICAL_GBR") {
		  this.qosResourceType = qosResourceType;
	  }
	  else {
		  this.qosResourceType = null;
	  }
  }
  
  public static boolean checkIfValid(String input) {
	  //The constructor will return null if not valid
	  QosResourceType resourceType = new QosResourceType(input);
	  boolean output = false;
	  if(resourceType != null) {
		  output = true;
	  }
	  return output;
  } 
  
  public String getQosResourceType() {
	return qosResourceType;
}

public void setQosResourceType(String qosResourceType) {
	this.qosResourceType = qosResourceType;
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
    sb.append("class QosResourceType {\n");
    
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
