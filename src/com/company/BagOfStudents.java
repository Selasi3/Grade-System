package com.company;

public class BagOfStudents {

    public void addStudent(Student student){
        Student.allStudents.add(student);
    }

    public void removeStudent(Student student){
        Student.allStudents.remove(student);
    }

    public void clearStudents(){
        Student.allStudents.clear();
    }

}
