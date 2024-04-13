package com.java.coding.programs.basic_programs;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number to check = ");
        int num = scanner.nextInt();
        int sum=0,reverse,temp;
        temp=num;
        while (num>0)
        {
            // 123

            reverse=num%10;
            sum=(sum*10)+reverse;
            num=num/10;
        }
        if (temp==sum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
