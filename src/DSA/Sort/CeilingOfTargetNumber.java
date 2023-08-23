package DSA.Sort;

public class CeilingOfTargetNumber {
    public static void main(String[] args) {


    int[] arr = {1, 2,  4, 5};
    int key = 3;
        System.out.println(ceiling(arr,key));

}

    static int ceiling(int[] arr, int key){
        int l=0, h =arr.length-1,mid;
        while(l<=h){
            mid = (l+h)/2;
            if(key == arr[mid]){
                return mid;

            }
            else if(key<arr[mid]){
                h = mid-1;
            }
            else{
                l = mid+1;
            }

        }
        return l;

    }
}