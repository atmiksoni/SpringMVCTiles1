package com.test;

import java.lang.reflect.Method;

/**
 * Created by soniiatm on 5/26/2017.
 */
public class TestAnnotation {

    @MyAnnotation
    public void display(){
        System.out.println("Annotaion is called");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        new TestAnnotation().display();
        TestAnnotation h=new TestAnnotation();
        Method m=h.getClass().getMethod("display");
        MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: "+manno.value());
    }
}
