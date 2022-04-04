package com.company.java_oop;

public class Student extends Person {
    private String className;
    private int mark;

    public Student() {
    }

    public Student(int id, String name, int age, String className, int mark) {
        super(id, name, age);
        this.className = className;
        this.mark = mark;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "className='" + className + '\'' +
                ", mark=" + mark +
                '}';
    }
}
