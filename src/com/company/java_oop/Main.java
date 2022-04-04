package com.company.java_oop;

public class Main {


    public static void main(String[] args) {
        Person student = new Student(1, "kien", 18, "1505", 10);
        System.out.println(student);
        Boy boy = new Boy();
        boy.sport();
        boy.gym();
        boy.study();
    }
}
