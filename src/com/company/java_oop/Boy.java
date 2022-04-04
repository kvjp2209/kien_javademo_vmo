package com.company.java_oop;

public class Boy extends Male implements Doing{
    @Override
    public void gym() {
        System.out.println("gym!!!");
    }

    @Override
    public void study(){
        System.out.println("Study!!!");
    }
}
