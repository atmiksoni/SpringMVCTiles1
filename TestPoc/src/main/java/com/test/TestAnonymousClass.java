package com.test;

/**
 * Created by soniiatm on 5/18/2017.
 */

interface  Person{
    public abstract void eat();
}
public class TestAnonymousClass {

   public void anonymousMethod(){
        Person p= new Person() {
            public void eat() {
                System.out.println("Inside anonymous methd");
            }
        };
        p.eat();
    }
}