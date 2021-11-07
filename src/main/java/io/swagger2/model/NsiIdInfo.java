package io.swagger2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.api.JsonToMap;
import io.swagger2.api.ReadFileIntoList;
import io.swagger2.model.Snssai;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the S-NSSAI and the optionally associated Network Slice Instance(s).
 */
@ApiModel(description = "Represents the S-NSSAI and the optionally associated Network Slice Instance(s).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class NsiIdInfo   {
  @JsonProperty("snssai")
  
  private Snssai snssai = null;

  @JsonProperty("nsiIds")
  @Valid
  private List<String> nsiIds = null;

  public NsiIdInfo(Snssai snssai) {
    this.snssai = snssai;
  }
  
  public NsiIdInfo(Snssai snssai, ArrayList<String> nsiIds) {
	  if( snssai == null ) {
		  return ;
	  }
	  else {
		  this.snssai = snssai;
		  this.nsiIds = nsiIds;
	  }
  }
  
  public NsiIdInfo() {
	// TODO Auto-generated constructor stub
}

/**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public NsiIdInfo nsiIds(ArrayList<String> nsiIds) {
    this.nsiIds = nsiIds;
    return this;
  }

  public NsiIdInfo addNsiIdsItem(String nsiIdsItem) {
    if (this.nsiIds == null) {
      this.nsiIds = new ArrayList<>();
    }
    this.nsiIds.add(nsiIdsItem);
    return this;
  }
  
  /**
   * Get nsiIds
   * @return nsiIds
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getNsiIds() {
    return nsiIds;
  }

  public void setNsiIds(List<String> nsiIds) {
    this.nsiIds = nsiIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsiIdInfo nsiIdInfo = (NsiIdInfo) o;
    return Objects.equals(this.snssai, nsiIdInfo.snssai) &&
        Objects.equals(this.nsiIds, nsiIdInfo.nsiIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snssai, nsiIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsiIdInfo {\n");
    
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    nsiIds: ").append(toIndentedString(nsiIds)).append("\n");
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
  
  public ArrayList<NsiIdInfo> stringToNsiIdInfos (String input){
	  ArrayList<NsiIdInfo> output = new ArrayList<NsiIdInfo>();
	  if(input.contains("},")) {
			String[] parts = input.split("},"); //Split the different NsiIdInfo inputs
			
			for(int i = 0; i<parts.length; i++) {
				NsiIdInfo info = null;
				String[] pairs = parts[i].split(";"); // Split Snssais and nsiIds but keeping them paired
				ArrayList <String> nsiIds = new ArrayList<String>();
				Map<String, String> snssaiPart = new JsonToMap().ColonToMap(pairs[0]);
				Map<String, String> idPart;
				if (pairs.length==2) {
					idPart = new JsonToMap().ColonToMap(pairs[1]);
					String[] nsiIdsString = idPart.get("nsiIds").split(",");
					for(int k=0; k<nsiIdsString.length; k++) {
						nsiIds.add(nsiIdsString[k]);
					}
					
				}
				String snssaiString = snssaiPart.get("snssai");
				
				//System.out.println("SNSSAI = "+snssai + " Corresponding nsiIds = "+Arrays.toString(nsiIds));
				
				  if (Snssai.checkSnssai(snssaiString)!=null) {
					  Snssai snssai = new Snssai(snssaiString);
					  info = new NsiIdInfo(snssai , nsiIds);
					  output.add(info);
					  }
			}
	  }
	  else {
		  NsiIdInfo info = null;
		  String[] pairs = input.split(";"); // Split Snssais and nsiIds but keeping them paired
		  Map<String, String> snssaiPart = new JsonToMap().ColonToMap(pairs[0]);
		  ArrayList <String> nsiIds = new ArrayList<String>();
		  Map<String, String> idPart;
		  if (pairs.length==2) {
			idPart = new JsonToMap().ColonToMap(pairs[1]);
			String[] nsiIdsString = idPart.get("nsiIds").split(",");
			for(int k=0; k<nsiIdsString.length; k++) {
				nsiIds.add(nsiIdsString[k]);
			}
		}
		  String snssaiString = snssaiPart.get("snssai");
		  
		  //System.out.println("SNSSAI = "+snssai + " Corresponding nsiIds = "+Arrays.toString(nsiIds));
			
		  if (Snssai.checkSnssai(snssaiString)!=null) {
			  Snssai snssai = new Snssai(snssaiString);
			  info = new NsiIdInfo(snssai , nsiIds);
			  output.add(info);
			  }
	  }
	  //System.out.println(output.toString());
	  return output;
  }
  public static ArrayList<String> isFileOfNsiId(String fileName) {
	  ArrayList<String> allNsiIds= new ArrayList<String>();
	  if(Snssai.checkSnssai(fileName) == null) {
		  return allNsiIds;
	  }
	  else {
		  String file = "/home/gctz/Desktop/data/"+fileName;
		  String snssaiIn = fileName;
		  File tempFile = new File(file);
		  List<String> loadLevels = new ReadFileIntoList().readFileInList(file);
		  for (int i = 0; i < loadLevels.size(); i++) {
			  List<String> objects = Arrays.asList(loadLevels.get(i).split(" "));
			  for(int j=1; j<objects.size(); j++) {
				  String currentNsiId = objects.get(j).split("-")[0];
				  if (!allNsiIds.contains(currentNsiId)) {
					allNsiIds.add(currentNsiId);
				}
			  }
		  }
	  }
	  return allNsiIds;
  }
  
  
  
}
