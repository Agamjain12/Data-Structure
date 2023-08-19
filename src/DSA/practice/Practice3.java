package DSA.practice;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        String s ="listen";
        String t = "silentt";

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        char[] ag = t.toCharArray();
        Arrays.sort(ag);

        if(Arrays.equals(ch, ag)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }
}
