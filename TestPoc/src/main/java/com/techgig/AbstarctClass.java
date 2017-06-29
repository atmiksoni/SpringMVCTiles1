package com.techgig;

/**
 * Created by soniiatm on 6/4/2017.
 */
/**
 * Example 27 - Abstract Classes, Subclasses, and Overriding
 */
class AbstractClass {





    public static void main(String[] args) {
        Vessel vessel  = new WaterTank(10,10,10);
        vessel.contents =200;
        vessel.fill(400);
        double remainingCapacity = vessel.remainingCapacity();
        System.out.println("Remaining Capacity in water Tank ::"+remainingCapacity);

        Vessel vessel1  = new Cube(10);
        vessel1.contents =200;
        vessel1.fill(200);
        double remainingCapacity1 = vessel1.remainingCapacity();
        System.out.println("Remaining Capacity in Cube::"+remainingCapacity1);

        Vessel vessel2  = new Barrel(5,10);
        vessel2.contents =200;
        vessel2.fill(200);
        double remainingCapacity2 = vessel2.remainingCapacity();
        System.out.println("Remaining Capacity in Barrel ::"+remainingCapacity2);


    }
}

abstract class Vessel {

    double contents;
    abstract double capacity();

    void fill(double amount) {
        contents = Math.min((contents + amount), capacity());
        System.out.println("Content::"+contents);
    }

    double remainingCapacity(){
        return capacity() - contents;
    }
}

class WaterTank extends Vessel {

    double length, width, height;

    WaterTank(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double capacity() {
        return length * width * height;
    }

    public String toString() {
        return "tank (" + length + ", " + width + ", " + height + ")";
    }
}

class Cube extends WaterTank {

    Cube(double side) {
        super(side, side, side);
    }

    public String toString() {
        return "cube (" + length + ")";
    }
}

class Barrel extends Vessel {
    double radius, height;

    Barrel(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double capacity() {
        return height * Math.PI * radius * radius;
    }

    public String toString() {
        return "barrel (" + radius + ", " + height + ")";
    }
}



