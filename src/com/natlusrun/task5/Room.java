package com.natlusrun.task5;

public class Room extends Premises {
    private int number;

    public Room(String type, int square, int premiseNumber) {
        super(type, square);
        number = premiseNumber;
    }

    public int getNumber(){
        return number;
    }

    public String toString(){
        return getType()+ " " + getArea() + " " + getNumber();
    }
}
