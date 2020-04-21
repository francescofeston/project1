import java.util.*;
public class SortStackRecursion {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
        printStack(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sortInt(Stack<Integer> stack, int n) {
        // Write your code here
        if(stack.isEmpty() || n > stack.peek()){
            stack.push(n);
            return;
        }
        int temp = stack.pop();
        sortInt(stack,n);
        stack.push(temp);
    }
    static void sort(Stack<Integer> s){
        if(!s.isEmpty()){
            int x = s.pop();
            sort(s);
            sortInt(s,x);
        }
    }
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        //while(lt.hasNext())
         //   lt.next();

        // printing from top to bottom
        while(lt.hasNext())
            System.out.print(lt.next()+" ");
    }
}

