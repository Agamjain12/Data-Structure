package DSA;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));


    }

    public static int[] shuffle(int[] arr, int n) {

        int[] newarr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            newarr[2 * i] = arr[i];
            newarr[2 * i + 1] = arr[n + i];
        }
        return newarr;

    }
}