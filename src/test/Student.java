package test;

import java.util.List;

public class Student extends Person{
    private String schoolName;
    private List<Integer> grades;

    public Student(String name, int age, double height, String schoolName) {
        super(name, age, height);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}