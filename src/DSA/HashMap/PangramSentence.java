package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydo";

        Map<Character, Integer> agam = new HashMap<>();
        for(char c : sentence.toCharArray()){
            agam.put(c,agam.getOrDefault(c,0)+1);
        }

        System.out.println(agam.keySet().size());
    }

}
