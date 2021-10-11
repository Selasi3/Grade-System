package com.company;

import java.util.List;

public class NaughtyStudent extends Student{
    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }




//    public double getAverageGrade(List<Double>grades){
    public double falseAverageGrade(List<Double>grades){
    double naughtyStudentAvg = super.getAverageGrades();
        return naughtyStudentAvg*1.1;
    }


}


