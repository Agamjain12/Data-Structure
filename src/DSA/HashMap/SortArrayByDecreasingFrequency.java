package DSA.HashMap;

import java.util.*;

//Given an integer array, sort the array according to the frequency of elements in decreasing order, if
//        the frequency of two elements are same then sort in increasing/decreasing order
public class SortArrayByDecreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4,5};

        Map<Integer, Integer> agam = new HashMap<>();
        for (int i : nums) {
            agam.put(i, agam.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(agam.keySet());
        Collections.sort(list, (a, b) -> {
            return (agam.get(a) == agam.get(b))? a - b : agam.get(b) - agam.get(a);
        });

        int[] res = new int[nums.length];
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < agam.get(num); j++) {
                res[i++] = num;
            }
        }

        System.out.println(Arrays.toString(res));

    }
}
