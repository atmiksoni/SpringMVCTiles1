package com.test;

import java.io.*;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class SerializationDeseriazationExample implements Serializable {
    String name;
    static String contact;
    int rid;

    SerializationDeseriazationExample(String name, String contact, int rid){
        this.name = name;
        this.contact = contact ;
        this.rid = rid ;
        System.out.println("In parameter constructor");
    }

    SerializationDeseriazationExample(){
        System.out.println("In Default Constructor");
    }

    public void serializeObject(String name, String contact, int rid) throws IOException {
        SerializationDeseriazationExample serializationDeseriazationExample =new SerializationDeseriazationExample
                (name,contact,rid);
        FileOutputStream fileOutputStream = new FileOutputStream("serialize.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializationDeseriazationExample);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public SerializationDeseriazationExample deSerializeObject() throws IOException, ClassNotFoundException {
        //SerializationDeseriazationExample serializationDeseriazationExample =new SerializationDeseriazationExample("Atmik","12344",10);
        FileInputStream fileInputStream = new FileInputStream("serialize.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializationDeseriazationExample serializationDeseriazationExample =  (SerializationDeseriazationExample) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return serializationDeseriazationExample;
    }



}
