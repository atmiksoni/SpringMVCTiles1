package com.test;

import java.util.Comparator;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class Animal implements Comparable<Animal> {

    private String name;
    private int noOfLegs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.getName());

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", noOfLegs=" + noOfLegs +
                '}';
    }
}
