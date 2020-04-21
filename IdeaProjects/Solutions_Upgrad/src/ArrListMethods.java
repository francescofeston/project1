import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
public class ArrListMethods {
        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
                list.add(s.nextInt());
            //reverseMyOwn(list);

            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");

        }

    // Method to reverse the ArrayList
    static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        ArrayList<Integer> Al = new ArrayList<>();
        for(int i = list.size()-1; i>= 0; i--){
            Al.add(list.get(i));
        }
        return Al;
    }
    //using reverse method from Collection
    static void reverseWithCollection(ArrayList<Integer>list){
        Collections.reverse(list);
    }
    //personal function (no additional space required)
    static ArrayList<Integer> reverseMyOwn(ArrayList<Integer> list){
            for(int i = 0; i < list.size()/2; i ++){
                Integer temp = list.get(i);
                list.set(i, list.get(list.size()- i - 1));
                list.set(list.size()-i - 1, temp);
            }
            return list;
    }
}

/*
 // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        int leftIndex = 0, rightIndex = list.size() - 1;
        int temp;
        while (leftIndex < rightIndex) {
            temp = list.get(leftIndex);
            list.set(leftIndex++, list.get(rightIndex));
            list.set(rightIndex--, temp);
        }
 */