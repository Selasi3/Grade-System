package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCases {
    //function to test get Average Grades()
    @Test
    public void testGetAverageGrades(){
        List<Double> student1List = new ArrayList<>();


        student1List.add(15.0);
        student1List.add(25.00);
        student1List.add(20.0);

        Student student1 = new Student(student1List);
        double actualValue = 20;
        double predictedValue = student1.getAverageGrades();

        boolean value = (actualValue == predictedValue);
        assertTrue(value);

    }
@Test
    public void testRegister()
    {
//        List<Nameable> studentNames = new ArrayList<Nameable>(); refactoring
        List<Student> studentNames = new ArrayList<Student>();

        List<Double> grades = new ArrayList<Double>();
        grades.add(54.5);
        grades.add(34.4);
        grades.add(45.0);

        Student student1  = new Student(grades,"student1");

        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(84.5);
        grades1.add(84.4);
        grades1.add(43.0);

        Student student2  = new Student(grades1,"student2");

        studentNames.add(student1);
        studentNames.add(student2);


        Register register = new Register(studentNames);

        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("student1");
        expectedValues.add("student2");
        assertEquals(expectedValues, register.getRegister());
        System.out.println("Student1 average Grades: "+student1.getAverageGrades());
        System.out.println("Student2 average Grades: "+student2.getAverageGrades());

        System.out.println("Comparator::"+ register.sort(new StudentComparator()));

    }



//    @Test
//    public void naughtyStudentInsertionTest(){
//        List<Double> stdStudent = Arrays.asList(45.0,43.0,66.0);
//        List<Double> nautStudent = Arrays.asList(45.0,43.0,66.0);
//        Student std11 = new Student(stu);
//
//    }
//
//    public void testRegister(){
//        List<Nameable> studentNames = new ArrayList<>();
//        studentNames.
//
//
//    }







}
