package com.company;

public class MyInt {
    int value;

    public static void increment(MyInt value) {
        value.value++;
    }

    public static void main(String[] args) {
        MyInt x = new MyInt();
        x.value = 10;
        System.out.println(x);
        increment(x);
        System.out.println(x);
    }
}