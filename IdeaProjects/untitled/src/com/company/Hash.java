import com.company.HashSet;
import java.util.*;

public class Hash {
    public static void method(int[]  array ){
        int count = 0,n = array.length;

        com.company.HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i = 0; i < n; i++) {
            hashSet.add(array[i]);
        }

        int currentElement = array[0];

        while(hashSet.contains(currentElement) == true) {

            count++;

            currentElement--;
        }

        System.out.println(count);
    }



    public static void main(String args[]) {
        int[] arr = {5, 8, 4, 4, 7, 6, 2, 6, 7, 3};
        method(arr);

    }
}


