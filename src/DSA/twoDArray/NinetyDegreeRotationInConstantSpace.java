package DSA.twoDArray;

import java.util.Arrays;

//reverse of transpose of a matrix is 90-degree rotation
public class NinetyDegreeRotationInConstantSpace {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}
                ,{4,5,6},
                {7,8,9}};

        int row = 3;
        int col =3;
        for(int i =0; i<col; i++){
            for(int j =i; j<row; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reversing the transposed array
      for(int i =0; i<row; i++){
          reverseArray(arr[i]);
      }
        for(int[] art : arr){
            System.out.println(Arrays.toString(art));
        }

    }
    public static void reverseArray(int[] arr){
       int i =0, j = arr.length-1;
       while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
}
