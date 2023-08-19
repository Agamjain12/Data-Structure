package DSA;

public class AutoMorphicNumber {
    public static void main(String[] args) {
//        A number is called an Automorphic number if and only if its square ends in the same digits as the
//        number itself
        int a =5;
        System.out.println(isAutoMorphic(a));

    }
    public static boolean isAutoMorphic(int a){
        int sqr = a*a;
        while(a>0){

            if(a%10==sqr%10){
                a = a/10;
                sqr = sqr/10;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
