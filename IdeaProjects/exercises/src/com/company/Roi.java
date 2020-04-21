package com.company;

public class Roi {
    public static void main(String[] args){
        float principal = 14000;
        System.out.println("Original investment: € " + principal);
        //increase by 40% first year
        float principalFirstYear = principal + (principal * .4F);
        System.out.println("after one year: € " + principalFirstYear);
        float yieldFirstYear = (float) 0.4;
        float lossSecondYear = 1500;
        float yieldThirdYear = (float) 0.12;
        //System.out.println("Principal after first year is: " + principal + (principal*yieldFirstYear));
    }
}
