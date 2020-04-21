package com.company;

class EqualsTester {
   public static void main(String[] arguments) {
        String str1, str2;
        str1 = "Boy, that escalated quickly.";
        str2 = str1; //REFERENCE TO str1 object

        System.out.println("String1: " + str1);
       System.out.println("String2: " + str2);
       System.out.println("Same object? " + (str1 == str2));

       str2 = new String(str1);

       System.out.println("String1: " + str1);
       System.out.println("String2: " + str2);
       System.out.println("Same object? " + (str1 == str2));
       System.out.println("Same value? " + str1.equals(str2));
       //System.out.println(str1.getClass().getName());
       //boolean check = str1 instanceof Boolean;
       //System.out.println(check);
   }
}