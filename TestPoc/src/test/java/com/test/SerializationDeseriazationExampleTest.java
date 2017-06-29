package com.test;

import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class SerializationDeseriazationExampleTest {

    @Test
    public  void testSerializeDeserialize() throws IOException, ClassNotFoundException {
        SerializationDeseriazationExample serializationDeseriazationExample = new SerializationDeseriazationExample();
        serializationDeseriazationExample.serializeObject("atmik","1234",10);
        SerializationDeseriazationExample serializationDeseriazationExample1 =
                serializationDeseriazationExample.deSerializeObject();
        Assert.assertEquals(serializationDeseriazationExample1.name ,"atmik");
        Assert.assertTrue(serializationDeseriazationExample1.rid == 10);
        Assert.assertNull(serializationDeseriazationExample1.contact);

    }




}