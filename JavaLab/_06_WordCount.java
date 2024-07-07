import java.util.Scanner;

public class _06_WordCount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        int wordCount = words.length;

        System.out.println("Number of words in the string: " + wordCount);

        scanner.close();
    }
}
