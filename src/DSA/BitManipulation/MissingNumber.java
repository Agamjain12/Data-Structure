package DSA.BitManipulation;

public class MissingNumber {
    public static void main(String[] args) {
        //for size n, check which number from 0-n is missing in array.
        int[] nums = {1,2,3,0};
        //for example 4 is missing here
        int missing = nums.length;
        for (int i = 0; i< nums.length; i++){
            missing ^= i;
            missing ^= nums[i];

        }
        System.out.println(missing);
    }
}