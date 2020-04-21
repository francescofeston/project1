import java.util.*;
public class IteratorUsage {
    List<Float> arr = new ArrayList<>();

    ListIterator ltr = arr.listIterator(arr.size());

    public static void main(String[] args) {
        /*
            List<Float> random = new ArrayList<Float>();
            random.add(2f);
            random.add(4f);
            random.add(5f);
            random.add(10f);
            random.add(99.9f);
            random.add(101f);

            //printList(random);
            printReverse(random);

         */
        }

        public static void printList(List<Float> arr) {
            for(Float num : arr) {
                System.out.println(num);
            }
        }
        public static void printReverse(List<Float> arr){
            ListIterator ltr = arr.listIterator(arr.size());
            while(ltr.hasPrevious()){
                System.out.println(ltr.previous());
            }
        }
        public static void printItemsAtEvenIndex(List<Float> arr) {
            ListIterator<Float> ltr = arr.listIterator();

            while (ltr.hasNext()){
                ltr.next();
                System.out.println(ltr.next());
                //if (ltr.hasNext()) {
                //}


            }
        }



            //int evenItem = ltr.nextIndex();
                //if(ltr.nextIndex()%2 == 0){


         public static void pickEvenItems(List<Float> al){ //GET AND PRINT EVEN ITEMS
             ListIterator ltr = al.listIterator();

             // checking the next element availabilty
             while (ltr.hasNext())
             {
                 //  moving cursor to next element
                 float i = (Float) ltr.next();

                 // getting even elements one by one
                 //System.out.print(i + " ");

                 // Changing even numbers to odd and
                 // adding modified number again in
                 // iterator
                 if (i%2!=0)
                 {
                     i++;  // Change to odd
                     ltr.set(i);  // set method to change value
                     //ltr.add(i);  // to add
                 }
             }
             System.out.println();
             System.out.println(al);
         }

         public static void evenIndex(List<Float> arr) {  //does not print anything
             ListIterator ltr = arr.listIterator(arr.size());
             while (ltr.hasNext()){
                 int index = 1;
             }
         }
         public static void printNextIndex(List<Float> arr){
             ListIterator ltr = arr.listIterator();

             System.out.println("Previous Index is : " + ltr.previousIndex());
             System.out.println("Next Index is : " + ltr.nextIndex());

             //advance current position by one using next method
             ltr.next();

             System.out.println("After increasing current position by one element : ");
             System.out.println("Previous Index is : " + ltr.previousIndex());
             System.out.println("Next Index is : " + ltr.nextIndex());

         }
}


