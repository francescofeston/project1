import javax.print.DocFlavor;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a message to encode or decode");
        String message = s.nextLine(); //store user's input until RETURN is pressed
        String output = "";
        char key = 13;

        for(int i = 0; i < message.length(); i++){
            //output += (char)(message.charAt(i) + key);
            char input = message.charAt(i);
            if(input >= 'A' && input <= 'Z'){ //WE CAN EITHER USE LITERAL CHAR 'A' OR ITS MATCHING INT VALUE 65
                input+= key; //add the key value to the input char to encode the letter
                if(input > 'Z'){ //if adding the key value of 13 pushes the letter past Z
                    input-= 26;  //subtract 26, i.e, the number of letters in the English alphabet
                }
            }
            else if(input >= 'a' && input <= 'z'){
                input+= key;
                if(input > 'z'){
                    input-=26;
                }
            }
            output += input; //add the resulting input characters to output String
        }
        System.out.println(output);
        s.close();
    }
}
