package DSA.Sort;

public class BinarySearch {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int key = 4;
        bstree(arr,key);
    }

    static void bstree(int[] arr, int key){
        int l=0, h =arr.length-1,mid;
        while(l<=h){
            mid = (l+h)/2;
            if(key == arr[mid]){
                System.out.println("element found at index : "+mid);
                break;
            }
            else if(key<arr[mid]){
                h = mid-1;
            }
            else{
                l = mid+1;
            }

        }
        if(l>h){
            System.out.println("element not found");
        }

    }
}