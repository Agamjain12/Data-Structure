package DSA.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        boolean flag = true;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("not palindrome");
                flag = false;
                return;
            }
        }
          if(flag){
              System.out.println("is a palindrome");
          }
    }
}
