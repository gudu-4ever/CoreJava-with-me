import java.util.Scanner;

public class Switch_cse {
    public static void main(String[] args) {
        System.out.println("Enter The DayNumber(1-7):-");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            default:
            System.out.println("Yuff Sunday.....Holiday....");
        }
    }
}
