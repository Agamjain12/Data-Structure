package DSA.Sort;

public class FloorOfTargetNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2,4,5,6,7,9};
        int key = 8;
        System.out.println(floor(arr,key));

    }

    static int floor(int[] arr, int key){
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
        return h;

    }
}