import java.util.Scanner;

public class _06_WordCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.trim().split("\\s+");

        // Count the number of words
        int wordCount = words.length;

        // Print the word count
        System.out.println("Number of words in the string: " + wordCount);

        // Close the scanner
        scanner.close();
    }
}
