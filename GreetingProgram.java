import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the input (name) provided by the user
        String name = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Print a greeting message with the user's name
        System.out.println("Hello, " + name + "! Welcome to the Java world!");
    }
}
