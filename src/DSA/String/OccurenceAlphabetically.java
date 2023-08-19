package DSA.String;

import java.util.HashMap;

public class OccurenceAlphabetically {
    public static void main(String[] args) {
        int x=1534236469;
        long l =0;

        int reverse =0;
        int result=0;

        if(x>Integer.MAX_VALUE|| x<Integer.MIN_VALUE){
            System.out.println(0);
        }
        else{

            while(x!=0){
                int lastdig = x%10;
                x = x/10;

                  l =  l * 10 + lastdig;
                  if(l>Integer.MAX_VALUE){
                      System.out.println(0);
                      return;
                  }



//                    reverse = reverse * 10 + lastdig;

            }
        }

        if(reverse>Integer.MAX_VALUE|| reverse<Integer.MIN_VALUE){
            System.out.println(0);
        }
        System.out.println(reverse);
        System.out.println(Integer.MAX_VALUE);
    }
}
