package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class TestReadFile {

    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader =null;
        List<String> arrayList = new ArrayList<String>();
        try  {
            fileReader= new FileReader("TestRead.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                System.out.println("Content::"+line);
                String[] tempArray = line.split("\\s+");
                for (int i = 0; i < tempArray.length; i++) {
                    arrayList.add(tempArray[i]);
                }

            }

          int noOfTimesRepeated=  Collections.frequency(arrayList,"atmik");
            System.out.println("No Of time atmik, repeated::"+noOfTimesRepeated);


        }
        catch (Exception e){
            System.err.print("Error occure while "+e.getMessage());
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
