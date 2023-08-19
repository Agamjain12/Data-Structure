package DSA;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenSorting {
    public static void main(String[] args) {
        int [] nums = {2,4,5,3,9,7,5,6,8,};

        int p1 =0;
        int p2 = nums.length-1;
        while(p1<p2){
            while(p1%2==0 && p1<p2){
                p1++;
            }
            while(p1%2!=0 && p1<p2){
                p2--;
            }
            if(p1<p2){
                int temp = nums[p1];
                nums[p1] =nums[p2];
                nums[p2] =temp;
                p1++;
                p2--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
