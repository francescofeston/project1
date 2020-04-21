import java.util.*;

//Write your code here
class Shape{
    int sidenum;

    public void sideDisplayer(){
        System.out.println("This shape is a circle");

    }
}
class Triangle extends Shape{
    int sidenum;
    @Override
    public void sideDisplayer(){
            //super.sideDisplayer();
            System.out.println("This shape is a triangle");
        }
    }

class Rect extends Shape{
    int sidenum;
    @Override
    public void sideDisplayer(){
            //super.sideDisplayer();
            System.out.println("This shape is a rectangle");
    }
}

public class ShapeSource {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rect();
        Shape ob3 = new Shape();
        int sidenum = in.nextInt();
        if(sidenum!=0 && sidenum!=3 && sidenum!=4) {
            System.out.println("Enter a valid number of sides!");
        }
        if(sidenum ==0){
                ob3.sideDisplayer();
        }
        else if(sidenum== 3){
                obj.sideDisplayer();
            }
        else if(sidenum == 4){
                obj1.sideDisplayer();
        }
    }
}


