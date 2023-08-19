package DSA;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] s = {"agam","agam","agac","agacsd","agarsdf"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String s1 = s[0];
        String s2 = s[s.length-1];
        int trav = 0;
        while(trav < s1.length() && trav < s2.length()){
            if(s1.charAt(trav) == s2.charAt(trav)){
                trav++;
            } else {
                break;
            }
        }
        System.out.println(s1.substring(0, trav));
    }
}