import java.util.Scanner;

public class TaxCalculator {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            // Enter annual income
            double income = scan.nextDouble();
            // Enter age
            int age = scan.nextInt();

            double tax = 0.0;

            // Write your logic here
            if(income <= 250_000d) {
                System.out.println("no tax");
            }
            if(income >=250_001d && income <=300_000d && age <= 60) {
                tax = (income * 0.10d)/100d;
                System.out.println("tax you have to pay is: " + tax);
            }else if(income >=300_001d && income <= 500_000d && age <= 80) {
                tax = (income * 0.10d)/100d;
                System.out.println("tax you have to pay is: " + tax);
            }else if(income >= 500_001d && income <= 1_000_000d) {
                tax = (income * 0.2d)/100d;
                System.out.println("tax you have to pay is: "+ tax);
            }
            else if(income > 1000000d){
                tax = (income * 0.3d)/100d;
                System.out.println("tax you have to pay is: " + tax);

            System.out.print(tax);
            scan.close();
        }
    }
}
