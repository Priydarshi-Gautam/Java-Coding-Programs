package com.java.coding.programs.Arrays;

import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> reversed = list.reversed();

        System.out.println(reversed);
    }
}
