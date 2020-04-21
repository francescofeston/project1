package com.solutions;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayChecker {

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            System.out.println("number of array items");
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("populate the array");
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            System.out.println("key to be searched");
            int k = s.nextInt();
            //search(arr, k);
            check(arr,k);
        }

        // Method to search for k in an unsorted array with linear search
       /* static void search(int[] arr, int k) {
            // Write your code
            boolean test = false;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]== k) {
                    test = true;
                    break;
                }
            }
            System.out.println(test);

        }

        */

       static void check(int[] arr, int k){
           //sort the array
           Arrays.sort(arr);
           //using binarySearch method of Array class check if k is present or not
           int res = Arrays.binarySearch(arr,k);
           boolean test = res > 0 ? true : false;
           System.out.println("Is "+  k + " present in the array: " + test);
       }

        /*
       static void check(Integer[]arr, int k){
           boolean test = Arrays.asList(arr).contains(k);
           System.out.println("Is "+  k + " present in the array: " + test);

       }

        */
    }

