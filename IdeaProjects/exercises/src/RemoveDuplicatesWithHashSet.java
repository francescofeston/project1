

import java.util.*;
public class RemoveDuplicatesWithHashSet {
    public static Integer[] removeDuplicates(Integer[] input) {
        if (input == null || input.length <= 0) {
            return input;
        }
        Set<Integer> aSet = new HashSet<>(input.length);
        // set will reject all duplicates
        for (int i : input) {
            aSet.add(i);
        }
        return aSet.toArray(new Integer[aSet.size()]);

    }
    public static void main(String[] args) {
        MergeSortGeek ob = new MergeSortGeek();
        Integer [] arr = new Integer[]{12, 3, 4, 4, 5, 6, 7, 8, 5, 54, 6};
        Integer [] noDulplictaesArr = removeDuplicates(arr);

        //converting array of Integers into arr of int
        int n = noDulplictaesArr.length;
        int[] arrInt = new int[n];
        for(int i= 0; i < n; i++){
            arrInt[i] = (int) noDulplictaesArr[i];
        }
        System.out.println("array without duplicates");
        for (int i = 0; i< n; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println("\narray sorted:\n");
        int [] sortedNumbers;
        sortedNumbers = ob.arrSorted(arrInt);
        System.out.println(Arrays.toString(sortedNumbers));


    }
    /*
    public void testArrayWithDuplicates() {
        Integer[] given = new Integer[] { 1, 2, 3, 3 };
        Integer[] actual = removeDuplicates(given);
        Integer[] expected = new Integer[] { 1, 2, 3 };
        }
        public void testArrayWithoutDuplicates() {
        Integer[] given = new Integer[] { 1, 2, 3 };
        Integer[] actual = removeDuplicates(given);
        Integer[] expected = new Integer[] { 1, 2, 3);
        }
        public void testWithEmptyArray() {
            Integer[] given = new Integer[] {};
            Integer[] actual = removeDuplicates(given);
            Integer[] expected = new Integer[] {};
        }
        public void testWithNull() {
            Integer[] given = null;
            Integer[] actual = removeDuplicates(given);
            Integer[] expected = null;
        }
        public void testArrayWithAllDuplicates() {
            Integer[] given = new Integer[] { 3, 3, 3 };
            Integer[] actual = removeDuplicates(given);
            Integer[] expected = new Integer[] { 3 };
        }
        public void testArrayWithMultipleDuplicates() {
            Integer[] given = new Integer[] { 1, 2, 3, 3, 4, 4, 5, 5, 5 };
            Integer[] actual = removeDuplicates(given);
            Integer[] expected = new Integer[] { 1, 2, 3, 4, 5 };
        }

     */

    }


