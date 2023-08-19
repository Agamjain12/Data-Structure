package DSA;

import java.util.ArrayList;

public class MissingElement {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,4};
        System.out.println(missing(arr));
    }
    public static int missing(int[]arr){
        int missing =0;
        ArrayList<Integer> agam = new ArrayList<>();

        for(int i : arr){
            agam.add(i);
        }
        for(int j=1; j<=agam.size(); j++){
            if(!agam.contains(j)){
                missing = j;
                return missing;
            }

        }
        return missing;
    }
}
