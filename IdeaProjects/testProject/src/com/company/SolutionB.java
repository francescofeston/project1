package com.company;

public class SolutionB{
    public static void main(String[] arguments){

        /*test case1*/
        int n = 10;
        int[] a;
        a = new int[] {1,2,3,4,5,6,7,8,9,10,11};
        int key = 6;
        int result = keyFinder(a,key);
        if(result == -1){
            System.out.println("NOT_FOUND");
        }else{
            System.out.println(result);
        }


        /*test case2*/
        int n1 = 20;
        int[] a1;
        a1 = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int key1 = 20;
        result = keyFinder(a1,key1);
        if(result == -1){
            System.out.println("NOT_FOUND");
        }else{
            System.out.println(result);
        }



    }
    public static int keyFinder(int[]arr, int n){
        int index, pwr;
        index = 0;
        pwr = 0;
        //the loop checks for element larger than the key to be found.
        while(true){
            try{
                if(arr[index] == n){
                    return index;
                }
                else if(arr[index] < n){
                    index = (int) Math.pow(2,pwr);
                    pwr ++;
                }else{
                    break;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        int left = index/2 - 1;
        int right = index -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            try{
                if(arr[mid]== n){
                    return mid;
                }
                if(arr[mid] > n){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                right = mid -1;
            }
        }
        return -1;
    }


}
