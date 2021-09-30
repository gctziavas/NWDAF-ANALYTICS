package io.swagger2.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import io.swagger2.api.JsonToMap;
import io.swagger2.model.Ecgi;
import io.swagger2.model.ExceptionId;
import io.swagger2.model.ExpectedAnalyticsType;
import io.swagger2.model.NFType;
import io.swagger2.model.NetworkAreaInfo;
import io.swagger2.model.NetworkPerfType;
import io.swagger2.model.NsiIdInfo;
import io.swagger2.model.PlmnId;
import io.swagger2.model.Snssai;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMcc;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasMnc;
import io.swagger2.model.TS29571CommonDataYamlcomponentsschemasPlmnId;

public class StringToList {
	
	public List<ExpectedAnalyticsType> stringToExptAnaType(String input) {
		List<ExpectedAnalyticsType> output = new ArrayList<ExpectedAnalyticsType>();
		String str=input;
		String[] parts = str.split(",");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(new ExpectedAnalyticsType(parts[i]));
			}
		return output;
	}
	
	public List<ExceptionId> stringToExceptionIds(String input) {
		List<ExceptionId> output = new ArrayList<ExceptionId>();
		String str=input;
		String[] parts = str.split(",");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(new ExceptionId(parts[i]));
			}
		return output;
	}
	
	public List<NetworkPerfType> stringToNetworkPerfType(String input) {
		List<NetworkPerfType> output = new ArrayList<NetworkPerfType>();
		String str=input;
		String[] parts = str.split(",");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(new NetworkPerfType(parts[i]));
			}
		return output;
	}
	public List<String> stringToList(String input){
		List<String> output = new ArrayList<String>();
		String str=input;
		String[] parts = str.split(",");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(parts[i]);
		}

		return output;
	}
	public List<String> stringToListOnMinus(String input){
		List<String> output = new ArrayList<String>();
		String str=input;
		String[] parts = str.split("-");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(parts[i]);
		}

		return output;
	}
	
	
	public List<UUID> stringToUuidList(String input){
		List<UUID> output = new ArrayList<UUID>();
		String str=input;
		String[] parts = str.split(",");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(UUID.fromString(parts[i]));
		}
		return output;
	}
	
	public List<NFType> stringToNfTypeList(String input){
		List<NFType> output = new ArrayList<NFType>();
		String str=input;
		String[] parts = str.split(",");
		int i;
		for(i=0; i<parts.length; i++) {
			output.add(new NFType(parts[i]));
			}
		return output;
	}
	  public static List<PlmnId> StringToPlmnId(String input){
		  List <String> plmnIdStringList = new ArrayList<String>();
		  List output = new ArrayList<TS29571CommonDataYamlcomponentsschemasPlmnId.PlmnId>();
		  String str = input;
		  TS29571CommonDataYamlcomponentsschemasMcc mcc = null;
		  TS29571CommonDataYamlcomponentsschemasMnc mnc = null;
		  String[] parts = str.split("-");
		  int i, j;
		  for(i = 0; i<parts.length; i++){
			mcc = null;
			mnc = null;
			plmnIdStringList.add(parts[i]);
			String[] parts2 = parts[i].split("-");
			mcc = TS29571CommonDataYamlcomponentsschemasMcc.Mcc(Integer.getInteger(parts[0]));
			mnc = TS29571CommonDataYamlcomponentsschemasMnc.Mnc(Integer.getInteger(parts[0]));
			output.add(PlmnId.PlmnIdList(mcc, mnc));
		  }
		  
		  return output;
	  } 
//	public List<Ecgi> ecgiToList(String input){
//		List<Ecgi> output = new ArrayList<Ecgi>();
//		List<String> stringList = new ArrayList<String>();
//		Map<String, String> ecgiMap = new JsonToMap().jsonToMap(input);
//		
//		//List<PlmnId> plmnIdList =  new StringToPlmnId(ecgiMap.get("plmnId"));
//		
//		
//		return output;
//	}

	public List<ArrayList<String>> stringToNsiIdInfos(String input) {
		List<ArrayList<String>> output = new ArrayList<ArrayList<String> >();
		if(input.contains("},")) {
			String[] parts = input.split("},");
			
			for(int i = 0; i<parts.length; i++) {
				String[] pairs = parts[i].split(";");
				Map<String, String> snssaiPart = new JsonToMap().ColonToMap(pairs[0]);
				Map<String, String> idPart = new JsonToMap().ColonToMap(pairs[1]);
				String snssai = snssaiPart.get("snssai");
				String[] nsiIds = idPart.get("nsiIds").split(",");
				//System.out.println("SNSSAI = "+snssai + " Corresponding nsiIds = "+Arrays.toString(nsiIds));
				
				if (Snssai.checkSnssai(snssai)!=null) {
					ArrayList<String> pair = new ArrayList<String>();
					pair.add(snssai);
					for (int j = 0; j < nsiIds.length; j++) {
						pair.add(nsiIds[j]);
					}
					output.add(pair);
				}
			}
		}
		return output;
	}

//	public List<NsiIdInfo> stringToNsiIdInfo(String input) {
//		Map<String, String> inputMap = new JsonToMap().jsonToMap(input);
//		List<NsiIdInfo> output = new ArrayList<NsiIdInfo>();
//		
//		((NsiIdInfo) output).setSnssai(Snssai.stringToSnssai(inputMap.get("snssai")));
//		
//		return output;
//	}
//	
//	public List<NetworkAreaInfo> stringToNetworkAreaInfo(String input) {
//		List<NetworkAreaInfo> output = new ArrayList<NetworkAreaInfo>();
//		Map<String, String> networkAreaInfoMap = new JsonToMap().jsonToMap(input);
//		List<Ecgi> ecgiList = new ecgiToList(networkAreaInfoMap.get"ecgis");
//		
//		
//		return output;
//	}
	
	
}
