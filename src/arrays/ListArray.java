package arrays;

import java.util.Arrays;
import java.util.Objects;

public class ListArray {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[array.length];


        for (int i = 0; i < array.length; i++) {


            array2[array.length - i - 1] = array[i];

        }
        System.out.println(Arrays.toString(array2));


    }
}