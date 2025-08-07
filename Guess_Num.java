import java.util.*;

public class Guess_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);
        int userNum;
        do {
            System.out.println("Enter a Number between (1-100):-");
            userNum = sc.nextInt();

            if (userNum == randomNum) {
                System.out.println("Wowww You Guessed it.....Congooo....");
                break;
            } else if (userNum < randomNum) {
                System.out.println("Your Number is too small....!");
            } else if (userNum > randomNum) {
                System.out.println("Your number was too big.....!");
            }
        } while (userNum >= 0);

    }
}
