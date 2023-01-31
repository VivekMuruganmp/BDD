package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProject {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader filereader = new FileReader("C:\\Users\\Vivek Murugan\\eclipse-workspace\\JsonObject\\src\\test\\resources\\File\\FileName.json");
		JSONParser jsonparser = new JSONParser();
		Object parse = jsonparser.parse(filereader);
		//convert obj into JSONOBJECT
		
		JSONObject jsonobject = (JSONObject)parse;
		Object object = jsonobject.get("name");
		System.out.println(object);
	}

}
