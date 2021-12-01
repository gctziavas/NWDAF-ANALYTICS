package io.swagger2.model;

import java.util.Objects;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model5Qi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Model5Qi   {
  
  @JsonProperty("5qi")
  private Integer model5qi = null;
  
  public Model5Qi(Integer model5qi) {
	  if(model5qi>=0 && model5qi<256) {
		  this.model5qi = model5qi;
	  }
	  else {
		  this.model5qi = null;
	  }
  }
  
  public static boolean checkIfValid(Integer input) {
	  boolean output = false;
	  Model5Qi _5qi = new Model5Qi(input);
	  if(_5qi!=null) {
		  output = true;
	  }
	  return output;
  }
  
  public Integer getModel5qi() {
	return model5qi;
}

public void setModel5qi(Integer model5qi) {
	this.model5qi = model5qi;
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
    sb.append("class Model5Qi {\n");
    
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
