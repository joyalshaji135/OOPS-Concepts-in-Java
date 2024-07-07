

import java.util.Scanner;

public class _01_Odd_Position {

    public static void main(String[] args) {
        System.out.println("Enter the Elements in an Array :");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Elements of given array present on odd position :");
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 1) {
                System.out.print(" "+array[i]);
            }
        }

    }
    
}