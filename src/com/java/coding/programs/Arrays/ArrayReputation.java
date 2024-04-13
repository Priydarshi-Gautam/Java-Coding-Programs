// write a program to check repeating arrays

package com.java.coding.programs.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayReputation {
    public static void main(String[] args) {

        //  way 1

        List<Integer> list=Arrays.asList(1,2,3,4,5,8,1,8,3,1,6,7,8,9,10,11,12);

        Set<Integer> collected = list.stream().filter(e -> Collections.frequency(list, e) > 1)
                .collect(Collectors.toSet());
        System.out.println(collected);


        //  way 2

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1=list.stream().filter(e ->!set.add(e)).collect(Collectors.toSet());
        System.out.println(set1);

        System.out.println("++++++++++++++++++++");

        list.reversed().forEach(System.out::println);


    }
}
