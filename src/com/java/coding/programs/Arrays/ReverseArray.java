// reverse array


package com.java.coding.programs.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        Arrays.asList(arr);
        ArrayList<Integer> list = new ArrayList<>();
       // list.add(arr); getting error message

        // Way 1

        // imp Note -> we can't convert array into ArrayList , we have to traverse using loop
        //     and then add it to the list.

        for (int i :arr)
        {
            list.add(i);
        }

        list.reversed().forEach(System.out::println);
    }
}
