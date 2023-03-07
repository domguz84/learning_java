
import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char choice = 'y';


        do {
            char sign = '*';
            System.out.print("n = ");
            int n = scan.nextInt();
            for (int i = 0; i < (n + n % 2) / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (j >= (n - n % 2) / 2 - i - (n + 1) % 2 && j <= (n - n % 2) / 2 + i) {
                        System.out.print(sign);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.print("Do you want to finish the work? (y/n): ");
            choice = scan.next().charAt(0);

        } while (Character.toLowerCase(choice) != 'y');
    }

}
