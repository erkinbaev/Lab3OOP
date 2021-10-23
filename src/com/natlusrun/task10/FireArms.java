package com.natlusrun.task10;

public class FireArms extends Weapon {
    private String name;

    public FireArms(String type, String armName) {
        super(type);
        name = armName;
    }

    public void setName(String armName){
        name = armName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType() + " " + getName();
    }
}
