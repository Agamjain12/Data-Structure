package DSA;

public class FibonacciApproaches {
    public static void main(String[] args) {
        System.out.println(  Recursive_fibo(3));
        iterative_fibo(7);


    }
    static void iterative_fibo(int n){
        if(n<=1){
            System.out.println(n);
        }
        else{
            int a=0,b=1;
            System.out.println(a);
            System.out.println(b);
            while(n-->1){
                int sum = a+b;
                a =b;
                b =sum;
                System.out.println(b);
            }
        }
    }

    static int Iterative_fibo(int n){

        return 0;
    }
    static int Recursive_fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return Recursive_fibo(n-1)+Recursive_fibo(n-2);
        }
    }
}
