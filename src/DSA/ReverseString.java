package DSA;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "nayan";
        char[] ch = str1.toCharArray();

        System.out.println("original String is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            ch[ch.length - i - 1] = str1.charAt(i);
        }
        System.out.print("reversed string is: ");
        System.out.println(ch);

        //////////Method-2//////////
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.reverse();
        System.out.println("reversed string is " + stringBuilder);


        //////////Method-3//////////
        List<String> str2= new ArrayList<>();

    }
}