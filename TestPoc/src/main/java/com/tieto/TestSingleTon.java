package com.tieto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;





public class TestSingleTon {

	public static void main(String[] args) throws CloneNotSupportedException {

		//getting SingleTon instance
				SingleTon instanceOne = SingleTon.getInstance();
				instanceOne.setValue(10);
				
				try {
		            // Serialize to a file
					ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.txt"));
		            out.writeObject(instanceOne);
		            out.close();
		 
		            instanceOne.setValue(20);
		            
		            // Serialize to a file
		            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.txt"));
		            SingleTon instanceTwo = (SingleTon) in.readObject();
		            in.close();
		 
		            System.out.println("Instance One Value= " + instanceOne.getValue());
		            System.out.println("Instance Two Value= " + instanceTwo.getValue());
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        }
	}

}
