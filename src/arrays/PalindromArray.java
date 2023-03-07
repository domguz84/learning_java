package arrays;

public class PalindromArray {
    public static void main(String[] args) {
        String s = "stefan";
        boolean isPalindrom = true;

        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length / 2; i++) {
            if (sArray[i] != sArray[sArray.length - 1 - i]) {
                isPalindrom = false;
                break;
            }

        }

        if (isPalindrom) {

            System.out.println("wyraz jest palindromem");
        } else {
            System.out.println("wyraz nie jest palindromem");

        }
    }
}
