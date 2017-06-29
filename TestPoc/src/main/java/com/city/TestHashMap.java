package com.city;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		  Map<String, String>  map=new HashMap<String, String>();
		System.out.println("1-->"+map.put("1", "A"));
		System.out.println("5-->"+map.put("1", "C"));
		System.out.println("2-->"+map.put("1", "B"));
		System.out.println("3-->"+map.put("2", "A"));
		System.out.println("4-->"+map.put("2", "B"));
		System.out.println("Map Size::"+map.size());
		Set<String> set=new HashSet<String>();
		System.out.println("A-->"+set.add("A"));
		System.out.println("B-->"+set.add("A"));
		System.out.println("Set Size::"+set.size());
		

	}

}
