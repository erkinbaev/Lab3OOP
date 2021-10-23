package com.natlusrun.task5;

public class Office extends Premises {
    private int number;

    public Office(String type, int square, int premiseNumber) {
        super(type, square);
        number = premiseNumber;
    }

    public String toString(){
        return getType()+ " " + getArea() + " " + number;
    }
}
