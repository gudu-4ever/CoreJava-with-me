import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int randomNumber = (int)(Math.random() * 100); 

        System.out.println("Guess the number between 0 and 99:");

        do {
            System.out.print("Enter your guess: ");
            userNumber = sc.nextInt();

            if (randomNumber == userNumber) {
                System.out.println("Congooo! You guessed it...");
                break;
            } else if (userNumber < randomNumber) {
                System.out.println("The number was too small...!!");
            } else {
                System.out.println("The number was too big....!");
            }
        } while (userNumber >= 0); 

        sc.close();
    }
}

