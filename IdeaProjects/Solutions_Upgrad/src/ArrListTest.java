import java.util.ArrayList;

public class ArrListTest {
    public static void main(String[] args) {
        float random[ ] = {2.0f, 4.0f, 5.0f, 10.0f};
        //Declare and create an object of the ArrayList class named 'random', in place of the line above
        ArrayList<Float> AL = new ArrayList<>();
        //Add the first four elements to this 'random' ArrayList
        for(float x : random){
            AL.add(x);
        }
        AL.add((float) 99.0);                    //Command for adding a new element
        printArray(AL);
    }

    public static void printArray(ArrayList<Float> AL) {   //Change the type of the parameter to ArrayList
        for(Float a : AL) {              //Change the data type of 'a' from 'int' to 'Object'
            System.out.println(a);
        }
    }

}
