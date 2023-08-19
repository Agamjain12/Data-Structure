package DSA;
import java.util.Scanner;

public class LowerTriangularMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int size = n * (n + 1) / 2; // Total elements in lower triangular matrix
        int[] matrix = new int[size];

        System.out.println("Enter the elements of the lower triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                int element = scanner.nextInt();
                matrix[i * (i + 1) / 2 + j] = element;
            }
        }

        System.out.println("Lower Triangular Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(matrix[i * (i + 1) / 2 + j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
