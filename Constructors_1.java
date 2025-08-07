//Non-Paramatrized Constructors
package OOPS_JAVA;

class Car{
    String name;
    String type;
    int model_year;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.model_year);
    }
    Car(){
        System.out.println("We are creating a Car...");
    }

}

public class Constructors_1 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="M3-Competiton";
        c1.type="Racing";
        c1.model_year=2020;
        c1.printInfo();
    }
}
