package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExampleArrey {
    public static void main(String[] args) {
        String s = "table";
        char[] sArray = s.toCharArray();
        char[] sArray2 = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            sArray2[sArray.length - i - 1] = sArray[i];
        }
        String s2 = new String(sArray2);
        System.out.println(s2);
    }
}
