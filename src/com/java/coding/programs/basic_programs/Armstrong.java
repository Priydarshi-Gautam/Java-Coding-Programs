package com.java.coding.programs.basic_programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int arms = 0,temp,rem;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number to check = ");
        int num = scanner.nextInt();
        temp=num;
        while (num > 0)
        {
            rem=num%10;
            arms =(rem*rem*rem)+arms;
            num=num/10;

        }
        if (arms==temp)
        {
            System.out.println("Armstrong Number "+arms);
        }
        else
            System.out.println("Not Armstrong Number "+arms);
    }
}
