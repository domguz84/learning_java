package arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] t1 = {3, 4, 7, 4, 3, 3, -1};


        int[] t2 = new int[t1.length];
        int t2_len = 0;
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1.length; j++) {
                if (t1[i] == t1[j] && i != j) {
                    boolean item_exists = false;
                    for (int k = 0; k < t2_len; k++) {
                        if (t1[i] == t2[k]) {
                            item_exists = true;
                            break;
                        }


                    }
                    if (item_exists == false) {
                        t2[t2_len] = t1[i];
                        t2_len++;
                    }
                }
            }

        }

        for (int i = 0; i < t2_len; i++) {
            System.out.print(t2[i]);
            System.out.print(" ");
        }


    }
}
