package com.company.java_generics;

public class Generic {
    public static void main(String[] args) {
        Animal a = new Animal("dog");
        Pair<Animal, String> seat1 = new Pair<>(a, "seat1");
        System.out.println(seat1);
    }
}
