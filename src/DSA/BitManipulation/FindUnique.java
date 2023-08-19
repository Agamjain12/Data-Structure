package DSA.BitManipulation;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr ={2,2,3,4,4,5,6,6,5};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique=0;
        for(int n : arr){
            //bitwise operators also follows associative proper 2^3^5 = 2^5^3
            unique^= n;

        }
        return unique;

    }

}
