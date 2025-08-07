package OOPS_JAVA;
abstract class Animal{
  abstract  void walk();

  void breathe(){
    System.out.println("Animal Breathes");
  }
  Animal(){
    System.out.println("You are created an Animal...");
  }

}
class Horse extends Animal{
    Horse(){
        System.out.println("You are created a Horse...");
    }
    void walk(){
        System.out.println("Horse walks on 2 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("You are created a horse");
    }
    void walk(){
        System.out.println("Hen walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.breathe();
        h1.walk();
        Chicken c1=new Chicken();
        c1.breathe();
        c1.walk();
    }
}
