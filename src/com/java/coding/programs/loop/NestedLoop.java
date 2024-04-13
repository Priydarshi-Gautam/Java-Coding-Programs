package com.java.coding.programs.loop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i =1; i<=8; i++) {
            System.out.println("printed by i : "+i );
            for (int j = 1; j <= 5; j++)
            {
                System.out.println(j);
            }
            System.out.println(i);

        }

    }
}
