public class TryCatch {

    public static void main(String[] args) {
        String [] names={"Binayak","Gudu","Sanu"};
        
        try{
            System.out.println(names[3]);
        }catch(Exception e){
            System.out.println("Out of bound");
        }
        System.out.println("Binayak");
        
    }
}
