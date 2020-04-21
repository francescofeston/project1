    /*1) Create a class with a method that prints "This is parent class" and its subclass with another method that prints
    "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

2) In the above example, declare the method of the parent class as private and
then repeat the first two operations (You will get error in the third).

}
*/
    class SuperClass{
        void printingMethod(){
            System.out.println("This is parent class");
        }
    }

    class SubClass extends SuperClass{
        void printingMethodSub(){
            System.out.println("This is child class");
        }
    }
    public class ExerciseTest {
        public static void main(String[] args){
        SuperClass s1 = new SuperClass();
        SubClass s2 = new SubClass();
        s1.printingMethod();
        s2.printingMethod();
        s2.printingMethodSub();
    }
}
