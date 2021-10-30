package io.swagger2.api;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
public class ReadFileIntoList {
	public static List<String> readFileInList(String fileName){
		List<String> lines = Collections.emptyList();
		try{
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}
		catch (IOException e){
			// do something
			e.printStackTrace();
	    }
		//System.out.println(lines);
	    return lines;
	  }
}
