package com.company;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i ++){
            arr[i] = s.nextInt();
        }
        float [] arr2 = new float [size];
        int count = 0;
        int count2 = 0;
        while(count < size){
            if(arr[count] == 1){
                continue;
            }
            arr2[count2++] = (float) arr[count];
            System.out.println(arr2);
        }
    }
}
