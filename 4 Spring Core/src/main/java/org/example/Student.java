package org.example;

public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public void getAttendance(){

    }
    public void print(){

    }

    static void main() {
        Student s1 = new Student();
        Class<Student> c1 = Student.class;
//        here c1 is not the object of the Student it is the reference variable of the Class
    }
}
