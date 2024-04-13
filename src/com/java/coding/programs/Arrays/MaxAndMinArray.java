package com.java.coding.programs.Arrays;


import java.util.Arrays;
import java.util.OptionalInt;


public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 81, 9, 10};

        // max

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("Get max number in given list is : "+max.getAsInt());

        // min

        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("min number number in given list is : "+min.getAsInt());


    }
}
