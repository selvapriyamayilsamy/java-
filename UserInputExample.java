import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Print using String.format
        String output = String.format("You entered: %s", userInput);
        System.out.println(output);

        // Close the scanner
        scanner.close();
    }
}
