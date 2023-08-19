package DSA.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regrex2 {

    public static void main(String[] args) {

        String strSource = "aA1~!@#$%^&*()_+{}[]:;,.<>/?-";

        String strPattern = "[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]";

        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(strSource);

        if(m.find()) {
            System.out.println("String contains special character(s)");
        }

        //removing all special characters from string
        strSource = strSource.replaceAll(strPattern, "");

        System.out.println(strSource);

    }
}