package com.ams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleExample {

	public static void main(String[] args) {
		
		readJsonFile();

	}
	
	public static void readJsonFile()
	{
		JSONParser parser = new JSONParser();
		 
		try {
	 
			Object obj = parser.parse(new FileReader("test.json"));
	 
			JSONObject jsonObject = (JSONObject) obj;
	 
			String name = (String) jsonObject.get("1");
			System.out.println(name);
	 
			String age = (String) jsonObject.get("2");
			System.out.println(age);
	 
			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("Message");
			Iterator<String> iterator = msg.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeJsonFile()
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("1", "ABC");
		jsonObject.put("2", "xyz");
		JSONArray list=new JSONArray();
		
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");
		jsonObject.put("Message", list);
		
		try {
			 
			FileWriter file = new FileWriter("test.json");
			file.write(jsonObject.toJSONString());
			file.flush();
			file.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
		System.out.print(jsonObject);
	}

}
