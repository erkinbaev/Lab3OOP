package com.natlusrun.task1;

public class Student extends Learner{
    private String courseDirection;
    private int numberOfCourse;

    public Student(String name, String status, String direction, int number) {
        super(name, status);
        courseDirection = direction;
        numberOfCourse = number;
    }

    public void setCourseDirection(String direction){
        courseDirection = direction;
    }

    public void setNumberOfCourse(int number){
        numberOfCourse = number;
    }

    public String getCourseDirection(){
        return courseDirection;
    }

    public int getNumberOfCourse(){
        return numberOfCourse;
    }
    public String toString(){
        return getLearnerName()+ " " + getLearnerStatus() + " " + courseDirection + " " + numberOfCourse;
    }
}
