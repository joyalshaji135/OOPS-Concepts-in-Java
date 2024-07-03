import java.util.Scanner;


class ZeroAgeException extends Exception {
    public ZeroAgeException(String message) {
        super(message);
    }
}

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

class InvalidProductIdException extends Exception {
    public InvalidProductIdException(String message) {
        super(message);
    }
}

public class _10_ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        try {
            System.out.println("Enter an index to access (0-2):");
            int index = scanner.nextInt();
            int[] array = {1, 2, 3};
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        
        try {
            System.out.println("Enter a number:");
            String numberStr = scanner.next();
            int number = Integer.parseInt(numberStr);
            System.out.println("You entered number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        
        try {
            System.out.println("Enter numerator:");
            int numerator = scanner.nextInt();
            System.out.println("Enter denominator:");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        
        try {
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (ZeroAgeException | NegativeAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            System.out.println("Enter product ID:");
            int productId = scanner.nextInt();
            validateProductId(productId);
        } catch (InvalidProductIdException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }

    
    public static void validateAge(int age) throws ZeroAgeException, NegativeAgeException {
        if (age == 0) {
            throw new ZeroAgeException("Age cannot be zero.");
        } else if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
    }

    
    public static void validateProductId(int productId) throws InvalidProductIdException {
        if (productId <= 0) {
            throw new InvalidProductIdException("Product ID must be positive and greater than zero.");
        }
    }
}


// Output

// Enter an index to access (0-2):
// 5
// Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

// Enter a number:
// abc
// Caught NumberFormatException: For input string: "abc"

// Enter numerator:
// 10
// Enter denominator:
// 0
// Caught ArithmeticException: / by zero

// Enter age:
// -5
// Caught custom exception: Age cannot be negative.

// Enter product ID:
// 0
// Caught custom exception: Product ID must be positive and greater than zero.
