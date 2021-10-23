package com.natlusrun.task10;

public class Weapon {
    String type;

    public void setType(String name){
        type = name;
    }

    public String getType(){
        return type;
    }

    public Weapon(String airCraftType){
        type = airCraftType;
    }

}
