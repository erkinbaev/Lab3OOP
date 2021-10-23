package com.natlusrun.task1;

public class SchoolChild extends Learner{
    private int numberOfClass;

    public SchoolChild(String name, String status, int number) {
        super(name, status);
        numberOfClass = number;
    }

    public void setNumberOfClass(int number){
        numberOfClass = number;
    }

    public int getNumberOfClass(){
        return numberOfClass;
    }

    public String toString(){
        return getLearnerName()+ " " + getLearnerStatus() + " " + numberOfClass;
    }
}
