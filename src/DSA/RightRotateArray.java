package DSA;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =2;
        for(int i=0; i<arr.length; i++){
            if(i<k)
            System.out.print(arr[arr.length+i-k]+" ");
            else{
                System.out.print(arr[i-k]+" ");
            }
        }
    }
}
