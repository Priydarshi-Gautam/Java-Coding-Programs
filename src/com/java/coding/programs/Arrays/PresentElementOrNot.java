// Java Program to print the number of elements present in an array

package com.java.coding.programs.Arrays;

import java.util.List;



public class PresentElementOrNot {
    public static void main(String[] args) {

        // way 1

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int numbers= 8;
       for (int i: integers)
       {
           if (i==numbers) {
               System.out.println("found " + numbers);
               break;
           }

       }

       //way 2

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

       boolean b = integers.stream().anyMatch(integer -> integer == numbers);

        {

            if(b)
                System.out.println(numbers+" found");
        }

    }
}
