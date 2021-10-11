package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class Register {
    List <String> stdNames = new ArrayList<>();
    //List<Nameable> studentNames = new ArrayList<>(); refactoring
    List<Student> studentNames = new ArrayList<>();



    @Override
    public String toString() {
        return "Register{" +
                "s=" + stdNames +
                ", studentNames=" + studentNames +
                '}';
    }

//    public Register(List<Nameable> names) {
//        studentNames=names;
//
//    } recfactoring

    public Register(List<Student> names) {
        studentNames=names;
   }




//
//    public  List<String> getRegisterByLevel(Levels level){
//
//       return  Student.allStudents.stream()
//                                   .filter(s->s.getLevel()==level)
//                                    .map(n->n.getName())
//                                    .collect(Collectors.toList());
//
//
//    } refacotring


    public  Map<Levels, List<Student>> getRegisterByLevel(Levels level){

        List<Student> students = new ArrayList<>();
              students =  Student.allStudents.stream().filter(s->s.getLevel()==level).collect(Collectors.toCollection(ArrayList::new));
            Map<Levels, List<Student>> mapStudents = new HashMap<>();
            mapStudents.put(level,students);
            return mapStudents;

    }



    public Map<Levels, List<Student>> printReport(){
        Map<Levels, List<Student>> mapppingLevels = Student.allStudents.stream().collect(Collectors.groupingBy(Student::getLevel));
        return mapppingLevels;


    }




    public List<String> getRegister(){
        for (Nameable students:studentNames) {
            stdNames.add(students.getName());



        }
        return stdNames;

    }

    public List<Student>  sort(Comparator<Student> studentComparator){

        Collections.sort(Student.allStudents,studentComparator);
        return Student.allStudents;
    }

    public Student studentbyName(String name) throws StudentNotFoundException{
        for (Student student: studentNames) {
            if(student.getName() ==name){
                return  student;
            }

        }
        throw new StudentNotFoundException(name + "not found");
    }
}
