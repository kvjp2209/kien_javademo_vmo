package com.company.java_collection.map;

import com.company.java_collection.Student;

import java.util.TreeSet;

public class TreeMap {
    //Chỉ chứa các phần tử duy nhất giống như HashSet.
    //Thời gian truy xuất nhanh.
    //Duy trì thứ tự tăng dần.
    public static void main(String[] args) {
        // init treeSet
        TreeSet<Student> treeSet = new TreeSet<Student>();
        // create students object
        Student student1 = new Student(1, "Vinh", 19, "Hanoi");
        Student student2 = new Student(2, "Hoa", 19, "Hanoi");
        Student student3 = new Student(3, "Phu", 20, "Hanoi");
        Student student4 = new Student(4, "Quy", 22, "Hanoi");
        // add students object to treeSet
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student2);
        // show treeSet
        for (Student student : treeSet) {
            System.out.println(student.toString());
        }
    }
}
