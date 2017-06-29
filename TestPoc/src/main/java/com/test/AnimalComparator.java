package com.test;

import java.util.Comparator;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNoOfLegs()-o2.getNoOfLegs();
    }
}
