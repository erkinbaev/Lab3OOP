package com.natlusrun.task1;

import com.natlusrun.shablon.Auto;

import java.util.ArrayList;

public class Conference {
    private ArrayList<Learner> learner = new ArrayList<Learner>();

    public void addLearner(Learner l){
        learner.add(l);
    }

    public void printConference(){
        int numOfStudents = 0;
        int numOfSchoolChild = 0;
        System.out.println("На конференции: ");
        for (Learner l:learner){
            if(l instanceof Student) {
                numOfStudents = numOfStudents + 1;
                System.out.println("\t" + l.toString());

            } else if(l instanceof SchoolChild){
                numOfSchoolChild = numOfSchoolChild + 1;
                System.out.println("\t" + l.toString());
            }
        }
      System.out.println(numOfStudents + " студентов и " + numOfSchoolChild + " школьников");
    }
}
