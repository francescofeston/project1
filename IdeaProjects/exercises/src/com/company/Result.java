package com.company;

import java.util.Scanner;

public class Result {
    //int num1;
    //int num2;
    public static int remainder(int n1, int n2){
        int output = n1 % n2;
        return output;
    }
    public static int divider(int n1, int n2){
        int div = n1 / n2;
        return div;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please input 2 numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("Remainder is: " + remainder(num1, num2));
        System.out.println("Result of division is: " + divider(num1, num2));
    }
}
