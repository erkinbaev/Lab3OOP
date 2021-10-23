package com.natlusrun.task8;

public class Comand extends Competition {
    private String name;

    public Comand(String type, String competitionName) {
        super(type);
        name = competitionName;
    }

    public void setName(String compName){
        name = compName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType() + " " + getName();
    }
}
