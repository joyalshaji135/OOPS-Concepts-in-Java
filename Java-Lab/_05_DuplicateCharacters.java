import java.util.Scanner;

public class _05_DuplicateCharacters {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

       
        input = input.toLowerCase();

        
        int[] charCountArray = new int[128]; 

        
        char[] chars = input.toCharArray();

        
        for (char c : chars) {
            charCountArray[c]++;
        }

        
        System.out.println("Duplicate characters in the string:");
        boolean foundDuplicate = false;
        for (int i = 0; i < charCountArray.length; i++) {
            if (charCountArray[i] > 1) {
                System.out.println((char) i + " : " + charCountArray[i]);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }

        scanner.close();
    }
}
