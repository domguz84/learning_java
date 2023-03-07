package arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] t = {3, 5, 6, 2, 9, 4};
        System.out.println(Arrays.toString(t));
        bubbleSort(t);
        System.out.println(Arrays.toString(t));
    }

    private static void bubbleSort(int[] t) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 1; j < (t.length - 1); j++) {
                if (t[j - 1] > t[j]) {
                    int temp = t[j - 1];
                    t[j - 1] = t[j];
                    temp = t[j];

                    System.out.println(Arrays.toString(t));
                } else {
                    System.out.println(Arrays.toString(t));
                }

            }

        }

    }
}
