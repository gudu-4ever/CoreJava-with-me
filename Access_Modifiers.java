package OOPS_JAVA;
class Account{
    public String name;
    protected String email;
    private String password;

    public void Details(){
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.password);
    }
    public void setPassword(String password){
        this.password=password;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Binayak";
        a1.email="sahoobinayak493@gmail.com";
        a1.setPassword("Nothing");
        a1.Details();
    }
}
