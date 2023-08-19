package DSA.twoDArray;

public class NinetyDegreeRotationInConstantSpace2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}
                ,{4,5,6},
                {7,8,9}};
        int col = matrix[0].length;
        for(int i =0; i<col; i++){
            for(int j =i; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}