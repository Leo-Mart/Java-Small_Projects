import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // asks user for input
        System.out.println("Enter a string for reversing: ");

        // creates a new scanner object so read the users input and stores it in a variable
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // reverse the string
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        // prints the new string
        System.out.println(reverse);

    }
}