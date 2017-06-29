package com.amdocs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by soniiatm on 6/7/2017.
 */
public class LogParser {


        public static Collection<Integer> getIdsByMessage(String xml, String message) throws Exception {
            Collection<String> list = new ArrayList<String>();

            ArrayList<Integer>  listIn = new ArrayList<Integer>();
            String [] temp = xml.split("<message>");
            for (int i = 1; i < temp.length; i++) {
                String str = temp[i];
                String temp1 = str.substring(0,str.indexOf("</message>"));
                System.out.println();
                list.add(temp1);
               // listIn.add(new Integer(i));
            }
            System.out.println("main list:"+list.toString());


            Iterator<String> iterator = list.iterator();
            int count  =0;
            while (iterator.hasNext()) {

               String temp1 = iterator.next();
                count ++;
               if(message.equals(temp1)){
                   listIn.add(count);
               }
                System.out.println("listIn:"+listIn.toString());
            }

            if(listIn .isEmpty()){
                throw new Exception("No element found");
            }

            return listIn;


        }

        public static void main(String[] args) throws Exception {
            String xml =
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                            "<log>\n" +
                            "    <entry id=\"1\">\n" +
                            "        <message>Application started</message>\n" +
                            "    </entry>\n" +
                            "    <entry id=\"2\">\n" +
                            "        <message>Application ended</message>\n" +
                            "    </entry>\n" +
                            "</log>";

            Collection<Integer> ids = getIdsByMessage(xml, "Application ended");
            for(int id: ids)
                System.out.println(id);
        }
    }

