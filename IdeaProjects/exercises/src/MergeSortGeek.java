import java.util.Arrays;

public class MergeSortGeek {
    /* Java program for Merge Sort */

        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
       static void merge(int arr[], int l, int m, int r)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            /* Create temp arrays */
            int L[] = new int [n1]; //store left subarray
            int R[] = new int [n2];

            /*Copy data to temp arrays*/
            for (int i=0; i<n1; ++i) //populate left array starting from zero to left length which is middle-start + 1
                L[i] = arr[l + i];
            for (int j=0; j<n2; ++j)
                R[j] = arr[m + 1+ j];


            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarry array
            int k = l;
            while (i < n1 && j < n2) //merging process => while i < length of left subarray
            {
                if (L[i] >= R[j])
                {
                    arr[k] = L[i]; //copy the value of the greater element which is L[i[ into arr[k]
                    i++; // increment the i pointer
                }
                else       // if the opposite is true and => R[j] > L[i]
                {
                    arr[k] = R[j];
                    j++;
                }
                k++; //after if-else is over increment k pointer
            }

            /* Copy remaining elements of L[] if any */ //if right subarray is over (no more items)
            while (i < n1)
            {
                arr[k] = L[i]; //COPY ALL THE REMAINING L[i] elements into the arr[k]
                i++;
                k++;
            }

            /* Copy remaining elements of R[] if any */
            while (j < n2)
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using
        // merge()
        static int[] sort(int arr[], int l, int r) //l = starting index; r = ending index
        {
            if (l < r) //if start < end
            {
                // Find the middle point
                int m = (l+r)/2;

                // Sort first and second halves
                sort(arr, l, m);
                sort(arr , m+1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
            return arr;
        }
        public static int[] arrSorted(int[] arr){
            return sort(arr, 0, arr.length-1);
        }

        /* A utility function to print array of size n */
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver method
        public static void main(String args[])
        {
            int arr[] = {12, 11, 13, 5, 6, 7};

            System.out.println("Given Array");
            printArray(arr);

           // MergeSortGeek ob = new MergeSortGeek();
            //ob.sort(arr, 0, arr.length-1);

            System.out.println("\nSorted array");
            int [] sortedNumbers;
            sortedNumbers = arrSorted(arr);
            System.out.println(Arrays.toString(sortedNumbers));
            //printArray(arr);
        }
    }
    /* This code is contributed by Rajat Mishra */

