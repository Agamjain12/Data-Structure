package DSA.String;

public class AlternateStringConcatination {
    public static void main(String[] args) {
        String s ="asdfig";
        String a = "pqrsal";
        String max = s.length()>=a.length() ? s: a;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<max.length(); i++){
            if(i<Math.min(s.length(),a.length())){
                sb.append(s.charAt(i));
                sb.append(a.charAt(i));
            }
            else{
                sb.append(max.charAt(i));
            }
        }
        System.out.println(sb);
        }
    }

