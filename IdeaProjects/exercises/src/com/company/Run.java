package com.company;

class Employee {

   private int empId;
   private String empFirstName;
   private String empSecondName;
   private double empSalary;

 //Write your code here
   Employee(int id, String name, String surname, double wage){
      this.empId = id;
      this.empFirstName = name;
      this.empSecondName = surname;
      this.empSalary = wage;
   }
   void printData(){
      System.out.println("employee full name: " + this.empFirstName + " " + this.empSecondName);
      System.out.println("employee annual package: " + this.empSalary);
   }

}

public class Run {
   public static void main(String[] args) {
      
     //Write your code here
      Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
      Employee E2 = new Employee(101512032, "Tara", "Sharma", 51000.99);
     E1.printData();
   }
}