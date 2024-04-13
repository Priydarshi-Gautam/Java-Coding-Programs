package com.java.coding.programs.Arrays;

import java.util.HashMap;
import java.util.Map;


public class FrequencyUsingMap {
    public static void main(String[] args) {
        int[] arr = {0, 1,3, 2, 3, 4,1, 5,2, 6, 7};

        HashMap<Integer,Integer> hm = new HashMap<>();

        //main logic

        for (int i=0;i<arr.length;i++) // or we can write -> for(int i : arr)
            // for(int i : arr)
        {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else
            {
              hm.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entries : hm.entrySet()) {
            System.out.println("Frequency of each elements");
            System.out.println(entries.getKey()+ "  " + entries.getValue());
        }

    }
}
