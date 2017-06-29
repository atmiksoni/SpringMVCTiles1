package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class JavaCollectionExamplesTest {

    JavaCollectionExamples javaCollectionExamples = new JavaCollectionExamples();

    @org.junit.Test
    public void testHashSet() throws Exception {

    }

    @Test
    public void testHashMap() throws Exception {

        javaCollectionExamples.testHashMap();

    }

    @Test
    public void testIterateHashMapInDifferentWay(){
        javaCollectionExamples.iterateHashMapInDifferentWay();
    }

}