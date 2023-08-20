package DSA.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "sssaaaartdfpaaadf";

        PriorityQueue<Map.Entry<Character, Integer>> counts = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> c : freq.entrySet()){
            counts.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while(counts.size() > 0){
            Map.Entry<Character, Integer> element = counts.remove();
            for(int i = 0; i < element.getValue(); i++){
                sb.append(element.getKey());
            }
        }

        System.out.println(sb);


    }
}
