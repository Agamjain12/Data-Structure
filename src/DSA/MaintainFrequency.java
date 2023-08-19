package DSA;

import java.util.Arrays;

public class MaintainFrequency {
    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 2, 2, 1, 1,4,4,4,7,1,3,4,5,9};
        Arrays.sort(num);

        int maj = num[0], count = 1, j = 1;
        for (int i = 1; i < num.length; i++) {
            if (maj == num[i]) {
                if (count < 2) {
                    count++;
                    num[j++] = maj;
                } else {
                    num[j++]=Integer.MAX_VALUE;

                }
            } else {
                maj = num[i];
                num[j++] = maj;
                count = 1;
            }




        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }
}