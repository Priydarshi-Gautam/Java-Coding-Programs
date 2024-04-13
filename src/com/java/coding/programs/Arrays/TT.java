package com.java.coding.programs.Arrays;

import java.util.Arrays;
import java.util.List;


public class TT {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 4, 8, 1, 9, 4);
        List<Integer> list1 = list.stream().sorted().toList();
        List<Integer> reversed = list1.reversed();
        System.out.println(reversed);
        System.out.println(list1);


        System.out.println(list1.get(4));

    }
}
