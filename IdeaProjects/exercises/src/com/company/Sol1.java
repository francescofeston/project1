package com.company;

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please input 2 numbers:\n");
        float num1 = s.nextInt();
        float num2 = s.nextInt();
        float result = num1 / num2;
        float remainder = num1 % num2;
        System.out.println(num1 + " divided by " + num2);
        System.out.println("Result\tRemainder");
        System.out.println(result + "\t " + remainder);
    }
}
