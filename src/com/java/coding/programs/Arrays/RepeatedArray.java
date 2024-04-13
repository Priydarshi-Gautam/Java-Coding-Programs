package com.java.coding.programs.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RepeatedArray {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3,2,4, 5,3,1,6};

        // way 1-> by using array


        // by brute force method (it's applicable only for 2 elements)

        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }

        // way 2-> By using Set


//        Set<Integer> set = new HashSet<>();
//        for (int n :arr)
//        {
//            if(!set.add(n))
//            {
//                System.out.println("repeated number : "+n + " ");
//            }
//
//        }



    }
}
