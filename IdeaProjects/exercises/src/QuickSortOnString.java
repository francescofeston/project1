import java.util.*;
public class QuickSortOnString {
        String names[];
        int length;

        public static void main(String[] args) {
            QuickSortOnString sorter = new QuickSortOnString();
            //String words[] = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"}; // the strings need to be sorted are put inside this array
            String words[] = {"maat", "zen", "deer", "john", "grace", "puff"};
            sorter.sort(words);
            //sorter.compare(words);

            for (String i : words) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("\nSorted by size");
            sortByLength sbl = new sortByLength();
            Arrays.sort(words, sbl);

            for(int i =0; i < words.length; i++){
                System.out.print(words[i] + " ");
            }

        }

        void sort(String array[]) {
            if (array == null || array.length == 0) {
                return;
            }
            this.names = array;
            this.length = array.length;
            quickSort(0, length - 1);
        }

        void quickSort(int lowerIndex, int higherIndex) {
            int i = lowerIndex;
            int j = higherIndex;
            String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

            while (i <= j) {
                while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                    i++;
                }

                while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                    j--;
                }

                if (i <= j) {
                    exchangeNames(i, j);
                    i++;
                    j--;
                }
            }
            //call quickSort recursively
            if (lowerIndex < j) {
                quickSort(lowerIndex, j);
            }
            if (i < higherIndex) {
                quickSort(i, higherIndex);
            }
        }

        void exchangeNames(int i, int j) {
            String temp = this.names[i];
            this.names[i] = this.names[j];
            this.names[j] = temp;
        }
static class sortByLength implements Comparator<String> {
            public int compare (String o1, String o2){
            return o1.length() - o2.length();
        }
    }




}


