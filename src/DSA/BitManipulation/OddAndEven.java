package DSA.BitManipulation;

public class OddAndEven {
    public static void main(String[] args) {
        System.out.println(isOdd(67));

    }
    public static boolean isOdd(int n){
        return (n & 1)==1; // a&1 = a always. 67 will be converted into binary, the last digit will either be 1 or 0, if the end result is 0 number will be even.
    }
}
