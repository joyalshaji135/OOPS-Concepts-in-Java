import java.util.Scanner;

public class _07_StringHandling {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        System.out.println("Length of first string: " + str1.length());
        System.out.println("Length of second string: " + str2.length());
 
        String concatenatedString = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);
      
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the two strings equal? " + areEqual);
     
        if (str1.length() > 2) {
            String substring = str1.substring(1, 3);
            System.out.println("Substring of the first string (from index 1 to 3): " + substring);
        } else {
            System.out.println("First string is too short to extract a substring from index 1 to 3.");
        }
  
        String replacedString = str1.replace('a', 'x');
        System.out.println("First string after replacing 'a' with 'x': " + replacedString);
  
        System.out.println("First string in uppercase: " + str1.toUpperCase());
        System.out.println("Second string in lowercase: " + str2.toLowerCase());

        System.out.println("Index of 'a' in the first string: " + str1.indexOf('a'));

        scanner.close();
    }
}
