package DSA.String;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        StringBuilder sb = new StringBuilder(s +s);

        // plan here is to remove first and last character of the string made by concatenating
        // s with itself. now if the s is made by repeated substring, the new String will contain
        // s. if not then it is not made by repeated substring

        StringBuilder sc = new StringBuilder(sb.substring(1,sb.length()-1));
        System.out.println(sc);
        System.out.println( sc.toString().contains(s));


    }
}
