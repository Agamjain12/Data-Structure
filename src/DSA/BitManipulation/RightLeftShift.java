package DSA.BitManipulation;

public class RightLeftShift {
    public static void main(String[] args) {
        //right shift operator
        int a = 30;
        int b = a>>1; // results in a/2
        System.out.println(b);

        //left shift operator
        int c = a<<1;
        System.out.println(c); // results in 2*a

        //a<<b = a*2^b
        int d = 4<<3;
        System.out.println(d);

        //a>>b = a/2^b
        double e =  4>>3;
        System.out.println(e);






    }
}
