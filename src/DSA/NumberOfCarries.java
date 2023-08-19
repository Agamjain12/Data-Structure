package DSA;

public class NumberOfCarries {



    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 5678;

        int carries = countCarries(num1, num2);

        System.out.println("Number of carries: " + carries);
    }
    public static int countCarries(int num1, int num2) {
        int count = 0;
        int carry = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return count;
    }
}

