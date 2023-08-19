package DSA.twoDArray;

import java.util.Arrays;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}
                ,{4,5,6,5},
                {7,8,9,5},
                {10,11,12,13}};

        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                if(i>j){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int[] arr : matrix) System.out.println(Arrays.toString(arr));
    }
}
