package io.swagger2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMcc;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMcc.Mcc;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMnc;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlmnId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")

public class TS29571CommonDataYamlcomponentsschemasPlmnId {
	public class PlmnId   {
		  @JsonProperty("mcc")
		  private TS29571CommonDataYamlcomponentsschemasMcc mcc = null;

		  @JsonProperty("mnc")
		  private TS29571CommonDataYamlcomponentsschemasMnc mnc = null;

		  public PlmnId mcc(TS29571CommonDataYamlcomponentsschemasMcc mcc) {
		    this.mcc = mcc;
		    return this;
		  }
		  
		  
		  
		  /**
		   * Get mcc
		   * @return mcc
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasMcc getMcc() {
		    return mcc;
		  }

		  public void setMcc(TS29571CommonDataYamlcomponentsschemasMcc mcc) {
		    this.mcc = mcc;
		  }

		  public PlmnId mnc(TS29571CommonDataYamlcomponentsschemasMnc mnc) {
		    this.mnc = mnc;
		    return this;
		  }

		  /**
		   * Get mnc
		   * @return mnc
		  **/
		  @ApiModelProperty(required = true, value = "")
		      @NotNull

		    @Valid
		    public TS29571CommonDataYamlcomponentsschemasMnc getMnc() {
		    return mnc;
		  }

		  public void setMnc(TS29571CommonDataYamlcomponentsschemasMnc mnc) {
		    this.mnc = mnc;
		  }


		  @Override
		  public boolean equals(java.lang.Object o) {
		    if (this == o) {
		      return true;
		    }
		    if (o == null || getClass() != o.getClass()) {
		      return false;
		    }
		    PlmnId plmnId = (PlmnId) o;
		    return Objects.equals(this.mcc, plmnId.mcc) &&
		        Objects.equals(this.mnc, plmnId.mnc);
		  }

		  @Override
		  public int hashCode() {
		    return Objects.hash(mcc, mnc);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class PlmnId {\n");
		    
		    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
		    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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
	
	
	TS29571CommonDataYamlcomponentsschemasMcc Mcc=null;
	public TS29571CommonDataYamlcomponentsschemasMnc Mnc=null;
	
	public List <Object> PlmnId(TS29571CommonDataYamlcomponentsschemasMcc mcc2, TS29571CommonDataYamlcomponentsschemasMnc mnc2) {
		  List<Object> list = new ArrayList<Object>();
		  
		  if(mnc2 == null || mcc2 == null) {
			  return null;
		  }
		  else {
			  list.add(mcc2);
			  list.add(mnc2);
			  
			  return list;
		  }
	  }
	  
	public List<PlmnId> stringToPlmnIdList(String input ) {
		  List <String> plmnIdStringList = new ArrayList<String>();
		  List output = new ArrayList<PlmnId>();
		  String str=input;
		  String[] parts = str.split(",");
		  int i,j;
		  for(i=0; i<parts.length; i++) {
			  
			  plmnIdStringList.add(parts[i]);
			  String[] parts2 = parts[i].split("-");
			  //System.out.println("Sst="+parts2[0] + " Sd="+parts2[1] );
			  Mcc = TS29571CommonDataYamlcomponentsschemasMcc.Mcc(Integer.parseInt(parts2[0]));
			  Mnc = TS29571CommonDataYamlcomponentsschemasMnc.Mnc(Integer.parseInt(parts2[1]));
			  
			  output.add(PlmnId(Mcc,Mnc));
			  
			  }
		  return output;
	  }	
	
	public List<TS29571CommonDataYamlcomponentsschemasPlmnId> StringToPlmnId(String input){
		  List <String> plmnIdStringList = new ArrayList<String>();
		  List output = new ArrayList<TS29571CommonDataYamlcomponentsschemasPlmnId.PlmnId>();
		  String str = input;
		  String[] parts = str.split(",");
		  int i, j;
		  for(i = 0; i<parts.length; i++){
			Mcc = null;
			Mnc = null;
			plmnIdStringList.add(parts[i]);
			String[] parts2 = parts[i].split("-");
			Mcc = TS29571CommonDataYamlcomponentsschemasMcc.Mcc(Integer.getInteger(parts[0]));
			Mnc = TS29571CommonDataYamlcomponentsschemasMnc.Mnc(Integer.getInteger(parts[0]));
			output.add(PlmnId(Mcc, Mnc));
		  }
		  
		  return output;
	  } 

}
