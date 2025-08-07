package OOPS_JAVA;

interface GrandParents {
    void quality();
    void wealth();
}

abstract class Parents implements GrandParents {
    public void quality() {
        System.out.println("Qualities inherited from GrandParents...");
    }
   
}


class Child extends Parents {
    public void quality(){
        System.out.println("Inherited by Grandparents");
    }
    public void wealth() {
        System.out.println("Child gets wealth from GrandParents...");
    }
}

public class multiple_in {
    public static void main(String[] args) {
        Child child = new Child();
        child.quality(); 
        child.wealth();
        
    }
}
