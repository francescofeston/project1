import java.util.Scanner;
public class FibonacciDynamic {
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers */
        /* Assign the 0th, 1st, and 2nd numbers of the Fibonacci series to 0, 1, and 2 respectively */
        /* Add the previous three numbers in the series, and store them */
        /* Return the nth element in the series */
        int[] fibArr = new int[n];
        fibArr[0] = 0; //ASSIGN VALUE 0 TO THE Oth element of fibArr
        if(n == 1){
            return fibArr[0];
        }
        fibArr[1] = 1;
        fibArr[2] = 2;
        for(int i = 3; i<= n-1; i++){
            fibArr[i] = fibArr[i-1] + fibArr[i-2] + fibArr[i-3];
        }
        return fibArr[n-1];

         /*
        for(int i = 0; i <fibArr.length; i++){
            if(i ==0){
                fibArr[i] = 0;
            }
            else if(i <= 2){
                fibArr[i] = 2;
            }else{
                fibArr[i] = fibArr[i -1] + fibArr[i -2];
            }
        }
        return fibArr[n-1];
        */
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}
