import java.util.*;

public class ReverseSecondHalfStack {

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

            //reverseSecondHalf(stack);

            int size = stack.size();
            int [] arr = new int [size];
            for(int i = 0; i < size; i++){
                 stack.push(arr[i]);
            }

            System.out.println(Arrays.toString(arr));
        }



        // Method to reverse the last half of the elements from the bottom of the stack

        static Stack<Integer> reverse(Stack<Integer> stack) {
            // Write your code here
            int stackHalf = stack.size() / 2;
            int size = stack.size();
            Stack<Integer> temp = new Stack<>();
            while (stackHalf++ < size) {
                int n = stack.pop();
                temp.push(n);
            }

            //System.out.println(stack);
            //System.out.println(temp);

            //while (!temp.isEmpty())

            //System.out.println("second half reverted :" + temp);
            //printStack(temp);
            System.out.println(temp);
            return temp;
        }

    static void reverseSecondHalf(Stack<Integer> s){
        int[] arr = new int[s.size()];

        int size = arr.length;
        int half = size/2;
        for(int i = 0; i < size ; i ++){
            //arr[i] = s.pop();
            //System.out.print(arr[i] + " ");
            s.push(arr[i]);
            //System.out.println(s);
        }
        int[] revArr = new int[size];
        for (int i = 0; i < size; i++){
            revArr[i] = s.pop();
        }
        System.out.println(Arrays.toString(revArr));

    }
    }

