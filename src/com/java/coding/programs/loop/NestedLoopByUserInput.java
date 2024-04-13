package com.java.coding.programs.loop;

import java.util.Scanner;

public class NestedLoopByUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("taken by user input : = " + i);
            for(int j=0;j<=num2;j++)
            {
                System.out.println( j);
            }
        }
    }

}
