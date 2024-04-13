package com.java.coding.programs.basic_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prime = scanner.nextInt();
        boolean flag= false;           // we assume that flag is start False
        for (int i=2;i<prime/2;i++) {
            if (prime%i == 0)
                flag = true;
            break;
        }
        if (!flag)
        {
            System.out.println("Prime Number "+prime);
        }
        else
            System.out.println("Not " + prime);
    }



    }

