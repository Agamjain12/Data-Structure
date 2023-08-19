package DSA;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);
        int number = aj.nextInt();
        int total_digits=0;
        int n =number;
        while(n>0){
            int last = n%10;
            n=n/10;
            total_digits++;
        }
        boolean say = isArmstrongNumer(number,total_digits);
        System.out.println(say);

    }


    static boolean isArmstrongNumer(int a,int b){
        int actual = a;
        double sum =0;

        while(a>0){
            int rem;
            rem = a%10;
            a =a/10;

            sum =  sum + Math.pow(rem,b);


        }
        return sum ==actual;


    }
}