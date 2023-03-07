package arrays;

import java.util.Arrays;

public class ArrayCapitalise {
    public static void main(String[] args) {
        String[] t = {"dog", "cOW", "cat", "lion"};
        for (int i = 0; i < t.length; i++) {
            t[i] = t[i].toLowerCase();
            char[] c = t[i].toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            t[i] = String.valueOf(c);
        }

        System.out.println(Arrays.toString(t));
    }
}
