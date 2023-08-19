package DSA.HashMap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,3,5};
        System.out.println(duplicate(arr));
    }
    public static ArrayList<Integer> duplicate(int[] arr){
        Map<Integer,Integer> agam = new HashMap<>();

        for(int i: arr){
            agam.put(i, agam.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> li = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e : agam.entrySet()){
            //if frequency is more than one
            if(e.getValue()>1){
                li.add(e.getKey());
            }

        }
        Collections.sort(li);

        if(li.size()>0){
            return li;
        }
        else { li.add(-1);
            return li; }

    }
    }

