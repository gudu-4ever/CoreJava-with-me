//Creating class and Object and give properties
package OOPS_JAVA;

class Pen{
    String color;
    public void printColor(){
        System.out.println("Color of your pen is :-"+ this.color);
    }
}
public class Oops_ex2 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="Blue";
        Pen p2=new Pen();
        p2.color="Black";
        Pen p3=new Pen();
        p3.color="Red";

        p1.printColor();
        p2.printColor();
        p3.printColor();

    }
}
