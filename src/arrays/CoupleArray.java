package arrays;

import java.util.Arrays;

public class CoupleArray {
    public static void main(String[] args) {
        int[] t1 = {6, 2, 3, 2, 6, -1, 9, 6, 3, 5, 4, 4};
        System.out.println(Arrays.toString(t1));
        int s = 8;
        for (int i = 0; i < t1.length; i++) {
            for (int j = i + 1; j < t1.length; j++) {
                if ((t1[i] + t1[j]) == s) {
                    System.out.println(Integer.toString(t1[i]) + " " + Integer.toString(t1[j]));
                }

            }
        }


    }
}
