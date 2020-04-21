public class TailRecursion {
    static int factTR(int n, int a){
        if(n == 0){
            return a;
        }else{
            return factTR(n-1, n * a);
        }
    }

    static int fact(int n){
        return factTR(n, 1);

    }

    //static void printfact(){
    //    System.out.println(fact(int n));
    //}
    public static void main(String[] args){
        System.out.println(fact(5));
      //  printfact();
    }

}
