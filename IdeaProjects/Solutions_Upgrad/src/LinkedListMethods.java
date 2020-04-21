import java.util.*;
import java.util.stream.*;
public class LinkedListMethods {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();

        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99f);

        LinkedList<Float> Ll = new LinkedList<>();
        for(Float x : random){
            Ll.add(x);
        }
        System.out.println("linked list is:\n[");
        for(Float x : Ll){
            System.out.println(x + " ");
        }
        System.out.println("]");
    }


    //convert the array list of Float objects into Linked List

    /* ArrayList is passed as a parameter in the constructor of the linked list
    public static <T> List<T> turnAlToLi(List<T> al){
        //create Linked list by passing array list as parameter in the constructor
        List<T> Linklis = new LinkedList<>(al);
        return Linklis;
    }

     */

}

