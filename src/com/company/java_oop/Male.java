package com.company.java_oop;

public abstract class Male implements Doing {
    //Data abstraction is the process of hiding certain details and showing only essential information to the user.
    //Abstraction can be achieved with either abstract classes or interfaces
    @Override
    public void study() {
        System.out.println("Math!!!");
    }

    @Override
    public void sport() {
        System.out.println("football!!!");
    }

    public abstract void gym();
}
