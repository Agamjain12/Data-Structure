package DSA.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums={3,2,1,43,5,76,3,4,5,0};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    public static int[] mergeSort(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int mid = nums.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length+ right.length];
        int i=0, j=0, k=0;

        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                merge[k++]=left[i++];
            }
            else{
                merge[k++]=right[j++];
            }
        }

        //it might be possible that one of the array is not empty
        //so add the remaining element
        while(i< left.length){
            merge[k++]=left[i++];
        }

        while(j< right.length){
            merge[k++]=right[j++];
        }

        return merge;

    }
}
