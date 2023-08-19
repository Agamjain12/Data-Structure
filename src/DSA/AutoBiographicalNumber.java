package DSA;


public class AutoBiographicalNumber {
    public static void main(String[] args) {
    String s = "34050607";

//        int aa = Integer.parseInt(s);
//        System.out.println(aa);


        int a = Integer.parseInt(String.valueOf(s.charAt(0)));
        //s.charAt(i) returns character. String.valueOf returns a string, Integer.partInt converts String into integer
        System.out.println(a);
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                count++;
            }
        }

        System.out.println(a==count);
    }
}
