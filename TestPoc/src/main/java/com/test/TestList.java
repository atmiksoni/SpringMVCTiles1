package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class TestList {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Dog");
        animal.setNoOfLegs(4);
        Animal animal1 = new Animal();
        animal1.setName("ASs");
        animal1.setNoOfLegs(4);
        Animal animal2 = new Animal();
        animal2.setName("Bird");
        animal2.setNoOfLegs(2);
        Animal animal4 = new Animal();
        animal4.setName("Snake");
        animal4.setNoOfLegs(0);
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(animal);
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal4);
        Collections.sort(animalList);

        for(Animal anm:animalList){
                System.out.println(anm.toString());
        }

        Collections.sort(animalList, new AnimalComparator());
        for(Animal anm:animalList){
            System.out.println("By No Of Legs:: "+anm.toString());
        }
    }
}
