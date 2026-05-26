import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        // Fixed number for same output every time
        int secretNumber = 50;

        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("=================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println();

        // Loop until correct guess
        while (true) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            // Conditions
            if (guess < secretNumber) {

                System.out.println("Too Low! Try Again.");

            } else if (guess > secretNumber) {

                System.out.println("Too High! Try Again.");

            } else {

                System.out.println("Correct Guess!");
                break;
            }

            System.out.println("Attempts so far: " + attempts);
            System.out.println("---------------------------------");
        }

        // Final Output
        System.out.println();
        System.out.println("=================================");
        System.out.println("Congratulations!");
        System.out.println("You guessed the number.");
        System.out.println("Secret Number : " + secretNumber);
        System.out.println("Total Attempts: " + attempts);
        System.out.println("=================================");

        scanner.close();
    }
}
