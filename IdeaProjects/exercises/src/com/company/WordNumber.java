package com.company;

import java.util.Scanner;

public class WordNumber {
    public static void main(String[] arguments) {
        Scanner s = new Scanner(System.in);
        System.out.println("input the number od items: ");
        int size = s.nextInt();
        String[] arr = new String[size];
        System.out.println("enter the number in word format");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.next();
        }

        //arr[0] = s.next();
        //char[][] arChar = new char[10][10];
        for(int j = 0; j < arr.length; j++) {
                if (arr.length > 0) {
                    long num = 0;
                    char firstChar = arr[j].charAt(0);
                    char secondChar = arr[j].charAt(1);
                    switch (firstChar) {
                        case 'o':
                            num = 1L;
                            break;
                        case 't':
                            if (secondChar == 'w')
                                num = 2L;
                            if (secondChar == 'h')
                                num = 3L;
                            if (secondChar == 'e')
                                num = 10L;
                            break;
                        case 'f':
                            if (secondChar == 'o')
                                num = 4L;
                            if (secondChar == 'i')
                                num = 5L;
                            break;
                        case 's':
                            if (secondChar == 'i')
                                num = 6L;
                            if (secondChar == 'e')
                                num = 7L;
                            break;
                        case 'e':
                            if (secondChar == 'i')
                                num = 8L;
                            break;
                        case 'n':
                            num = 9L;
                    }
                    System.out.println("The number is " + num);

            }
        }
    }
}




