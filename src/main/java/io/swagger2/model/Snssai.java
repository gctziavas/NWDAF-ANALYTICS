package io.swagger2.model;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger2.api.StringToList;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Snssai
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Snssai   {
  @JsonProperty("sst")
  private static Integer sst = null;

  @JsonProperty("sd")
  private static String sd = null;

  public Snssai sst(Integer sst) {
    this.sst = sst;
    return this;
  }
  
  public Snssai(Integer sst, String sd) {
	  if(sst == null) {
		  return ;
	  }
	  else {
		  setSst(sst);
		  setSd(sd);
		  
	  }
  }
  
  public static List<String> snssai(Integer SST, String SD) {
	  sst = SST;
	  sd = SD;
	  List<String> list = new ArrayList<String>();
	  list.add(String.valueOf(sst));
	  list.add(sd);
	  	  
	  return list;
  }
  /**
   * Get sst
   * minimum: 0
   * maximum: 255
   * @return sst
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Min(0) @Max(255)   public static Integer getSst() {
    return sst;
  }

  public static void setSst(Integer sst) {
    sst = sst;
  }

  public Snssai sd(String sd) {
    this.sd = sd;
    return this;
  }

  /**
   * Get sd
   * @return sd
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]{6}$")   public static String getSd() {
    return sd;
  }

  public static void setSd(String sd) {
    sd = sd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snssai snssai = (Snssai) o;
    return Objects.equals(this.sst, snssai.sst) &&
        Objects.equals(this.sd, snssai.sd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sst, sd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snssai {\n");
    
    sb.append("    sst: ").append(toIndentedString(sst)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
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
  public static List<Snssai> stringToSnssaiList(String input) {
	  List<String> snssaisStringList = new ArrayList<String>();
	  List output = new ArrayList<Snssai>();
	  String str=input;
	  String[] parts = str.split(",");
	  int i,j;
	  for(i=0; i<parts.length; i++) {
		  setSst(null);
		  setSd(null);
		  snssaisStringList.add(parts[i]);
		  String[] parts2 = parts[i].split("-");
		  //System.out.println("Sst="+parts2[0] + " Sd="+parts2[1] );
		  setSst(Integer.parseInt(parts2[0]));
		  sst = Integer.parseInt(parts2[0]);
		  sd = (parts2[1]);

		  output.add(snssai(sst, sd));
		  
		  }
	  
	  //System.out.println(output);
	  return output;
  }
  public static Snssai stringToSnssai(String input) {
	  String str = input;
	  String[] parts = str.split("-");
	  setSst(null);
	  setSd(null);
	  sst = Integer.parseInt(parts[0]);
	  sd = (parts[1]);
	  Snssai output = new Snssai(sst, sd);
	  System.out.println("Snssai = "+ output);
	  return output;
  }
}
