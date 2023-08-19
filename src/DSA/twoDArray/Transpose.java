package DSA.twoDArray;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2}
                     ,{4,5},
                      {7,8}};
        int row = 3;
        int col =2;

        int[][] arrT = new int[col][row];

        for(int i =0; i<col; i++){
            for(int j =0; j<row; j++){

                arrT[i][j] = arr[j][i];

            }

        }
        for(int[] ast: arrT){
            System.out.println(Arrays.toString(ast));
        }
    }
}
