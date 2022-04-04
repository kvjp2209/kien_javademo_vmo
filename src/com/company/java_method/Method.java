package com.company.java_method;

public class Method {
    //Just use in this class
    private void privateMethod() {
        System.out.println("private method");
    }

    //Classes in the package
    protected void protectedMethod() {
        System.out.println("protected method");
    }

    //All package
    public void publicMethod() {
        System.out.println("public method");

    }

    public static void staticMethod(){
        System.out.println("static method!!!");
    }

    public static void main(String[] args) {
        Method method = new Method();
        method.publicMethod();
        Method.staticMethod();
    }
}
