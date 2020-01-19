package com.company.generics;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test
 * your knowledge on Java Generic methods. Let's say you have an integer array and a string array.
 * You have to write a single method printArray that can print all the elements of both arrays.
 * The method should be able to accept both integer arrays or string arrays.
 * */

// Generic method in a non generic class

class Printer {
    <T> void  print(T[] array)  {
        for (T t : array) {
            System.out.println(t);
        }
    }
};

public class PrintArrays {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        Printer myPrinter = new Printer();
        myPrinter.print(intArray);
        myPrinter.print(stringArray);

    }
}
