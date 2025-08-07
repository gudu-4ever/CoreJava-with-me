//Creating class and objects with some properties
package OOPS_JAVA;

class Student{
    String name;
    int age;
    public void getInfo(){
        System.out.println("The name the student is:-"+ this.name);
        System.out.println("The age of the student is:-"+ this.age);
    }
}
public class Oops{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Binayak";
        s1.age=19;
        s1.getInfo();
        Student s2=new Student();
        s2.name="Bigya";
        s2.age=20;
        s2.getInfo();
    }        
}
