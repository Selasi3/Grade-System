package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel {

    private List<Double> grades =new ArrayList<>(); // list to store grades
    private float averageGrades;
    private String name;
    private Levels level;
    public static List<Student> allStudents = new ArrayList<Student>();

    public Student(List<Double> grades1, String name) {
        this.grades=grades1;
        this.name =name;
        allStudents.add(this);
    }

//    public Student(List<Double> grades, String student1) {
//    }


    public void setName(String name){
        this.name = name;
    }

    public Student(List<Double> grades) {

            this.grades = grades;
        allStudents.add(this);


    }

    public Student(List<Double> grades, String studentName, Levels studentLevel) {

        this.grades = grades;
        this.name = studentName;
        this.level = studentLevel;
        allStudents.add(this);


    }


    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", averageGrades=" + averageGrades +
                '}';
    }

//function to get average grades
    public double getAverageGrades() {
        int size = grades.size();
        float totalGrades = 0;
        for(Double number: grades){
            totalGrades+=number;
    }
        averageGrades =totalGrades/size;
        return averageGrades;




//
//    public double getAverageGrades(List <Double> grades){
//        int length = grades.size();
//        float totalGrades=0;
//
//
//        for (Double number:grades) {
//            totalGrades+=number;
//
//
//        }
//        double averageGrade = totalGrades / length;
//        return averageGrade;
//        for (int index= 0; index<grades.size(); index++){
//            int length = grades.size();
//
//
//        }

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Levels getLevel() {
        return level;
    }
}
