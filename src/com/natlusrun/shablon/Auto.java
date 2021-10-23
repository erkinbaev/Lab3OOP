package com.natlusrun.shablon;

public class Auto {
    private String firm;
    private int maxSpeed;
    private String stateNumber;

    public void setFirm(String firma) {
        firm = firma;
    }

    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }

    public void setStateNumber(String number) {
        stateNumber = number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFirm() {
        return firm;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public Auto() {
        firm = "Без названия";
        maxSpeed = 0;
        stateNumber = "Без номера";
    }

    public Auto(String firma, int speed, String number) {
        firm = firma;
        maxSpeed = speed;
        stateNumber = number;
    }
}
