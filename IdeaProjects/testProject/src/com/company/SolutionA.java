package com.company;
import java.util.*;

class SolutionA {
    public static void main(String[] arguments){

        /*test case1*/
        int[] a = {0,1,3,4,5};
        int n = a.length;

        int result = binaryFinder(a, 0, n);
        if(result == -1){
            System.out.println("NOT_FOUND");
        }else{
            System.out.println(result);
        }

        /*test case2*/
        int[] b = {0,1,2,4,5,6,7};
        n = b.length;

        result = binaryFinder(b, 0, n);
        if(result == -1){
            System.out.println("NOT_FOUND");
        }else{
            System.out.println(result);
        }


        //System.out.println("Please input the array length");
        //int a = input.nextInt();
        //int[] a = new int[n];
        //System.out.println("Please input the IDs");
        //for(int i = 1; i < n; i++){
        //  a[i] = input.nextInt();
        //}
    }

    public static int binaryFinder(int[] a, int left, int right){

        if(right >= left){
            //initialize m: left +(right-left)/2
            int m = left + (right - left)/2;
            if( (m + 1)== a[m]){
                return a[m];
            }
            if(m > a[m]){
                return binaryFinder(a, (m + 1), right);
            }else {
                return binaryFinder(a, left, (m-1));
            }
        }
        return -1;
    }
}

