package DSA;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] num = {1,2,2,3,3,3,3,2};
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        System.out.println("majority element using first method: "+major);

                               //second method using hashmap

        Map<Integer,Integer> agam = new HashMap<>();

        for(int i: num){
            agam.put(i,agam.getOrDefault(i,0)+1);
        }

//       for(Map.Entry<Integer,Integer> e : agam.entrySet()){
//           if(e.getValue()>num.length/2){
//               System.out.println("majority element is(using hashmap): " + e.getValue());
//           }
//
//       }

        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> map: agam.entrySet()){
           if (map.getValue()>max){
                max = map.getKey();

            }
        }


        System.out.println("majority element is(using hashmap): " + max);



    }
}
