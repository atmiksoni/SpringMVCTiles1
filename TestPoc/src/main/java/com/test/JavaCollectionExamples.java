package com.test;

import java.util.*;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class JavaCollectionExamples {

    public void testHashSet() {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println("Hash Set size::" + set.size());

        for (Iterator it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

    }


    public void testHashMap(){
        Map<String ,String> map = new HashMap<String,String>();
         String value=  map.put("a","abc");
         System.out.println("Value:"+value+":Key"+map.get("a"));
        String value1=  map.put("a","xyz");
        System.out.println("Value1:"+value1+":Key"+map.get("a"));

    }

    public static void main(String[] args) {
        new JavaCollectionExamples().testHashSet();
    }

    public void iterateHashMapInDifferentWay(){
        Map<String ,String> map = new HashMap<String,String>();
        map.put("a","abc");
        map.put("b","ball");
        map.put("c","cat");
        map.put("d","dog");

        //Using Iterator
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while( iterator.hasNext()){
           Map.Entry<java.lang.String,java.lang.String>  itNext= iterator.next();
           System.out.println("Method Using Iterator::"+itNext.getKey()+"::Value::"+ itNext.getValue());
        }

       // Method #1: Iterating over entries using For-Each loop
        System.out.println("Method #1: Iterating over entries using For-Each loop");
        for (Map.Entry<String ,String> entry : map.entrySet()){
           System.out.println("Key::"+entry.getKey()+":::Value::"+entry.getValue());

        }

        System.out.println("Method #2: Iterating over keys or values using For-Each loop");

        for (String key :map.keySet()) {
            System.out.println("Method#2::Key::"+key);

        }

        for (String value :map.values()) {
            System.out.println("Method#2::Key::"+value);

        }


    }

}
