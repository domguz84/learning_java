package arrays;

import java.util.Arrays;

public class SecendMaxValueArray {
    public static void main(String[] args) {
        int[] t1 = {-7, -4, -71, -29, -543, -42, -76, -7, -7, -4};


        Arrays.sort(t1);
        int v2 = t1[t1.length - 1];
        for (int i = t1.length - 1; i >= 0; i--) {
            if (v2 != t1[i]) {
                System.out.println("the secend max value: " + t1[i]);
                return;
            }

        }
        System.out.println("no are second value");

    }
}
