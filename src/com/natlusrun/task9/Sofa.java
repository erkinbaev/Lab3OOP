package com.natlusrun.task9;

public class Sofa extends Furniture {
    private String color;

    public Sofa(String type, String furnitureColor) {
        super(type);
        color = furnitureColor;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return getType() + " "  + getColor();
    }
}
