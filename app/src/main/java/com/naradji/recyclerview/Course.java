package com.naradji.recyclerview;

import java.util.ArrayList;
import java.util.Random;

public class Course {
    String name;
    String teacherName;
    int lectures;

    public Course(String name, String teacherName, int lectures) {
        this.name = name;
        this.teacherName = teacherName;
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getLectures() {
        return lectures;
    }
    public static final String [] teachers = {"Tushar", "Rohit", "Arnav", "Harshit", "Saurav","Amardeep","Ashish"};
    public static final String [] courseNames = {"Android", "C++", "JAVA", "Python", "NodeJS", "WebDevelopment","MachineLearning"};

    public static ArrayList<Course> getNRandomCourses (int n){
        ArrayList<Course> courses = new ArrayList<>();
        Random r = new Random();
        for (int i=0;i<n;i++){
            Course course = new Course(teachers[r.nextInt(7)],courseNames[r.nextInt(7)],10+r.nextInt(10));
            courses.add(course);
        }
        return courses;
    }
}
