package com.company.java_collection;

import com.company.java_collection.Student;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    //Những điểm quan trọng về lớp LinkedHashSet trong java là:
    //
    //Chỉ chứa các phần tử duy nhất giống như HashSet.
    //Cho phép các phần tử null.
    //Duy trì thứ tự chèn.

    /**
     * LinkedHashSetExample2 class
     *
     * @author viettuts.vn
     */

    public static void main(String[] args) {
        // init set
        LinkedHashSet<Student> set = new LinkedHashSet<Student>();
        // create students object
        Student student1 = new Student(1, "Vinh", 19, "Hanoi");
        Student student2 = new Student(2, "Hoa", 19, "Hanoi");
        Student student3 = new Student(3, "Phu", 20, "Hanoi");
        Student student4 = new Student(4, "Quy", 22, "Hanoi");

        // add students object to set
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student1);
        // show set
        Iterator<Student> iterator = set.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = iterator.next();
            System.out.println(student.toString());
        }

    }
}
