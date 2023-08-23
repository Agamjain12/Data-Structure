package DSA.Sort;


//You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
// There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
    char[] letters = {'c','d','e'};
    char target = 'a';

        System.out.println(find(letters,target));
    }

    public static char find(char[] letters,char target){
        int low =0, high = letters.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(target<letters[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        // when while loop condition is violated meaning low = arr.length, in that case we return
        // this
        return letters[low % letters.length];
    }

}
