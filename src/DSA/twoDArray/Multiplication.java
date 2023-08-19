package DSA.twoDArray;

import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        int[][] arr = {{1,2}
                ,{4,5},
                {7,8}};
        int [][] nums = {{1,2,3},
                        {4,5,6}};
        int r1 = 3;
        int c1 = 2;
        int r2 = 2;
        int c2 = 3;

        int[][]result = new int[r1][c2];


        // c1 and r2 should be same for matrix multiplication. resultant matrix will be r1 x c2
        for(int row=0; row<r1; row++){
            for(int col =0; col<c2; col++){
                for(int k =0; k<c1; k++){
                    result[row][col]+= arr[row][k] * nums[k][col];
                }
            }
        }

        for(int[] art : result){
            System.out.println(Arrays.toString(art));
        }

    }
}
