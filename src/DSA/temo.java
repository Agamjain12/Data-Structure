package DSA;


import java.util.*;


public class temo {
    public static void main(String[] args) {
        int[] nums = {5,7,9,2,2,0,0,0,0,4,4};
        Map<Integer,Integer> agam = new HashMap<>();
        for(int i: nums){
            if(i%2==0) {
                agam.put(i, agam.getOrDefault(i, 0) + 1);
            }
        }


        int max =0;
        int yerr=0;
        for(Map.Entry<Integer,Integer> map: agam.entrySet()) {
            if (map.getValue() >max) {

               yerr = map.getKey();
               max = map.getValue();
            }
            else if (map.getValue()==max) {
                yerr = Integer.min(yerr,map.getKey());
                max = map.getValue();
            }
        }
        System.out.println(yerr);

    }
}




