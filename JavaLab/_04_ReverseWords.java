import java.util.Scanner;

public class _04_ReverseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        
        String result = reverseWordsInString(input);

        
        System.out.println("Reversed words in the string:");
        System.out.println(result);

       
        scanner.close();
    }

    
    public static String reverseWordsInString(String input) {
        
        String[] words = input.split("\\s+");

        
        StringBuilder result = new StringBuilder();

       
        for (String word : words) {
            
            String reversedWord = new StringBuilder(word).reverse().toString();

            
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }
}
