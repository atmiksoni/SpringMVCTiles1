package com.test;

/**
 * Created by soniiatm on 5/18/2017.
 */
public class ConcreteClass extends  BaseClass {

    {
        System.out.println("Initize methos of Concrete class");
    }

    static {
        System.out.println("static methos of Concrete class");
    }

    public ConcreteClass() {
        System.out.println("inside ConcreteClass");
    }
}

 class BaseClass {
     {
         System.out.println("Initize methos of BaseClass class");
     }

     static {
         System.out.println("static methos of BaseClass class");
     }

    public BaseClass() {
        System.out.println("inside Baseclass");
    }
}
