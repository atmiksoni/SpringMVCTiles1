package com.poc;

/**
 * Created by soniiatm on 6/3/2017.
 */
public  enum TrafficSignal {

    RED("stop"),GREEN("Go"),ORANGE("run slowly");


    private String action;

    public String getAction() {
        return action;
    }

    private TrafficSignal(String action){
        this.action = action;
    }
}
