package com.java.coding.programs.basic_programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        long fact=1;
        for (int i =1;i<=num;++i)
        {
            fact =fact* i;
         }
        System.out.print(fact);

    }
}
