package com.company;

import java.util.Arrays;

public class Bubble {

    public static int[] BubbleSortedImproved(int[] arr){
        int pass, i, temp, swapped = 1;
        for(pass = arr.length -1; pass >= 0 && pass >= swapped; pass--){
            swapped = 0;
            for(i = 0; i < pass - 1; i ++){
                if(arr[i]> arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = 1;
                }
            }
        }
        return arr;
        System.out.println(swapped);
    }

    public static void main(String args[]) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        int[] sortedNumbers;

        sortedNumbers = BubbleSortedImproved(randomNumbers); // bubble sort

        // print out the sorted numbers
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
