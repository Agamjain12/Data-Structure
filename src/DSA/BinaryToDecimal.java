package DSA;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 111;
        int dec_num = 0;
        int base = 1; // base: 2^n, for 2^0 = 1

        while(num>0){
            int last_digit = num%10;
            num = num/10;
            dec_num += last_digit * base;
            base = base *2;
        }
        System.out.println(dec_num);
    }
}
