package com.brain.thread;
import java.util.*;

/**
 * Created by soniiatm on 6/7/2017.
 */
public class Folders {

    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {

        Collection<String> list =  new ArrayList<>();
        Collection<String> mainlist =  new ArrayList<>();

        String[] foldernames = xml.split("<folder name=");

        for(String s: foldernames){

            list.add(s.substring(0,s.indexOf(">")));
        }
        System.out.println("list:"+list.toString());

        for(String str: list){
            if(str.charAt(1) == startingLetter){
               // mainlist.add(str.substring(1,str.length()-3));
               str= str.replaceAll(" /", "");
                mainlist.add(str.substring(1,str.length()-1));
            }
        }
        System.out.println("mainlist:"+mainlist.toString());
        return  mainlist;
    }



    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
