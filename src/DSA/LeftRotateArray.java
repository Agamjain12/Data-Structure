package DSA;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] nums = new int[arr.length];
        int k =3;
        int ks = k%arr.length;
        for(int i =0; i<arr.length; i++){
           nums[i]= arr[(i+k)%arr.length];
        }

        System.out.println(Arrays.toString(nums));


    }
}
