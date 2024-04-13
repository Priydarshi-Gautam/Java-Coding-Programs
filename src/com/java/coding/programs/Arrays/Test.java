package com.java.coding.programs.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array");
        int[] arr2= new int[arr1.length];
        int [] arr3 ;

        for (int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
            System.out.println(arr1[i]);
        }


        System.out.println();
        System.out.println("Copied Array");

        for (int i=0;i<arr2.length;i++)
        {

           // System.out.println(arr2[i]+" ");

            System.out.println(arr2[i]);
        }

    }
}
