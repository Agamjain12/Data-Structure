package DSA;


import java.util.*;


public class temo {


    public static void main(String[] args) {

        int [] nums = {2,4,5,-3,2,-1};


        int max1 = Integer.MIN_VALUE, max2 = 0;

        for(int i=0; i< nums.length; i++){
            max2 += nums[i];
            if(max1<max2){
                max1=max2;
            }
            if(max2<0){
                max2=0;
            }
        }

        System.out.println(max1);
    }
}




