package com.test;

/**
 * Created by soniiatm on 6/1/2017.
 */
public abstract class Shape {

protected int x ,y;


    public  Shape(int x, int y){
        this.x =x;
        this.y =y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
