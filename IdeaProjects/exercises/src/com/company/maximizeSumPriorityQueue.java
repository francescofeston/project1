package com.company;

import java.util.*;
public class maximizeSumPriorityQueue {
    public static void PQimplement(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : a) {
            pq.add(x);
        }
        while (k-- > 0) {
            //System.out.println(pq.peek());
           System.out.println(pq.remove());
            // System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        int k = 4;
        PQimplement(arr, k);
    }
}
