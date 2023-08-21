package DSA;

import java.net.Inet4Address;
import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {2,4,5,4,5,8};
        int [] arr2 = {2,2,4,3,4};


        HashMap<Integer,Integer> agam = new HashMap<>();
        HashMap<Integer,Integer> simo = new HashMap<>();

        for(int i : arr1){
            agam.put(i,agam.getOrDefault(i,0)+1);
        }

        for(int i : arr2){
            simo.put(i,simo.getOrDefault(i,0)+1);
        }

        Set<Integer> large = agam.keySet().size() >= simo.keySet().size() ? agam.keySet() : simo.keySet();
        Object[] small = agam.keySet().size() <= simo.keySet().size() ? agam.keySet().toArray() : simo.keySet().toArray();

        System.out.println(small[1]);
        int count=0;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i =0; i<small.length; i++){
            if(large.contains(small[i])){
                li.add((Integer) small[i]);
            }

        }
        System.out.println(Arrays.toString(li.toArray()));
    }
}
