package com.natlusrun.task8;

public class Personal extends Competition {
    private String name;

    public Personal(String type, String competitionName) {
        super(type);
        name = competitionName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType() + " "  + getName();
    }
}
