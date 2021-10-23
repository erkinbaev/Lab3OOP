package com.natlusrun.task5;

public class Premises {
    String type;
    int area;

    public void setArea(int number){
        area = number;
    }

    public void setType(String premiseType){
        type = premiseType;
    }

    public int getArea(){
        return area;
    }

    public String getType(){
        return type;
    }

    public Premises(String premiseType, int number){
        type = premiseType;
        area = number;
    }

}
