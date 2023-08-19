package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> agam = new ArrayList<>();
        Collections.addAll(agam,6,7,8,9,10);
        System.out.println("original Arraylist: "+ agam);

        Collections.reverse(agam);
        System.out.println("reversed Arraylist: "+ agam);
    }
}
