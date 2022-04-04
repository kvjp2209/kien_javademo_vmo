package com.company.java_collection.map;

import com.company.java_collection.Student;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    //LinkedHashMaplưu trữ dữ liệu dưới dạng cặp key và value.
    //Nó chứa các key duy nhất.
    //Nó có thể có 1 key là null và nhiều giá trị null.
    //Nó duy trì các phần tử theo thứ tự chèn.
    public static void main(String args[]) {
        // init linkedHashMap
        LinkedHashMap<String, Student> linkedHashMap
                = new LinkedHashMap<String, Student>();
        // add elements to linkedHashMap
        linkedHashMap.put("1", new Student(1, "Vinh", 19, "Hanoi"));
        linkedHashMap.put(null, new Student(2, "Hoa", 19, "Hanoi"));
        linkedHashMap.put("2", null);
        linkedHashMap.put("4", new Student(4, "Quy", 22, "Hanoi"));
        // show linkedHashMap
        show(linkedHashMap);
    }
    public static void show(LinkedHashMap<String, Student> linkedHashMap) {
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
