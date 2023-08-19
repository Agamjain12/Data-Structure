package DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("original array: "+ Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
        System.out.println("reversed array: "+ Arrays.toString(arr));



    }
        static void swap(int[] arr, int start, int end){
             int temp;
             temp = arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
        }

}
