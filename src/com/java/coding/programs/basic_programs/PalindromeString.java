package com.java.coding.programs.basic_programs;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String original,reverse="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number or String to check =: ");
        original = scanner.nextLine();
        int length = original.length();

        for (int i =length-1;i>=0; i--)

            reverse = reverse+original.charAt(i);


        if (original.equals(reverse))

            System.out.println("Palindrome");

        else

        System.out.println("Not palindrome");

    }
}
