package com.java.coding.programs;

public class ForLoop {
    public static void main(String[] args) {
       // for (int i = 0; i < 10; i++) {
       //     System.out.println(i);
       // }

        for (int i = 10; i>5; i--)
        {
            System.out.println(i);
            if(i==8)
            {
                break;
            }

        }
        System.out.println("break out nos");
    }
}
