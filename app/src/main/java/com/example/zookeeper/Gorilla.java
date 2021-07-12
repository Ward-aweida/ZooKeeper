package com.example.zookeeper;

public class Gorilla extends Mammal{

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }


    public int throwSomething(){
        return energyLevel+=5;
    }
    public int eatBananas(){
        return energyLevel+=10;

    }
    public int climb(){
        return energyLevel-=10;
    }

    @Override
    public String toString() {
        return   "The final energy is : " + energyLevel ;
    }
}
