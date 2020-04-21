package com.company;
import java.util.*;
public class maximizeSum {
    public static void PQimplement(int[] a, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : a){
            pq.add(x);
        }
        while (k --> 0){
            System.out.println(pq.remove());
        }
    }
    public static void main(String[] args){
        int [] arr = {-3};
        int k = 2;
        PQimplement(arr,k);
    }
}
