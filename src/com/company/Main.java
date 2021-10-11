package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> student1List = new ArrayList<>();


        student1List.add(26.0);
        student1List.add(60.00);
        student1List.add(58.0);

        Student student1 = new Student(student1List) ;


        List<Double> student2List = new ArrayList<>();


        student2List.add(16.0);
        student2List.add(0.00);
        student2List.add(80.0);

        Student student2 = new Student(student2List) ;






        System.out.println("Student1 average Grades: "+student1.getAverageGrades());
        System.out.println("Student2 average Grades: "+student2.getAverageGrades());




        Lecture lecture = new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);

        System.out.println(lecture.getStudentRecords());
        System.out.println(lecture.getHighestAverageGrade());

       ////////////////////////////// ////////////////////////////////////////////////////////////////////////////////////

Bag<Student> studentBag = new Bag<>();
Bag<Lecture> lectureBag = new Bag<>();

studentBag.add(student1);
studentBag.add(student2);
studentBag.add(student1);

lectureBag.add(lecture);
        System.out.println("Student Bag:" + studentBag);
        System.out.println("Lecture Bag: "+ lectureBag);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// write your code here
    }
}
