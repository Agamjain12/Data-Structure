package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the maximum sum
// contiguous subarray ending at current index and a variable max_so_far stores the maximum sum of
// contiguous subarray found so far, Everytime there is a positive-sum value in max_ending_here compare
// it with max_so_far and update max_so_far if it is greater than max_so_far.
//
//          So the main Intuition behind Kadane’s algorithm is,
//
//        – the subarray with negative sum is discarded (by assigning max_ending_here = 0 in code).
//
//        – we carry subarray till it gives positive sum.

//        Time Complexity: O(n)
//        Auxiliary Space: O(1)
//                Kadane’s Algorithm can be viewed both as greedy and DP. As we can see that we are keeping a running sum
//                of integers and when it becomes less than 0, we reset it to 0 (Greedy Part). This is
//                because continuing with a negative sum is way worse than restarting with a new range.
//                Now it can also be viewed as a DP, at each stage we have 2 choices: Either take the
//                current element and continue with the previous sum OR restart a new range. Both choices are
//                being taken care of in the implementation.
public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr= {-2, -3, 4, -1, -2, 1, 5, -3};

        int max_ending_here = Integer.MIN_VALUE, max_so_far = 0;

        for(int i=0; i<arr.length; i++){
            max_so_far+=arr[i];
            if(max_ending_here<max_so_far){
                max_ending_here=max_so_far;
            }
            if(max_so_far<0){
                max_so_far =0;
            }
        }
        System.out.println(max_ending_here);
   }
}
