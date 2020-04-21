import java.util.*;

public class StackSubList {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        //Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        //while (n-- > 0)
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

        //System.out.println(Arrays.toString(arr));
        System.out.print("original stack: " + stack);
        int half = stack.size()/2;
        int size = stack.size();
        List<Integer> subStack = stack.subList(half,size);
        System.out.println("\nsubstack of stack: " + subStack);


    }

}
