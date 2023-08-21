package DSA;


import java.util.*;


public class temo {


    public static void main(String[] args) {

        int [] nums1 = {2,4,5,4,5,8,10,11};
        int [] nums2 = {2,2,4,3,4,8,8};

        Set<Integer> agam = new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    agam.add(nums1[i]);
                    break;
                }

            }
        }
         int[] newarr = new int[agam.size()];
        for(int i =0; i< newarr.length; i++){
            newarr[i] = (int) agam.toArray()[i];
        }

    }
}




