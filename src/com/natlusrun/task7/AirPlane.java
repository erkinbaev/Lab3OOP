package com.natlusrun.task7;

public class AirPlane extends AirCraft {
    private String name;

    public AirPlane(String type, String airPlaneName) {
        super(type);
        name = airPlaneName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType()+ " "  + getName();
    }
}
