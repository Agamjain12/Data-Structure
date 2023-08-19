package DSA.String;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";

        StringBuilder sb = new StringBuilder(s);

        int first =0;
        int last =s.length()-1;
        while(first<=last){

            if(!isAlphabet(s.charAt(first))){
                first++;
                continue;
            }
            else if(!isAlphabet(s.charAt(last))){
                last--;
                continue;
            }
            else{
                sb.setCharAt(first, s.charAt(last));
                sb.setCharAt(last, s.charAt(first));

            }
            first++;
            last--;
        }

        System.out.println(sb.toString());
    }
    public static boolean isAlphabet(char char1) {
        return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z');
    }

}
