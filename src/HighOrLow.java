import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        // Generate a random number between 1 and 10
        int randomNum = generator.nextInt(10) + 1;

        // Initialize user's guess
        int userGuess = 0;

        do {
            // Prompt the user to guess the number
            System.out.print("Guess the number (between 1 and 10): ");

            // Check if the input is an integer
            if (in.hasNextInt()) {
                // Read the user's guess
                userGuess = in.nextInt();

                // Compare the user's guess with the random number
                if (userGuess == randomNum) {
                    System.out.println("Congratulations! Your guess is correct!");
                } else if (userGuess < randomNum) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }


                // Display the random number
                System.out.println("The random number was: " + randomNum);

            }

        } while (userGuess != randomNum);
    }
}