package com.natlusrun.task1;

public class testConference {

    public static void main(String[] args) {
        Student student1 = new Student("Nursultan", "student", "engineer", 5);
        Conference conference = new Conference();
        conference.addLearner(student1);
        Student student2 = new Student("Meder", "status", "teacher", 4);
        conference.addLearner(student2);
        SchoolChild schoolChild = new SchoolChild("Sagynaly", "schoolboy", 3);
        conference.addLearner(schoolChild);
        conference.printConference();
    }
}
