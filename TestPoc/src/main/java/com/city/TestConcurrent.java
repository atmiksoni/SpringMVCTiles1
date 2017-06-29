package com.city;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrent {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map=new ConcurrentHashMap<String, String>();
		
		map.put("A", "Atmik");
		map.put("B", "Babb");
		map.put("A", "Soni");
		map.put("C", "chain");
		map.put("d", "dd");
		
Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext())
        {

        	String val= map.get(iterator.next().getKey());
            if("Soni".equalsIgnoreCase(val)){
				iterator.remove();
			}

            System.out.println(val);
           
        }
        
        System.out.println(map.size()+map.get("A"));
	}

}
