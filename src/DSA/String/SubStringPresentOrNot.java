package DSA.String;

public class SubStringPresentOrNot {
    public static void main(String[] args) {
        String s = "agam   jain";
        String b = "agm jain";
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) ==' ' && sb.charAt(i+1)==' '){
                sb.deleteCharAt(i);
            }
        }

        System.out.println(sb);
    }
}
