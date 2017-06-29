package com.brain.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderExample {
	public static void main(String[] args)
    {	
    	String a="";
    	a.length();
    	try{
    		
    		File file =new File("ihave10lines.txt");
    		
    		if(file.exists()){
    			
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    
    		    int linenumber = 0;
    		    String data = "";
    	            while ((data=lnr.readLine()) != null){
    	        	linenumber++;
    	        	System.out.println("line Data::"+data);
    	            }
    	 
    	            System.out.println("Total number of lines : " + linenumber);
    	 
    	            lnr.close();
    	            
    	        
    		     
    		}else{
    			 System.out.println("File does not exists!");
    		}
    		
    	}catch(IOException e){
    		e.printStackTrace();
    	}
	
    }


}
