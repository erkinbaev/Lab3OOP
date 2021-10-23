package com.natlusrun.task9;

public class Cupboard extends Furniture {
    private String color;

    public Cupboard(String type, String competitionName) {
        super(type);
        color = competitionName;
    }

    public void setColor(String furnColor){
        color = furnColor;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return getType() + " " + getColor();
    }
}
