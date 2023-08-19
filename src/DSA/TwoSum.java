package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={4,3,5,9,1};
        int target = 14;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map=new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[1] =i;
                result[0]= map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
