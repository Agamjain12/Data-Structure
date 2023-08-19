package DSA;

import java.util.Scanner;

public class Simulate2DArrayUsing1DArray {

    public static void main(String[] args) {

        int row = 3;
        int col = 4;
        int[] arr = TwoDArray(row, col);
        display(arr, row, col);
    }


    private static int[] TwoDArray(int rows, int col) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[rows * col];


//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i * col + j] = sc.nextInt();
//            }
//        }
        for(int i=0; i<rows*col; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }


    private static void display(int[] arr, int rows, int col) {
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i * col + j] + " ");
            }
            System.out.println();

        }
    }
}

