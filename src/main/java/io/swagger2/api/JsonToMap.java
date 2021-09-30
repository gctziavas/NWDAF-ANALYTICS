package io.swagger2.api;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonToMap {
	Map<String, String> jsonToMap(String inputString){
		
		Map<String, String> map = new HashMap<>();
		String str=inputString;
		String pattern = "\\b([^\\s]+)=([^\\s]+)\\b";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);

		while (m.find()) {
		      //System.out.println("Found a key/value: (" + m.group(1) + ", " + m.group(2) + ")");
		      map.put(m.group(1), m.group(2));
		  }
		return map;
	}
	public Map<String, String> MinusSignToMap(String inputString){
		
		Map<String, String> map = new HashMap<>();
		String str=inputString;
		String pattern = "\\b([^\\s]+)-([^\\s]+)\\b";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);

		while (m.find()) {
		      //System.out.println("Found a key/value: (" + m.group(1) + ", " + m.group(2) + ")");
		      map.put(m.group(1), m.group(2));
		  }
		return map;
	}
public Map<String, String> ColonToMap(String inputString){
		
		Map<String, String> map = new HashMap<>();
		String str=inputString;
		String pattern = "\\b([^\\s]+):([^\\s]+)\\b";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);

		while (m.find()) {
		      System.out.println("Found a key/value: (" + m.group(1) + ", " + m.group(2) + ")");
		      map.put(m.group(1), m.group(2));
		  }
		return map;
	}
}
