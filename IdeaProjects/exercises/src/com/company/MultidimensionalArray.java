package com.company;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][][] century = new int [100][52][7];
        System.out.println("Elements in the first dimension: " + century.length);
        System.out.println("Elements in the second dimension: " + century[0].length);
        System.out.println("Elements in the third dimension: " + century[0][0].length);
    }
}

