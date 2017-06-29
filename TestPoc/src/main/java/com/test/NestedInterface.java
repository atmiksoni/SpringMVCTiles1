package com.test;

/**
 * Created by soniiatm on 5/18/2017.
 */

interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
class NestedInterface implements Showable.Message{
    public void msg(){
        System.out.println(
                "Hello nested interface");}

    public static void main(String args[]){
        Showable.Message message=new NestedInterface();//upcasting here
        message.msg();
    }
}