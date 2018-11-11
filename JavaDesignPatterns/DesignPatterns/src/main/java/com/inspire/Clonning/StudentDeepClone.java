package com.inspire.Clonning;

public class StudentDeepClone {

    private String studentName=null;
    private int age=0;
    private Course course=null;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Object clone() throws CloneNotSupportedException {
        StudentDeepClone student= (StudentDeepClone) super.clone();
        student.setCourse(new Course("Physicss "));
        return student;
    }
}
