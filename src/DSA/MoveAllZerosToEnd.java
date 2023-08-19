package DSA;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {3,4,32,0,34,0,34,34,0};
        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count++] =arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

}
