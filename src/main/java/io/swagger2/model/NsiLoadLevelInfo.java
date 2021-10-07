package io.swagger2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.model.Snssai;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the slice instance and the load level information.
 */
@ApiModel(description = "Represents the slice instance and the load level information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class NsiLoadLevelInfo   {
  @JsonProperty("loadLevelInformation")
  private Integer loadLevelInformation = null;

  @JsonProperty("snssai")
  // an valw @   Json Back Reference to trexei alla den mou gyrizei to snssai
  //private Snssai snssai = null;
  private String snssai = null;

  @JsonProperty("nsiId")
  private String nsiId = null;

  public NsiLoadLevelInfo loadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
    return this;
  }

  /**
   * Get loadLevelInformation
   * @return loadLevelInformation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getLoadLevelInformation() {
    return loadLevelInformation;
  }

  public void setLoadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
  }
  
  //public NsiLoadLevelInfo snssai(Snssai snssai) {
  public NsiLoadLevelInfo snssai(String snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    //public Snssai getSnssai() {
    public String getSnssai() {
    return snssai;
  }
  //public void setSnssai(Snssai snssai) {
  public void setSnssai(String snssai) {
    this.snssai = snssai;
  }

  public NsiLoadLevelInfo nsiId(String nsiId) {
    this.nsiId = nsiId;
    return this;
  }
  
  public NsiLoadLevelInfo(Snssai givenSnssai) {
	if(givenSnssai == null) {
		return ;
	}  
	else {
		String snssaiIn = givenSnssai.toString();
		Random r = new Random();
		int loadLevelInfo = r.nextInt(100) + 1;
		this.snssai = snssaiIn;
		//this.snssai = new Snssai(snssaiIn);
		this.loadLevelInformation = loadLevelInfo;
	}
  }
  public NsiLoadLevelInfo(Snssai givenSnssai, String givenNsiId) {
		if(givenSnssai == null) {
			return ;
		}  
		else {
			String snssaiIn = givenSnssai.toString2();
			Random r = new Random();
			int loadLevelInfo = r.nextInt(100) + 1;
			this.snssai = snssaiIn;
			//this.snssai = new Snssai(snssaiIn);
			this.loadLevelInformation = loadLevelInfo;
			setNsiId(givenNsiId);
		}
	  }
  
  public ArrayList<NsiLoadLevelInfo> snssaisToNsiLoadLevelList(ArrayList<Snssai> givenSnssais){
	  ArrayList<NsiLoadLevelInfo> output = new ArrayList<>();
	  for(int i=0; i<givenSnssais.size(); i++) {
		  NsiLoadLevelInfo s = new NsiLoadLevelInfo(givenSnssais.get(i));
		  output.add(s);
	  }
	  return output;
  }
  


  /**
   * Get nsiId
   * @return nsiId
  **/
  @ApiModelProperty(value = "")
  
    public String getNsiId() {
    return nsiId;
  }

  public void setNsiId(String nsiId) {
    this.nsiId = nsiId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsiLoadLevelInfo nsiLoadLevelInfo = (NsiLoadLevelInfo) o;
    return Objects.equals(this.loadLevelInformation, nsiLoadLevelInfo.loadLevelInformation) &&
        Objects.equals(this.snssai, nsiLoadLevelInfo.snssai) &&
        Objects.equals(this.nsiId, nsiLoadLevelInfo.nsiId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadLevelInformation, snssai, nsiId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsiLoadLevelInfo {\n");
    
    sb.append("    loadLevelInformation: ").append(toIndentedString(loadLevelInformation)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    nsiId: ").append(toIndentedString(nsiId)).append("\n");
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
