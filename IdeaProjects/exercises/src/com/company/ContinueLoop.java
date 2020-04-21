package com.company;

public class ContinueLoop {
    public static void main(String [] args){
        int count = 0;
        int count2 = 0;
        int [] arr = {23, 45, 56, 3, 1, 23, 45, 56, 78,};
        float [] arr2 = new float[arr.length];
        while(count++ < arr.length){
            if(arr[count] == 1){
                continue;
            }
            arr2[count2++] = (float) arr[count];
            System.out.println(arr2);

        }
    }
}
