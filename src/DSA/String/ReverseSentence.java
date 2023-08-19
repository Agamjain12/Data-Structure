package DSA.String;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "you act like you aint never seen a mexican yoshi before";
        StringBuilder sc = new StringBuilder("");
        StringBuilder sb = new StringBuilder("");

        for( int i=s.length()-1; i>=0; i-- ) {
            char ch = s.charAt(i);

            if( ch!=' ' ) {
                sb.append(ch);
            }

            if( (ch==' '|| i==0 ) && sb.length()>0 ) {
                if( sc.length()>0 ) {
                    sc.append(" ");}

                sb.reverse();
                sc.append(sb);
                sb.setLength(0);
            }
        }

        System.out.println(sc);

    }
}
