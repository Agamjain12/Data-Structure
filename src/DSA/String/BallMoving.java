package DSA.String;

import java.util.Arrays;

public class BallMoving {
//    Input: boxes = "110"
//    Output: [1,1,3]
//    Explanation: The answer for each box is as follows:
//            1) First box: you will have to move one ball from the second box to the first box in one operation.
//            2) Second box: you will have to move one ball from the first box to the second box in one operation.
//            3) Third box: you will have to move one ball from the first box to the third box in two operations,
//            and move one ball from the second box to the third box in one operation.

    public static void main(String[] args) {
        String s = "110";
        System.out.println(Arrays.toString(minOperations(s)));
    }
    public static int[] minOperations(String boxes) {
        int size = boxes.length();
        int[] arr = new int[size];

        int rightSum = 0;
        int onesAtRight = 0;
        for (int i = 0; i < size; i++) {
            if(boxes.charAt(i)=='1'){
                onesAtRight++;
                rightSum+=i;
            }
        }
        int leftSum = 0;
        int onesAtLeft = 0;
        for (int i = 0; i < size; i++) {
            leftSum+=onesAtLeft;
            if(boxes.charAt(i)=='1'){
                onesAtRight--;
                onesAtLeft++;
            }
            arr[i] = rightSum+leftSum;
            rightSum-= onesAtRight;
        }
        return arr;
    }
}
