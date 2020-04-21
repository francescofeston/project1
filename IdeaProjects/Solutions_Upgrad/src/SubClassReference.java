import java.util.ArrayList;
public class SubClassReference {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList(2);

        // adding String objects to al
        al.add(new String("GeeksForGeeks"));
        al.add(new String("for java archives"));


        // getting  elements using String reference
        String str1 = (String)al.get(0);
        String str2 = (String)al.get(1);

        System.out.println(str1);
        System.out.println(str2);

        // using String class specific method
        System.out.println(str1.length());
        System.out.println(str2.substring(4,8));
    }
}

