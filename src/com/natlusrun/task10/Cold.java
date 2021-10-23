package com.natlusrun.task10;

public class Cold extends Weapon {
    private String name;

    public Cold(String type, String armName) {
        super(type);
        name = armName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getType() + " "  + getName();
    }
}
