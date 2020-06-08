//game app to guess a random number

import java.util.Scanner;
public class Hilo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String playAgain = "";
        do {                                                                //DO-WHILE LOOP
            int theNum = (int) (Math.random() * 100 + 1); //
            int guess = 0;
            int numOfTries = 0;
            //System.out.println("Guess a number between 1 and 100");
            while (guess != theNum) {
                System.out.println("Guess a number between 1 and 100");
                guess = s.nextInt();
                System.out.println("you entered " + guess + " .");
                if (guess < theNum) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > theNum) {
                    System.out.println(guess + " is too high. Try again");
                } else {
                    System.out.println(guess + " is correct. You win");
                }
                numOfTries += 1;
            }
            System.out.println("You tried " + numOfTries + " times.");

            System.out.println("Would you like to play again (y/n)?");
            playAgain = s.next();
        }
        while(playAgain.equalsIgnoreCase("y"));
        System.out.println("bye");
        s.close();
    }

}
