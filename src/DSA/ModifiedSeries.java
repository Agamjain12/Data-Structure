package DSA;

public class ModifiedSeries {
    public static void main(String[] args) {

        double sum=0;
        double x = 8;
        int fact =1;
        for (int i = 0; i <=100; i++) {

            if(i==0 ||i ==1){
                sum =  sum + (Math.pow(x,i));

            }
            else{
                fact = fact*i;
            sum =  sum + (Math.pow(x,i))/fact; }
        }

        System.out.println(sum);
        System.out.println(Math.exp(x));
    }

}
