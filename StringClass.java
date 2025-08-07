public class StringClass {
    public static void main(String[] args) {
        String First_name="Binayak";
        String Surname="Sahoo";
        String FullName=First_name+" "+Surname;
        System.out.println(FullName);
        System.out.println(First_name.charAt(1));
        System.out.println(Surname.length());
        System.out.println(First_name.replace("Binayak","Sahoo"));
        System.out.println(Surname.substring(0,4));


        System.out.println(FullName.substring(First_name.length(),13));
    }
}
