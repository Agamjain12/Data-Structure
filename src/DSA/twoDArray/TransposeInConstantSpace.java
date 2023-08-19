package DSA.twoDArray;

import java.util.Arrays;

//constant space won't work for non-square matrix, it'll only work for square matrix
public class TransposeInConstantSpace {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}
                     ,{4,5,6},
                      {7,8,9}};

        int row = 3;
        int col =2;

        for(int i =0; i<col; i++){
            for(int j =i; j<row; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] art : arr){
            System.out.println(Arrays.toString(art));
        }
    }
}
