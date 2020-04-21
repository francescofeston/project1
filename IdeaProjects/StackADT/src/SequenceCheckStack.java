import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class SequenceCheckStack {

       /* public static Stack<Integer> stackPush(Stack<Integer> s){
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i < s.size(); i++){
                Integer y = (Integer) s.pop();
                stack.push(y);
            }
            return stack;
        }

        */
    public static void sortInsert(Stack<Integer> s, int n){
        if(s.isEmpty() || n > s.pop()){
            s.push(n);
            return;
        }
        int temp = s.pop();
        sortInsert(s, n);

        s.push(temp);
    }

    static void sortStack(Stack<Integer> s){
        if(!s.isEmpty()){
            int x = s.pop();
            sortStack(s);
            sortInsert(s, x);
        }
    }

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
            /*
            Stack<Integer> sequence3 = new Stack<>();
            while (sequence1.size()!= 0){
                sequence3.push(sequence1.peek());
                sequence1.pop();
            }
            while (sequence2.size()!=0){
                sequence3.push(sequence2.peek());
                sequence2.pop();
            }

             */
        sortStack(sequence1);
        Boolean isSequence = false;
        while (!sequence1.isEmpty() && !sequence2.isEmpty()) {
            if (sequence2.contains(sequence1.peek())){
                sequence1.pop();
                sequence2.pop();
                isSequence = true;
            }else {
                return isSequence;
            }
        }
        return isSequence;

    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            Stack<Integer> sequence1 = new Stack<Integer>();
            Stack<Integer> sequence2 = new Stack<Integer>();
            int boxIndex = 0;
            for (String elem1 : line1.split(" ")) {
                sequence1.add(Integer.parseInt(elem1));
            }
            for (String elem2 : line2.split(" ")) {
                sequence2.add(Integer.parseInt(elem2));
            }
            Boolean isSubsequence = contains(sequence1, sequence2);
            System.out.println(isSubsequence);
        }
    }

