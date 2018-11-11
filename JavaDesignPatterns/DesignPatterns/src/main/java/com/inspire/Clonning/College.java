package com.inspire.Clonning;

public class College {

    public static void main (String[] args){
        //Shallo copy Example
        Student s1=new Student();
        s1.setStudentName("Ajay");
        s1.setCourse(new Course("Physic, Chemistry, Biology"));
        s1.setAge(23);
        try {
            Student s2=(Student) s1.clone();
            System.out.println(s1.getCourse());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
