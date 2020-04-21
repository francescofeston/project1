import java.util.Scanner;
public class SquareTool {
    public SquareTool(String input){
        try{
            float in = Float.parseFloat(input);
            Square sq = new Square(in);
            float result = sq.value;
            System.out.println("the square of " + input + " is " + result);
        } catch (NumberFormatException e){
            System.out.println(input + " is not a valid number");
        }
    }
    class Square{
        float value;
        Square(float x){
            value = x * x;
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String input = String.valueOf(Float.valueOf(s.nextInt()));
        SquareTool sq = new SquareTool(input);
    }
}
