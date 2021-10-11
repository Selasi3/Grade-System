package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    public static List<Lecture> allLectures = new ArrayList<Lecture>();

    List<Student> studentRecords = new ArrayList<>(); //list to store students
    List<Double> studentsAverages = new ArrayList<>(); //List to store students Averages

//function to get studentRecords
    public List<Student> getStudentRecords() {
        return studentRecords;
    }
    //function to store studentRecords
    public void setStudentRecords(List<Student> studentRecords) {
        this.studentRecords = studentRecords;
    }

//function to store a new student details
    public void enter(Student student){
        studentRecords.add(student);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "studentRecords=" + studentRecords +
                '}';
    }
//function to get highest average Grade
    public double getHighestAverageGrade(){
        for (Student student:studentRecords) {
            studentsAverages.add(student.getAverageGrades());

        }
       // System.out.println("Highest Average: " +Collections.max(studentsAverages));
        double highestAverage = Collections.max(studentsAverages);
            return highestAverage;





    }
}
