package com.inspire.Serialization;

import java.io.*;

public class Demo {

    public static void main(String[] args){
        Student s1=new Student();
        s1.setAge(20);
        s1.setName("Virat");
        s1.setSteam("Science");
        try {
            FileOutputStream fout=new FileOutputStream("student.ser");
            ObjectOutputStream stream=new ObjectOutputStream(fout);
            stream.writeObject(s1);
            stream.close();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialize
        try {
            FileInputStream fin=new FileInputStream("student.ser");
            ObjectInputStream inStream=new ObjectInputStream(fin);
            Student s2=(Student)inStream.readObject();
            System.out.println(s2.getAge());
            System.out.println(s2.getName());
            System.out.println(s2.getSteam());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
