import java.util.ArrayList;
public class SuperClassReference {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList(2);

        // adding String object to al
        al.add(new String("GeeksForGeeks"));

        // adding Integer object to al
        al.add(new Integer(5));

        // getting all elements using Object reference
        for (Object object : al)
        {
            System.out.println(object);
        }
    }
}
