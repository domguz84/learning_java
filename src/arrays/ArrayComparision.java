package arrays;

import java.util.Arrays;

public class ArrayComparision {
    public static void main(String[] args) {
        int[] t1 = {6, 3, 8, 2};
        int[] t2 = {3, 6, 2, 8};

        if (t1.length != t2.length) {
            System.out.println("tables do not have the same content");
            return;
        }

        Arrays.sort(t1);
        // System.out.println(Arrays.toString(t1));
        Arrays.sort(t2);
        // System.out.println(Arrays.toString(t2));

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != t2[i]) {
                System.out.println("tables do not have the same content");
                return;
            }

        }
        System.out.println("tables have the same content");

    }
}
