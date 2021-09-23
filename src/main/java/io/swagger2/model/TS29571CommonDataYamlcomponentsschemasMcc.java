package io.swagger2.model;
import java.util.Objects;



public class TS29571CommonDataYamlcomponentsschemasMcc {
	public static class Mcc   {
		public Integer Mcc = null;
		
		public Mcc(Integer mcc) {
			if(mcc==null) {
				  return ;
			  }
			else {
				Mcc = mcc;
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
		    sb.append("class Mcc {\n");
		    
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

	public static TS29571CommonDataYamlcomponentsschemasMcc Mcc(int parseInt) {
		return Mcc(parseInt);
		
	}
}
