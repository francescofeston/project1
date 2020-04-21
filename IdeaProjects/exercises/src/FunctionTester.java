public class FunctionTester {
    public static void main(String[] args){

        TestClass c1 = new TestClass(2, 5.2);
        TestClass c2 = new TestClass(3, 7.5);
        c1.incrementA(1);
        c2.incrementB(1.0);
        System.out.println(c1.a + " " +  c2.b);
        //func(25);
        /*
        int n = 10;
        int i;
        for(i = 0;i < n; i++){
            while (i < n){
                System.out.println("hell");
                i++;
            }
        }

         */
        int N = 3;
        int M = 4;
        int a = 0, b = 0;
        //Random rand = new Random();
        //for (int i = 0; i < N; i++) {
        //    a = a + rand.nextInt(100);
         //   System.out.println("value of a is: " + a);
        }
        //for (int j = 0; j < M; j++) {
         //   b = b + rand.nextInt(100);
        //}



    }
    /*
    public static void func(int n){
        if(n<= 1){
            System.out.println(n);
        }else{
            System.out.print(n%2);
            func(n/2);
        }
    }

     */
    class TestClass{
        public int a;
        public double b;

        public TestClass(int first, double second){
            this.a = first;
            this.b = second;
        }
        public static void incrementA(int first){
            first += 1;
        }
        public static void incrementB(double second){
            second+= 1.0;
        }
    }


