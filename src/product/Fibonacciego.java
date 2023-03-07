package product;

public class Fibonacciego {
    public static void main(String[] args) {

        int x_prev_prev = 0;
        System.out.print(x_prev_prev);
        System.out.print(" ");
        int x_prev = 1;
        System.out.print(x_prev);
        System.out.print(" ");

        for (int i = 2; i < 20; i++) {

            int x = x_prev + x_prev_prev;
            System.out.print(x);
            System.out.print(" ");
            x_prev_prev = x_prev;
            x_prev = x;
        }
    }
}