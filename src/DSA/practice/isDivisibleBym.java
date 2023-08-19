package DSA.practice;

public class isDivisibleBym {
    public static void main(String[] args) {
        int m=6, n=30;
        int sum=0,sumN=0;
        for(int i=m; i<=n; i++){
            if(i%m==0){
                sum = sum+i;
            }

        }
        for(int i=1; i<=n; i++){
            if(i%m!=0){
                sumN = sumN+i;
            }
        }
        System.out.println(sumN-sum);
    }
}
