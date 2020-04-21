import java.util.*;
public class StackSortWhileLoop {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        //while (n-- > 0)
        //    stack.push(s.nextInt());
        stack.add(5);
        stack.add(7);
        stack.add(10);
        stack.add(4);
        stack.add(34);
        stack.add(11);
        stack.add(29);
        stack.add(3);
        stack.add(6);
        stack.add(1);

        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            // Remove the top element from the original stack
            int n = stack.pop();
            // Remove the elements form temp stack which are greater than n and push into original stack
            while (!temp.isEmpty() && temp.peek() > n)
                stack.push(temp.pop());
            temp.push(n);
        }
        System.out.println(temp);
    }
}
