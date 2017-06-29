package com.test;

/**
 * Created by soniiatm on 5/22/2017.
 */
public class BasicEnum {
    private Fruits myFruit;

    public BasicEnum(Fruits fruit){
        this.myFruit = fruit;
    }

    public void getFruitDesc(){

        switch (myFruit) {
            case GRAPE:
                System.out.println("A grape is a non-climacteric fruit.");
                break;

            case ORANGE:
                System.out.println("The ORANGE is the pomaceous fruit.");
                break;

            case MANGO:
                System.out.println("The mango is a fleshy stone fruit.");
                break;

            case BANANA:
                System.out.println("BANANA are slow growing varieties of citrus.");
                break;

            default:
                System.out.println("No desc available.");
                break;
        }
    }

    public static void main(String a[]){
        BasicEnum grape = new BasicEnum(BasicEnum.Fruits.GRAPE);
        grape.getFruitDesc();
        BasicEnum apple = new BasicEnum(Fruits.MANGO);
        apple.getFruitDesc();
        BasicEnum lemon = new BasicEnum(Fruits.ORANGE);
        lemon.getFruitDesc();
        BasicEnum guava = new BasicEnum(Fruits.BANANA);
        guava.getFruitDesc();
    }
    enum Fruits {
        MANGO,GRAPE,ORANGE,BANANA;
    }

}

