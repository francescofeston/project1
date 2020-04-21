import java.util.Scanner;

public class CheckDuplicatesNarashima {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        int arraySize = s.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("enter the values of the array");
        for(int i = 0; i< arraySize; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(CheckDuplicatesInArray(arr,arraySize));

    }

    public static boolean CheckDuplicatesInArray(int[] a, int n){ //SPACE COMPLEXITY O(1); TIME COMPLEXITY O(N^2)
        for(int i = 0; i < n; i++){
            for(int j = i +1; j< n; j++){
                if(a[i] == a[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
