package com.company;

import java.util.Scanner;

public class SequentialSearch {
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
        System.out.println("input a number to be searched");
        int target = s.nextInt();
        System.out.println(targetExist(arr,target));

    }
    public static int targetExist(int [] arr, int n) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return arr[i];
            }
        }
        return -1;
    }

}

