package OOPS_JAVA;

class Shape{
    int area;
    public void area(){
        System.out.println("Print Area");
    }
}
class Square extends Shape{
    public void area(int side){
        System.out.println(side*side);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Square s1=new Square();
        s1.area(3);
        s1.area();
    }
}
