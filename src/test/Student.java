package test;

public class Student extends Person{
    private String schoolName;

    public Student(String name, int age, double height, String schoolName) {
        super(name, age, height);
        this.schoolName = schoolName;
    }
}