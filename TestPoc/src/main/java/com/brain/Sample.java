package com.brain;

public class Sample {
	String name;
    public Sample(String name){
   this.name = name;
    }
    @Override
    public int hashCode() {
   return name.hashCode();
    }
    @Deprecated
    public static String getCompanyName() {
   return "Brainbench";
    }
    public String getname() {
   return name;
    }

    
    public void display(){
		System.out.println("Test");
	}
}
