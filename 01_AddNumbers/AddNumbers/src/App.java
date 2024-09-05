import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

              // ask the user for two numbers
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int number1 = readInput.nextInt();
        int number2 = readInput.nextInt();
        readInput.close();

        System.out.println("The sum of your numbers are: " + Integer.sum(number1, number2));
        

    }
}
