package DSA;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 2, 2, 2};
        int val = 2;
        int i = 0;
        for (int j = 0; j <nums.length; j++){
            if(nums[j]!=val){
                int temp= nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }
}