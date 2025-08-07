//Paramatrized Constructor
package OOPS_JAVA;

class My_data{
    String name;
    int age;
    String occupation;
    String address;

    public void printData(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.occupation);
        System.out.println(this.address);
    }
    My_data(String name,int age,String occupation,String address){
        this.name=name;
        this.age=age;
        this.occupation=occupation;
        this.address=address;
    }
}
public class Constructors_2 {
    public static void main(String[] args) {
        My_data d1=new My_data("Binayak", 19, "Student","Paradeep");
        d1.printData();
    }
}
