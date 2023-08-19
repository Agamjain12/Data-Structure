package DSA.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regrex {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("..s");
//        Matcher m = p.matcher("ass");
//      System.out.println( m.matches());
        String s = "agam12"; //agam12, agammm
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", s)); //for alphanumeric

        //first digit should be 7,8 or 9, basically a phone number
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9589441616"));

        //first letter should be a bold letter, rest should be alphanumerical except 7 and a
        System.out.println(Pattern.matches("[A-Z{1}a-z0-9&&[^7a]]{6}", "gAmm89"));

        //checking for special characters
        System.out.println(Pattern.matches("[^a-zA-Z0-9]+", "&^%$#a"));

        //Checking for custom password, 8-15 length, atleast one special character,digit
        System.out.println(Pattern.matches("[0-9a-z{8,13}[A-Z]+[^a-zA-Z0-9]+]{13,15}", "9589441616123"));

       

    }
}
