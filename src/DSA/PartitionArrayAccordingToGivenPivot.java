package DSA;

import java.util.Arrays;

//put the element smaller than pivot element at the start of the array
//element bigger than pivot should be at end of the array
//element equals to pivot should be in the middle
//the relative order of the elements should be maintained after partitioning the array
public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums = {2,5,-1,3,9,8,5,1,-2};
        int pivot = 5;

        int[] result = new int[nums.length];
        int left =0, right = nums.length-1;

        for(int i =0; i< nums.length; i++){
            if(nums[i]<pivot){
                result[left++]=nums[i];
            }
            if(nums[nums.length-1-i]>pivot){
                result[right--]=nums[nums.length-1-i];
            }
        }

        while(left<=right){
            result[left++]=pivot;
            result[right--]=pivot;

        }

        System.out.println(Arrays.toString(result));
    }
}
