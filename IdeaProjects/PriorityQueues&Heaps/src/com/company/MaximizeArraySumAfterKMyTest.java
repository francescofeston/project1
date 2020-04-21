package com.company;

import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MaximizeArraySumAfterKMyTest{
        public static int maxSum(int[] a, int K){
            // It creates a priority queue and inserts all array elements
            // into the priority queue.

            PriorityQueue<Integer> priorqueue = new PriorityQueue<>();
            for (int x : a)
                priorqueue.add(x);

            // Performing K negation operations
            while (K-- > 0){
                // write your code here
                int temp = priorqueue.poll(); //retrieve and remove min element
                temp *= -1;
                priorqueue.add(temp); //modify the min element by turning it into positive and add back to PQ
            }

            // Finds the total sum of the final array
            int sum = 0;
            for (int x : priorqueue)
                sum = sum + x;
            return sum;
        }

        public static int[] getArrayInput(int size, Scanner scanner) {
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }

        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int arr[] = getArrayInput(N, scanner);

            System.out.println(maxSum(arr, K));
        }
    }

