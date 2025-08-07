package OOPS_JAVA;

class Vehicle {
    String company;
    String name;

    public Vehicle() {
        // Default constructor
    }

    public Vehicle(Vehicle v2) {
        this.company = v2.company;
        this.name = v2.name;
    }

    public void Catalog() {
        System.out.println(this.company);
        System.out.println(this.name);
    }
}

public class Constructors_3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.company = "BMW";
        v1.name = "m5-Competition";

        Vehicle v2 = new Vehicle(v1);
        v2.Catalog();
    }
}
