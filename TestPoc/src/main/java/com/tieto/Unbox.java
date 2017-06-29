package com.tieto;

class Shape {
    public Shape makeCopy() {
        // code to make a copy of this Shape
        return this;
    }
}

class Circle extends Shape {
    @Override
    public Circle makeCopy() {
        // code to make a copy of a Circle
        return this;
    }
}

public class Unbox {
    public static void main(String[] args) {
        Shape s = new Circle();
       // Circle c = s.makeCopy();
    }
}
