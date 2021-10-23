package com.natlusrun.shablon;

public class test {

    public static void main(String[] args) {
        Auto myAuto1=new Auto("Ford",180, "B1111AH");
        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed() + " " + myAuto1.getStateNumber());
    }
}
