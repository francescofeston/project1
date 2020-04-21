package com.company;

import java.util.*;

class Number {
   //Write your code here
    double real;
    double imaginary;
    Number(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }

   public double getImaginaryPart() {
        return this.imaginary;
   }
    public double getRealPart(){
        return this.real;
    }
   public void setImaginary(double myImagiNumber){
        this.imaginary = myImagiNumber;

   }
   public void setReal(double myRealNumber){

        this.real = myRealNumber;
   }
    
}

class Complex extends Number {
    Complex(double real, double imaginary) {

        super(real, imaginary);
    }

    public void checkComplex() {

        if (super.getRealPart() != 0 || super.getImaginaryPart() != 0) {
            System.out.println("The given number is complex");
            if(getRealPart()==0){
                System.out.println("i" + super.getImaginaryPart());

                System.out.println("The number is purely imaginary");
            }else{
                System.out.println(super.getRealPart() + "+" + "i" + super.getImaginaryPart());

            }

        }

        else if (super.getRealPart() == 0 & super.getImaginaryPart() == 0) {
            System.out.println("The given number is real");
            System.out.println(super.getRealPart() + "+" + "i" + super.getImaginaryPart());

        }
        else if(super.getRealPart() ==0 && super.getImaginaryPart()!=0){
            System.out.println("The number is purely immaginary");
            System.out.println("i" + super.getImaginaryPart());
        }

    }
}


class PurelyImaginary extends Complex {
    PurelyImaginary(double real, double imaginary) {

        super(real, imaginary);
    }

    public void checkPurelyImaginaryNumber() {
        if(getRealPart() == 0 && getImaginaryPart()== 0) {
            System.out.println("The number is not purely imaginary");
        }
        if(getRealPart()!=0){
            System.out.println("The number is not purely imaginary");
        }

    }
}

public class NumberParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();
        }
    }