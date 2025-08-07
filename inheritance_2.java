package OOPS_JAVA;
class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}
class Triangle extends Shape{
    public void area(int h,int b){
        System.out.println(0.5*h*b);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(2*3.14*r);
    }
}
public class inheritance_2 {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area();
        t1.area(12, 23);
        Circle c1=new Circle();
        c1.area();
        c1.area(12);
    }
}





