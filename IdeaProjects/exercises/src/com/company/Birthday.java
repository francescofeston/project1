package com.company;
import java.util.*;

public class Birthday {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please input your birthday in the format MM/DD/YYYY");
        String userInput = s.next();
        StringTokenizer str1 = new StringTokenizer(userInput, "/");
        System.out.println("Month: " + str1.nextToken());
        System.out.println("Day: " + str1.nextToken());
        System.out.println("Year: " + str1.nextToken());
        System.out.println(userInput.substring(0,2));

        String month = userInput.substring(0,2);
        String day = userInput.substring(3,5);
        String year = userInput.substring(6,10);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);

    }
}
