package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInAString {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        String s = "agamam";
        char[] ch = s.toCharArray();

        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> e : map.entrySet() ){
            System.out.println("character: "+e.getKey()+" frequency: "+e.getValue());
        }
    }
}
