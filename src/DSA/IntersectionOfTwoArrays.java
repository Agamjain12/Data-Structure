package DSA;


import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int [] nums1 = {2,4,5,4,5,8,10,11};
        int [] nums2 = {2,2,4,3,4,8,8};



        HashMap<Integer,Integer> agam = new HashMap<>();
        HashMap<Integer,Integer> simo = new HashMap<>();

        for(int i : nums1){
            agam.put(i,agam.getOrDefault(i,0)+1);
        }

        for(int i : nums2){
            simo.put(i,simo.getOrDefault(i,0)+1);
        }

        Object[] small;
        Set<Integer> large;
        ArrayList<Integer> li = new ArrayList<>();
       if(agam.keySet().size()==simo.keySet().size()){
           small = agam.keySet().toArray();
           large = simo.keySet();

           for(int i =0; i<small.length; i++){
               if(large.contains(small[i])){
                   li.add((Integer) small[i]);
               }

           }
       }

       else{
            large = agam.keySet().size() > simo.keySet().size() ? agam.keySet() : simo.keySet();
            small = agam.keySet().size() < simo.keySet().size() ? agam.keySet().toArray() : simo.keySet().toArray();

           for(int i =0; i<small.length; i++){
               if(large.contains(small[i])){
                   li.add((Integer) small[i]);
               }

           }

       }



        System.out.println(Arrays.toString(li.toArray()));



                            // second method



        Set<Integer> man = new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    man.add(nums1[i]);
                    break;
                }

            }
        }

        int[] newarr = new int[man.size()];
        for(int i =0; i< newarr.length; i++){
            newarr[i] = (int) man.toArray()[i];
        }


        System.out.println(Arrays.toString(newarr));
    }
}
