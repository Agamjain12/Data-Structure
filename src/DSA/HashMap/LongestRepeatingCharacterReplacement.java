package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABBABABBAA";
        int k = 2;
        Map<Character, Integer> map = new HashMap<>();

        int left = 0, maxRepeat = 0, maxWindow = 0;

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            // IMPORTANT: maxRepeat is not the accurate number of dominant character, It is the historical maximum count
            // We do not care about it because unless it gets greater, it won't affect our final max window size.
            maxRepeat = Math.max(maxRepeat, map.get(ch));

            if(right - left + 1 - maxRepeat > k) {
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        System.out.println(maxWindow);

    }
}