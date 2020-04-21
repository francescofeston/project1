import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int marks[];
        marks = new int[5];
        int roll;
        Scanner input = new Scanner(System.in);

        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();
        marks[3] = input.nextInt();
        marks[4] = input.nextInt();
        roll = input.nextInt();

        System.out.println("The student with" + roll);
    }
}