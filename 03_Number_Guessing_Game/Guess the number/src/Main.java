import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // generates a random number between 1 and 100
        Random rand = new Random();
        int randNumber = rand.nextInt(100) + 1;
        int attempts = 5;
        int i, guess;

        // creates a new scanner
        Scanner sc = new Scanner(System.in);
        System.out.println(randNumber);

        System.out.println("Welcome to Number_Guessing_Game");


        for (i = 0; i < attempts; i++) {
            // asks the user for input and stores guess in a variable
            System.out.println("Guess a number between 1 and 100");

            guess = sc.nextInt();

            if (guess == randNumber) {
                System.out.println("You guessed the number correctly! " + guess);
                break;
            } else if (guess > randNumber && i != attempts -1) {
                System.out.println("You guessed the number incorrectly! " + guess);
                System.out.println("Your guess was to high, try again! ");
            } else if (guess < randNumber && i != attempts -1) {
                System.out.println("You guessed the number incorrectly! " + guess);
                System.out.println("Your guess was to low, try again! ");
            }


        }

        if (i == attempts) {
            System.out.println("You've used up all your attempts, better luck next time!");
            System.out.println("The correct number was: " + randNumber);
        }

    }
}