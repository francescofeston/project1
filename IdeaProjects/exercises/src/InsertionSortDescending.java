import java.util.Scanner;

public class InsertionSortDescending {
    public static void main(String[] args) {
        //System.out.println("Enter the no. of elements :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        int[] arr = new int[n];
        //System.out.println("Enter the elements of the array :");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Insertion(arr);
        print(arr);

    }
    public static void Insertion(int[] arr){
        int n = arr.length;
        int v, j;
        for (int i=1; i<n; ++i){
            j = i;
            v = arr[j]; //keeps track of the jth element
            while(j >= 1 && arr[j-1] < v){  //if previous j-1 element < jth element ==> swap
                arr[j] = arr[j-1];
                j --;
            }
            arr[j] = v;

        }
    }

    static void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);

    }
}
