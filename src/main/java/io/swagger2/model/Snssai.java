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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Snssai
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")
public class Snssai   {
  @JsonProperty("sst")
  private Integer sst = null;

  @JsonProperty("sd")
  private String sd = null;

  public Snssai sst(Integer sst) {
    this.sst = sst;
    return this;
  }
  public Snssai sd(String sd) {
	    this.sd = sd;
	    return this;
	  }
  
  public Snssai(Integer sst, String sd) {
	  if(sst == null) {
		  return;
	  }
	  else {
		  Integer sstCheck = Integer.parseInt(String.valueOf(sst));
		  String sdCheck = null;
		  String addedZeros = "";
		  if (sd.length() < 6) {
			  int dif = 6 - sd.length();
			  for(int i=0; i<dif; i++) {
				  addedZeros+="0";
			  } 
			  
			  sdCheck = addedZeros+ sd;
		  }
		  //sdCheck = sd;
		  String pattern = "^[A-Fa-f0-9]{6}$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(sdCheck);
		  if(sstCheck >= 0 && sstCheck <= 255 && m.matches()) {
			  //setSst(sst);
			  //setSd(sd);
			  this.sst = sst;
			  this.sd = sd;
		  }
		  else {return;}	  
	  }
  }    
  
  public Snssai(String input) {
	  
	  String[] parts = {input , "000000"};

	  if(input.contains("-")) {
		  parts = input.split("-");
		  //System.out.println("++++++++++"+sst);
		  sst = Integer.valueOf(parts[0]);
		 // System.out.println("++++++++++"+sst);
	    }
	  else {sst = Integer.valueOf(parts[0]);}
	  
	  if(parts[1] != "000000") { sd = parts[1]; }
	  
	  if(sst == null) {
		  return;
	  }
	  else {
		  Integer sstCheck = Integer.parseInt(String.valueOf(sst));
		  String sdCheck = null;
		  String addedZeros = "";
		  if (sd!=null) {
			if (sd.length() < 6) {
				int dif = 6 - sd.length();
				for (int i = 0; i < dif; i++) {
					addedZeros += "0";
				}

				sdCheck = addedZeros + sd;
			} 
		}
		//sdCheck = sd;
		  String pattern = "^[A-Fa-f0-9]{6}$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m;
		if (sd!=null) {
			m = r.matcher(sdCheck);
			if(sstCheck >= 0 && sstCheck <= 255 && m.matches()) {
			  this.sst = sst;
			  this.sd = sd;
		  }
		  else {return;}	  
		}
	  }
  }    
  
  public Snssai getSnssai() {
	  if(sst == null) {
		  return null;
	  }
	  else {
		  //setSst(sst);
		  //setSd(sd);
		  this.sst = sst;
		  this.sd = sd;
		  return this;
		  
	  }
	  
  }
  
  
  /**
   * Get sst
   * minimum: 0
   * maximum: 255
   * @return sst
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Min(0) @Max(255)   public Integer getSst() {
	  return sst;
  }

  public void setSst(Integer sst) {
    this.sst = sst;
  }



  /**
   * Get sd
   * @return sd
  **/
  @ApiModelProperty(value = "")
  
public String getSd() {
	    return sd;
	  }

  public void setSd(String sd) {
    this.sd = sd;
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
	    sb.append("{\n");
	    sb.append("    sst: ").append(toIndentedString(sst)).append("\n");
	    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }
  
  
  public String toString2() {
    StringBuilder sb = new StringBuilder();
    
    if (sd!=null) {
		sb.append(sst).append("-").append(sd);
	}
    else {sb.append(sst);}
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
  
  //CHECKS IF A GIVEN SNSSAI IS VALID ACCORDING TO TS 29.571 AT CLAUSE 5.4.4.2
  public static String checkSnssai(String input) { 
	  String[] parts = {input , "000000"};
	  if(input.contains("-")) {
		  parts = input.split("-");
	    }
	  String sdCheck = null;
	  Integer sstCheck = Integer.parseInt(parts[0]);
	  String addedZeros = "";
	  if (parts[1].length() < 6) {
		  int dif = 6 - parts[1].length();
		  for(int i=0; i<dif; i++) {
			  addedZeros+="0";
		  } 
		  parts[1] = addedZeros+ parts[1];
	  }
	  sdCheck = parts[1];
	  
	  
	  
	  String pattern = "^[A-Fa-f0-9]{6}$";
	  Pattern r = Pattern.compile(pattern);
	  Matcher m = r.matcher(sdCheck);
	  if(sstCheck >= 0 && sstCheck <= 255 && m.matches()) {
		  return input;
	  }
	  else {
		  return null;
      }	  
  }
  
  public static ArrayList<Snssai> stringToSnssaiList(String input) {
	  ArrayList output = new ArrayList<Snssai>();
	  String str=input;
	  String[] parts = str.split(",");
	  
	  for(int i=0; i<parts.length; i++) {
		  String[] currentSnssai = {parts[i], null};
		  if(parts[i].contains("-")) {
			  currentSnssai = parts[i].split("-");
		  }
		  int curresntSst = Integer.parseInt(currentSnssai[0]);
		  String currentSd = (currentSnssai[1]);
		  
		  Snssai s = new Snssai(curresntSst, currentSd);
		  output.add(s);
		  }
	  return output;
  }
}
