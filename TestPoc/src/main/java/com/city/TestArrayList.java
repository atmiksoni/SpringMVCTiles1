package com.city;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		list.remove("2");
		System.out.println("list:: "+list.get(1));
		System.out.println("size:::"+list.size());
		
	}

}
