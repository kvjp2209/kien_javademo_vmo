package com.company.java_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //Các điểm quan trọng về lớp HashSet trong java là:
        //
        //HashSet chỉ chứa các phần tử duy nhất.
        //HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm (hash table).
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: ");
        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
