//Method Overloading

package OOPS_JAVA;


class Rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
 
     }
    public void printArea(){
        System.out.println(this.length*this.breadth);
    }
    public void printArea(int length,int breadth){
        System.out.println(this.length*this.breadth);
    }
    public void printPerimeter(){
        System.out.println(2*(this.length+this.breadth));
    }

    public void printPerimeter(int length,int breadth){
        System.out.println(2*(this.length+this.breadth));
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(95, 78);
        r1.printPerimeter();
        r1.printArea();

    }
}
