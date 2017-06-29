package com.poc;

/**
 * Created by soniiatm on 6/3/2017.
 */
public class TestTrafficSignal {

    public static void main(String[] args) {

        TrafficSignal signal = TrafficSignal.valueOf("RED");
        System.out.println("name : " + signal.name() + " action : " + signal.getAction());

        //Another Enum valueOf exampel
        signal = TrafficSignal.valueOf("GREEN");
        System.out.println("name : " + signal.name() + " action : " + signal.getAction());





    }

    private static void PrintTrafficSignal(TrafficSignal signal) {
        switch (signal){

            case GREEN:
                System.out.println("GO");
                break;
            case ORANGE:
                System.out.println("Run slowly");
                break;
            case RED:
                System.out.println("Stop");
                break;
            default:
                System.out.println("Illegal Argument ");

        }
    }
}
