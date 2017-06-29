package com.test;

/**
 * Created by soniiatm on 5/24/2017.
 */
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Id::"+Thread.currentThread().getId()
                +":: Name:: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();


    }
}
