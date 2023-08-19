package DSA;

public class Series {
    public static void main(String[] args) {

        double sum=0;
        double x = 8;
        for (int i = 0; i <=100; i++) {
            sum =  sum + (Math.pow(x,i))/fact(i);
        }

        System.out.println(sum);
        System.out.println(Math.exp(x));
    }
    public static double fact(int i){
       double fact =1;
        for(double j=i; j>0; j--){
            fact = fact * j;
        }
        return fact;
    }
}
