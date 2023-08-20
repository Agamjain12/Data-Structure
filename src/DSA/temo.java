package DSA;


import java.util.*;


public class temo {


    public static void main(String[] args) {
        int[] nums = {5,7,9,2,2,0,0,0,0,4,4};
        Arrays.sort(nums);
        Map<Integer,Integer> agam = new HashMap<>();
        List<Integer> al = new ArrayList<>();

        for(int i : nums){
            agam.put(i,agam.getOrDefault(i,0)+1);
        }

            for(Map.Entry<Integer,Integer> e : agam.entrySet()){
//                for(int i=0; i<agam.get(e.getKey()); i++){
//                    al.add(e.getKey());
                System.out.println("element: "+ e.getKey()+" frequency: "+e.getValue());
//                }
            }
//        System.out.println(al);
    }
}




