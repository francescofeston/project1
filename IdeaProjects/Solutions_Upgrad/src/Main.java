import java.util.*;

public class Main<random> {
    public static void main(String[] args){
        IteratorUsage ltr = new IteratorUsage();
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);


        //printList(random);
        //ltr.printReverse(random);
        //ltr.pickEvenItems(random);
        //ltr.evenIndex(random);
        ltr.printItemsAtEvenIndex(random);


    }
}
