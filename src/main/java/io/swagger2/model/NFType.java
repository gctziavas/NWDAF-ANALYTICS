package io.swagger2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NF types known to NRF
 */
@ApiModel(description = "NF types known to NRF")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class NFType  implements AnyOfNFType {
	String NFTypeString;
	  public NFType(String input) {
		  if(input==null) {
			  return ;
		  }
		  input = input.toUpperCase();
		  List<String> NFTypeValues = new ArrayList<String>(
					Arrays.asList("NRF", "UDM", "AMF", "SMF", "AUSF", "NEF", "PCF", "SMSF", "NSSF", 
							"UDR", "LMF", "GMLC","5G_EIR", "SEPP", "UPF", "N3IWF", "AF", "UDSF", "BSF", 
							"CHF", "NWDAF", "PCSCF", "CBCF", "UCMF", "HSS", "SOR_AF", "SPAF", "MME", "SCSAS", 
							"SCEF", "SCP", "NSSAAF", "ICSCF", "SCSCF"));
		  if(NFTypeValues.contains(input)) {
			  NFTypeString = input;
			  
		  }
		  else{
			  NFTypeString = null;
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
    sb.append("class NFType {\n");
    
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
