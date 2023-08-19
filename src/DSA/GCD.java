package DSA;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {
        int n1 = 24, n2 = 8,GCD=1;

        for(int i=1; i<=n1&&i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                GCD =i;
            }
        }
        System.out.println("GCD: "+GCD);
        System.out.println("LCM: "+(n1*n2)/GCD);


//        ArrayList<Integer> agam = new ArrayList<>();
//        agam.add(2);
//        agam.add(3);
//        Integer[] arr = agam.toArray(new Integer[0]);;
//        System.out.println(Arrays.toString(arr));


    }
}
