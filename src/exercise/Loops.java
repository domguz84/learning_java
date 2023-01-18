package exercise;

import javax.swing.*;

public class Loops {

    public static int factorialLoop(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= 1;
        }
        System.out.println("factorialLoop(n) = " + factorialLoop(n));
        return product;
    }

    public static boolean ispalindrome(String sentence) {
        String str = "kulka";
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1)) {
                return false;
            }
            System.out.println();
        }
        return true;



/*public static char printChrismasTree(int n) {
   int a = 10;
    for (int i = 10; i > chrismasTree.lenght() ; i - 2) {

    }*/

    }
}

