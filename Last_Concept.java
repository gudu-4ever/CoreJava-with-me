package OOPS_JAVA;
class Floks{
    String name;
    static String address;

    public void changeAddress(){
        address="Janani Vihar";
    }
}
public class Last_Concept{
    public static void main(String[] args) {
        Floks.address="Kolathia";
        Floks f1=new Floks();
        Floks f2=new Floks();
        System.out.println(f1.address);
        System.out.println(f2.address);
        System.out.println(Floks.address);
        f1.changeAddress();
        System.out.println(f1.address);
        System.out.println(f2.address);
        System.out.println(Floks.address);

        
        
    }
}
