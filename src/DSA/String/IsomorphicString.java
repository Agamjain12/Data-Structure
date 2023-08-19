package DSA.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "paper";
        String p = "title";

                             // Approach 1 : fails a testcase

//        Map<Character,Integer> map1 = new HashMap<>();
//        Map<Character,Integer> map2 = new HashMap<>();
//
//        for(int i=0; i<s.length(); i++){
//            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(int i=0; i<p.length(); i++){
//            map2.put(p.charAt(i),map2.getOrDefault(p.charAt(i),0)+1);
//        }
//        HashSet<Integer> h1 = new HashSet<>(map1.values());
//        HashSet<Integer> h2 = new HashSet<>(map2.values());
//
//        System.out.println(h1.equals(h2));


                            // Approach 2 : fails a testcase
        System.out.println(isIsomorphic(s,p));

    }
    public static boolean isIsomorphic(String s,String p){
        int[] arr1 = new int[200];
        int[] arr2 = new int[200];



        for(int i=0; i<s.length(); i++){
            if(arr1[s.charAt(i)]!=arr2[p.charAt(i)]){
                return false;
            }
            else {
                arr1[s.charAt(i)] = i + 1;
                arr2[p.charAt(i)] = i + 1;
            }
        }
        return true;
    }
}
