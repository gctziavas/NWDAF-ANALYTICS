package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EutraCellId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class EutraCellId   {
	
	private String eutraCellId = null;
	public EutraCellId(String eutraCellId) {
		if(eutraCellId == null || eutraCellId.length() > 7) {
			return ;
		}
		else {
			String pattern = "^[A-Fa-f0-9]{7}$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(eutraCellId);
			if(m.matches()) {
				this.eutraCellId = eutraCellId;
			}
			
		}
	}

	public String getEutraCellId() {
		return eutraCellId;
	}

	public void setEutraCellId(String eutraCellId) {
		this.eutraCellId = eutraCellId;
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
    sb.append("class EutraCellId {\n");
    sb.append(eutraCellId);
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
