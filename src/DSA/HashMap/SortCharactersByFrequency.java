package DSA.HashMap;

import java.util.HashMap;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "sssaaaartdfpaaadf";

        HashMap<Character,Integer> agam = new HashMap<>();

        for(char c : s.toCharArray()){
            agam.put(c,agam.getOrDefault(c,0)+1);
        }


    }
}
