package io.swagger2.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Nid
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Nid   {
	
	private String nid = null;
	public Nid(String nid) {
		if(nid == null) {
			this.nid=null;
		}
		else {
			String pattern = "^[A-Fa-f0-9]{11}$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(nid);
			if(m.matches()) {
				this.nid = nid;
			}
			else {
				this.nid = null;
			}
		}
	}
	
  public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
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
    sb.append("class Nid {\n");
    
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
