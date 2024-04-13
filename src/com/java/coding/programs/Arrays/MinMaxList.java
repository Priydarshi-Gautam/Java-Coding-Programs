package com.java.coding.programs.Arrays;

import java.util.Arrays;
import java.util.List;

public class MinMaxList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 43, 5, 6, 74, 8, 9, 10, 11);
        Integer i = list.stream().max(Integer::compare).get();
        System.out.println(i);

    }

}
