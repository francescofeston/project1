package com.company;

import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    abstract double getRateOfIntererst();
    abstract double simpleInterest();
}

class Bank1 extends Homeloan {

    //Write your code

    Bank1(double amount, int time) {
        super.amount = amount;
        super.time = time;
    }

    //Write your code here
    double getRateOfIntererst() {
        return 7.2d;
    }
    double simpleInterest() {

        return amount + (amount*getRateOfIntererst()*time)/100;
    }

}

class Bank2 extends Homeloan {

    //Write your code here
    Bank2(double amount, int time) {
        super.amount = amount;
        super.time = time;
    }

    double getRateOfIntererst() {
        return 8.1d;
    }

    double simpleInterest() {

        return amount + (amount*getRateOfIntererst()*time)/100;
    }

}

public class Source_Loan {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        if(amount <= 0 || time <= 0){
            System.out.println("invalid input");
        }
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }

}
