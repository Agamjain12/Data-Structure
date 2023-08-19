package DSA;

public class LengthOfLastWordInString {
    public static void main(String[] args) {

        String s = "agam is a agamm   ";
        int ln= sdf(s.trim());
        System.out.println(ln);
//

   }
   static int sdf(String s){
     int length=0;
     for(int i=s.length()-1; i>0; i--){
         if(s.charAt(i)==' '){
            return length;
         }
         else{
             length++;
         }

     }
       return length;
   }
}
