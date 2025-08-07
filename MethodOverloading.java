package OOPS_JAVA;

class Person{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Binayak";
        p1.age=19;
        p1.printInfo(p1.age);
        p1.printInfo(p1.name);
        p1.printInfo(p1.name, p1.age);
    }
}