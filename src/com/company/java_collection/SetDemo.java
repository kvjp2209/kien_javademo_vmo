package com.company.java_collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public Set<Integer> setDemo(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);//khong in ra do bi trung lap gia tri
        set.add(3);
        System.out.println("Set: " + set);
        return set;
    }
}
