package DSA.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfString1InString2 {
    public static void main(String[] args) {
        String s1 = "agam";
        String s2 = "simoagammisoaga";

        Pattern p = Pattern.compile(s1);
        Matcher m = p.matcher(s2);

        int count=0;

        while(m.find()){
            count++;
        }

        System.out.println("occurrence of String 1 in String 2 is: " + count);
    }
}
