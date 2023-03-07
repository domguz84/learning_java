package arrays;

import java.util.Arrays;

public class CopyArray2 {
    public static void main(String[] args) {
        int[] t1 = {3, 4, 7, 4, 3, 3, -1};
        int[] t2 = new int[t1.length];
        int t2_len = 0;
        Arrays.sort(t1);
        System.out.println(Arrays.toString(t1));

        int item_prev = t1[0];
        boolean is_in_t2 = false;
        for (int i = 1; i < t1.length; i++) {
            if (item_prev == t1[i] && is_in_t2 == false) {
                t2[t2_len] = t1[i];
                t2_len++;
                is_in_t2 = true;
            } else if (item_prev != t1[i]) {
                is_in_t2 = false;
            }
            item_prev = t1[i];
        }

        for (int i = 0; i < t2_len; i++) {
            System.out.print(t2[i]);
            System.out.print(" ");
        }
    }
}
