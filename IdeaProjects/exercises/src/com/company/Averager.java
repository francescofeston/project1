package com.company;

import java.util.Scanner;

public class Averager {
    public static void main(String[] arguments) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("please input a number \n");
        int size = s.nextInt();

        System.out.println("input the elements ");
        int [] arr = popArr(size, s);
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Sum is: " + sum);
            System.out.println("Average is: " +
                    (float) sum / arr.length);
        }
    }
    public static int[] popArr(int size, Scanner s){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
