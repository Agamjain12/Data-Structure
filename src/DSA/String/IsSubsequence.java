package DSA.String;

import java.util.ArrayList;
import java.util.Arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        String s= "asd";
        String t ="avrsdhf";

        System.out.println(momenentOfTruth(s,t));

    }
    public static boolean momenentOfTruth(String s, String t){
        int i =0;
        for(int j=0; j<t.length() && i<s.length(); j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==s.length();
    }
}
