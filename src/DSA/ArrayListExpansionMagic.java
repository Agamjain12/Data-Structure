package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExpansionMagic {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        List<Integer> al = new ArrayList<>();
        int[] arr = new int[nums.length];
        // if index array has a repeating index, the element won't replace the already existing element
        // instead all the other elements will shift right by one to make space for new element, expansion
        // of list. load factor
        for(int i=0; i<nums.length; i++){
            al.add(index[i],nums[i]);
        }

        for(int i =0; i<al.size(); i++){
            arr[i] = al.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
