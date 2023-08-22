package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysButFrequencyMaintained {
    public static void main(String[] args) {
        int [] nums1 = {2,4,5,4,5,8,10,11};
        int [] nums2 = {2,2,4,3,4,8,8};

        HashMap<Integer, Integer> agam = new HashMap<>();
        for(int i : nums1){
            agam.put(i, agam.getOrDefault(i,0)+1);
        }


        ArrayList<Integer> al = new ArrayList<>();


        for(int i : nums2){

            if(agam.get(i) != null && agam.get(i) > 0){
                al.add(i);
           // reducing frequency after adding it on list
                agam.put(i, agam.get(i) - 1);
            }
        }

        System.out.println(al);

        

    }
}
