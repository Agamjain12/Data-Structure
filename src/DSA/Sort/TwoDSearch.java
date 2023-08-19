package DSA.Sort;

import java.util.Arrays;

public class TwoDSearch {
    public static void main(String[] args) {


        int[][] nums = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}


        };
    int target = 5;
    int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] nums, int target) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (target == nums[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}