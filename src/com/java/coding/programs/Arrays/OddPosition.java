// Program to print the elements of an array present on even position


package com.java.coding.programs.Arrays;

public class OddPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("OddPosition");

        for (int i = 0; i < arr.length; i=i+2)

        // when we will check for odd positions then we put i = 0 and
            //     when we check for even positions then i=1 in for loop

        {
            System.out.println(arr[i]);
        }

    }
}
