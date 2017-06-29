package com.amdocs;

public class TestFileParent {
	
	
	public static void main(String[] args) {
		String fileSts="Accp";
		String gropSts="";
		
		if(fileSts.equals("Accp")){
			System.out.println("Part1");
		}
		else if(gropSts.equals("Closed")){
			System.out.println("part2");
		}
		else{
			System.out.println("Else Part");
		}


		String inputString  =" atmik soni is my name";
		String[] strings = inputString.trim().split("\\s");
		System.out.println(strings.length);
	}

}
