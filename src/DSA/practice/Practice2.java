package DSA.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//The function takes an integral arr which is of the size or length of its arguments.
//        Return the sum of the second-smallest element at odd position ‘arr’ and the second largest
//        element at the even position.
public class Practice2 {
    public static void main(String[] args) {
        int [] arr ={3, 2, 1, 7, 5, 4};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println(odd);
        System.out.println(even);

        System.out.println(odd.get(1)+even.get(even.size()-2));

    }
}
