package com.java.coding.programs.basic_programs;

public class  Test {
    public static void main(String[] args) {

        int num = 4;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of  = %d", factorial);
    }
    }

