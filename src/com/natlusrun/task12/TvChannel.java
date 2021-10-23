package com.natlusrun.task12;

public class TvChannel extends MassMedia {
    private String name;

    public TvChannel(String type, String massName) {
        super(type);
        name = massName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType()+ " "  + getName();
    }

}
