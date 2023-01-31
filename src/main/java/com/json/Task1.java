package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1 {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file = new FileReader("C:\\Users\\Vivek Murugan\\eclipse-workspace\\JsonObject\\src\\test\\resources\\File\\FileName1.json");
		
		JSONParser jsonparser = new JSONParser();
		
		Object parse = jsonparser.parse(file);
		
		//convert obj into JSONObj
		
		JSONObject jsonobject = (JSONObject)parse;
		Object object = jsonobject.get("data");
		
		JSONObject jsonObject=(JSONObject)object;
		Set entrySet = jsonObject.entrySet();
		System.out.println(entrySet);
		
		System.out.println("=============================================");

		for (Object object2 : entrySet) {
			System.out.println(object2);
		}
		
		System.out.println("=============================================");
		
		JSONObject jsonobject1 = (JSONObject)parse;
		Object object2 = jsonobject1.get("support");
		JSONObject jsonobject2 = (JSONObject)object2;
		
		Set entrySet2 = jsonobject2.entrySet();
		System.out.println(entrySet2);
		
		System.out.println("=============================================");

		for (Object object3 : entrySet2) {
			System.out.println(object3);
			
			
		}
	}

}
