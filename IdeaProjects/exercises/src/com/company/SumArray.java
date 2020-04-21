package com.company;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please input the size of the array");
        int arrSize = s.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("please input the elements of the array");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = s.nextInt();
            System.out.println(" " + arr[i]);

        }
        System.out.println(ArraySum(arr, arrSize));

    }

    public static int ArraySum(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

