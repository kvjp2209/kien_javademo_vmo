package com.company.java_basic;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Variable {

    public static void main(String[] args) {
        //Variables are containers for storing data values.
        //In Java, there are different types of variables, for example:
        //
        //String - stores text, such as "Hello". String values are surrounded by double quotes
        //int - stores integers (whole numbers), without decimals, such as 123 or -123
        //float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        //char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        //boolean - stores values with two states: true or false

        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

        int myNum = 12;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("input case: ");
            int n = Integer.parseInt(in.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Integer: " + myNum);
                    System.out.println("Float = " + myFloatNum);
                    System.out.println("Char = " + myLetter);
                    System.out.println("Boolean = " + myBool);
                    System.out.println("String = " + myText);
                    break;
                case 2:
                    int a = cars.length - 1;
                    while (a != -1) {
                        System.out.println("car name at index " + a + " is " + cars[a]);
                        a--;
                    }
                    break;
                default:
                    return;
            }
        }
    }

}
