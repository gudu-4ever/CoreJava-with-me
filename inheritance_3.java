package OOPS_JAVA;

class Shape {
    public void area() {
        System.out.println("Displays Area....");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println("Area of Triangle: " + (0.5 * h * b));
    }
}

class Equilateral extends Triangle {
    public void area(int a) {
        System.out.println("Area of Equilateral Triangle: " + ((Math.sqrt(3) / 4) * a * a));
    }
}

public class inheritance_3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(7, 3);              
        Equilateral et1 = new Equilateral();
        et1.area(4);                 
    }
}
