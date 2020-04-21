import java.util.*;

public class StackUsage {
    // Java code to illustrate size()
     public static void main(String args[])
        {
            // Creating an empty Stack
            Stack<Integer> stack = new Stack<Integer>();
            int size = stack.size();
            int [] a = new int[size];
            // Use add() method to add elements into the Stack
            stack.add(1);
            stack.add(2);
            stack.add(3);
            stack.add(4);
            stack.add(5);
            stack.add(6);
            stack.add(7);
            stack.add(8);
            stack.add(9);
            stack.add(10);
            stack.add(11);
            stack.add(12);
            // Displaying the Stack
            Stack<Integer> s1 = new Stack<>();
            int halfSize = stack.size()/2;
            //while (size --> halfSize) {
            //    s1.push(stack.pop());
            //}
            for(int i = stack.size(); i > halfSize; i--){
                //System.out.println(stack); // print the original stack 6 times
                //s1.push(i); WORKS FINE. ADDS ITEMS FROM TOP TO MID POSITION TO STACK S1
                s1.push(stack.pop());
                //System.out.print(i + " ");
            }
            System.out.print("\n" + s1);
            System.out.print("\n" +  stack);

            sort(s1);
            System.out.print("\n" + s1);

            while (!s1.isEmpty()){
                stack.push(s1.pop());
            }
            System.out.println("\n" + stack);
            /*
            while(!stack.isEmpty()){
                s1.push(stack.pop());
            }
            System.out.print("\n" + s1); //[12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
            */

            //for(int i = s1.size(); i > 0; i--){ DOES NOT ADD S1 ITEMS TO STACK
            //    stack.push(i);
            //}
            //System.out.println("Stack: " + s1);
            //System.out.println("added element " + s1.push(35));
            //System.out.println("Stack: " + s1);



            // Displaying the size of Stack
            //System.out.println("The size is: " + stack.size());
        }




        public static void reverseImStack(Stack<Integer> s, int n) {
            if(s.isEmpty() || s.peek() < n) {
                s.push(n);
                return;
            }

            int temp = s.pop();
            reverseImStack(s, n);
            s.push(temp);

         }
         static void sort(Stack<Integer> s){

            if(!s.isEmpty()){
                int x = s.pop();
                sort(s);
                reverseImStack(s,x);
                }
            }


}



