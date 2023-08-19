package DSA;

import java.util.Scanner;

public class MultipleInputInASingleLine {
    public static void main(String[] args) {
        String[] arr;
        int a,b;
        Scanner sc = new Scanner(System.in);
//        arr = sc.nextLine().split(" ");
          arr = sc.nextLine().split(",");
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);
        System.out.println("first number is: "+ a+" second number is: "+ b);
    }
}
