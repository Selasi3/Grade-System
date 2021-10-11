package com.company;

public class BagOfLectures {
    public void addLecture(Lecture lecture){
        Lecture.allLectures.add(lecture);
    }

    public void removeStudent(Lecture lecture){
        Lecture.allLectures.remove(lecture);
    }

    public void clearLectures(){
        Lecture.allLectures.clear();
    }
}
