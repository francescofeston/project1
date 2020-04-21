import java.util.Scanner;
public class InsertionSortTest {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        //String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        //for (int i = 0; i < size; i++) {
         //   firstNames[i] = scanner.next().toLowerCase();
        //}
        for (int i = 0; i < size; i++) {
           lastNames[i] = scanner.next().toLowerCase();
        }
        String[] sortedNames = descendingSortName(lastNames);
        print(lastNames);
        }

        //Write your code here
        public static String[] sortName(String[] arr){
            String temp = "";
            int n = arr.length;
            for(int i = 0; i< n; i ++){
                for(int j =i + 1; j<n; j++){
                    if(arr[i].compareToIgnoreCase(arr[j])>0){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }

    public static String[] descendingSortName(String[] arr){
        String temp = "";
        int n = arr.length;
        for(int i = 0; i< n; i ++){
            for(int j =i + 1; j<n; j++){
                if(arr[i].compareToIgnoreCase(arr[j]) < 0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    static void print(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.println(arr[i]);
        }

    }
}
