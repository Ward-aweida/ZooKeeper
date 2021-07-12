package com.example.zookeeper;

public class Bat {
    int energyLevel = 30;


    public int fly(){
        return  energyLevel-=50;
    }
    public int eatHumans(){
        return energyLevel+=25;
    }
    public int attackTown(){
        return energyLevel-=100;
    }
    public String toString(){
        return  ("The final energy is : " + energyLevel);
    }
}
