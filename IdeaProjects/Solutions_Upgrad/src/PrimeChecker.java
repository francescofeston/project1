import java.util.*;
public class PrimeChecker {
    public static void main(String[] args){
        System.out.println(isPrime(11));
        System.out.println(isPrime(6));
        System.out.println(isPrime(25));
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % 1 == 0){
                return false;
            }
        }
        return true;
    }
}
