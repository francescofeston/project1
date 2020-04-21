public class compareToMethodString {
    // Java code to demonstrate the
// working of compareTo()
        public static void main(String args[])
        {

            // Initializing Strings
            String str1 = "geeksforgeeks";
            String str2 = new String("geeksforgeeks");
            String str3 = new String("astha");
            String str4 = "hi";

            // Checking if geeksforgeeks string
            // equates to geeksforgeeks object
            //System.out.print("Difference of geeksforgeeks(obj) and geeksforgeeks(str) : ");
            //System.out.println(str1.compareTo(str2));

            // Checking if geeksforgeeks string
            // equates to astha object
            //System.out.print("Difference of astha(obj) and geeksforgeeks(str) : ");
            //System.out.println(str1.compareTo(str3));
            //System.out.println("\n" + str4.compareTo(str3));
            String s1="hello";
            String s2="hello";
            String s3="meklo";
            String s4="hemlo";
            String s5="flag";
            System.out.println(s1.compareTo(s2));//0 because both are equal
            System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
            System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
            System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
        }
    }


