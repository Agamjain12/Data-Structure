package DSA;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {


    int[] arr = new int[100];
    Scanner sc = new Scanner(System.in);
    int n;
        System.out.println("enter the number: ");
        n = sc.nextInt();
    int j =0;

    while(n!=0){

        arr[j] = n%2;
        n = n/2;
        j++;

    }
        for(int i =j-1; i>=0; i--) {
            System.out.print(arr[i]);

        }
}}
