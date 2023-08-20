package DSA.HashMap;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "sssaaaartdfpaaadf";

//        Map<Character,Integer> agam = new HashMap<>();
//        ArrayList<Character> sb = new ArrayList<>();
//
//        for(char ch : s.toCharArray()){
//            agam.put(ch,agam.getOrDefault(ch,0)+1);
//        }
//
//        for(Map.Entry<Character,Integer> e : agam.entrySet()){
//            for(int i=0; i<agam.get(e.getKey()); i++){
//                sb.add(e.getKey());
//            }
//        }
//
//        System.out.println(sb);

        Map<Character, Integer> agam = new HashMap<>();
        for (char i : s.toCharArray()) {
            agam.put(i, agam.getOrDefault(i, 0) + 1);
        }

        List<Character> list = new ArrayList<>(agam.keySet());
        Collections.sort(list, (a, b) -> {
            return (agam.get(a) == agam.get(b))? a - b : agam.get(b) - agam.get(a);
        });

        StringBuilder sb = new StringBuilder();
        int i=0;
        for (char num : list) {
            for (int j = 0; j < agam.get(num); j++) {
                 sb.append(num);
                 i++;
            }
        }

        System.out.println(sb);

    }
}
