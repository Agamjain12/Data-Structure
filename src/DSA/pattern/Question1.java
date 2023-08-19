package DSA.pattern;

public class Question1 {
    public static void main(String[] args) {
       pattern6(5);
    }


    static void pattern1(int n) {
        // no of lines = no. of rows, no. of times outer loop will run
        for(int row =1; row<=n; row++){
         // for every row, run the col
            // no. of elements in every column = index of row
            for(int col = 1; col<=row; col++){
                System.out.print(col);

            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row =0; row<n; row++ ){
            for (int col =0; col<=n-row; col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row =0; row<2*n; row++ ){
            int totalColInRow = row>n ? 2*n-row : row;
            for (int col =0; col<totalColInRow; col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalSpace = row < n ? n - row : row - n;
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalSpace; col++) {
                System.out.print(" ");
            }
             for (int col1 = 0; col1 < totalColInRow; col1++) {
                System.out.print("* ");
            }

          System.out.println();
       }
    }
    static void pattern6(int n){

        for(int row=1; row<=n; row++){

            for(int space =0; space<n-row; space++){
                System.out.print(" ");
            }

            for(int col = row; col>=1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col<=row; col++){
                System.out.print(col+ " ");
            }

            System.out.println();
        }

    }
}
