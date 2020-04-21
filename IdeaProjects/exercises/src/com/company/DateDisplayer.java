package com.company;

import java.util.Scanner;
import java.util.Calendar;
public class DateDisplayer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //int year;
        //System.out.println("please input \ta year:");
        //year = s.nextInt();
        Calendar now = Calendar.getInstance();

        System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

        String[] strMonths = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec" };
        System.out.println("Current month is : " + strMonths[now.get(Calendar.MONTH)]);

    }

}

