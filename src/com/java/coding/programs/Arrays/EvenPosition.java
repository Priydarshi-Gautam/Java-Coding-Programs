// Program to print the elements of an array present on even position

package com.java.coding.programs.Arrays;

public class EvenPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Using way 2 print even position arrays");

        for (int i = 1; i < arr.length;i=i+2)
        {
            System.out.println(arr[i]);
        }


    }
}
