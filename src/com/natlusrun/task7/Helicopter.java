package com.natlusrun.task7;

public class Helicopter extends AirCraft {
    private String name;

    public Helicopter(String type, String helicopterName) {
        super(type);
        name = helicopterName;
    }

    public void setName(String helicName){
        name = helicName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType() + " " + getName();
    }
}
