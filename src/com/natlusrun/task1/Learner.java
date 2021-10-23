package com.natlusrun.task1;

public class Learner {
    String learnerName;
    String learnerStatus;

    public void setName(String name){
        learnerName = name;
    }

    public void setLearnerStatus(String status){
        learnerStatus = status;
    }

    public String getLearnerName(){
        return learnerName;
    }

    public String getLearnerStatus(){
        return learnerStatus;
    }

    public Learner(String name, String status){
        learnerName = name;
        learnerStatus = status;
    }

}
