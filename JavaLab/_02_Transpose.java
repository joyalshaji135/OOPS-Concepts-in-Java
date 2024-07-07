import java.util.Scanner;

class _02_Transpose {
    public static void main(String[] args) {

        int[][] matrix;
        int[][] transpose;
        int sum = 0, r, c;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        r = in.nextInt();

        System.out.print("Enter the Number of Columns : ");
        c = in.nextInt();

        if (r != c) {
            System.out.println("Only square matrix allowed.");
        } else {
            
            matrix = new int[r][c];
            transpose = new int[c][r];

            System.out.print("Enter the Elements of Matrix : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.println("\nGiven Matrix");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    transpose[j][i] = matrix[i][j];
                    if (i == j) {
                        sum = sum + (matrix[i][j]);
                    }
                }
            }

            System.out.println("\nThe Trace of the Given Matrix is = " + sum);
            System.out.println("\nTranspose Matrix");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
