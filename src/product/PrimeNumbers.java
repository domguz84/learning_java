package product;

public class PrimeNumbers {
    public static void main(String[] args) {
        

        boolean primeNumber = true;

        for (int x = 2; x <= 10000; x++) {
            primeNumber = true;
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {

                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber)
                System.out.println("Liczba " + x + " jest liczbą pierwszą");
        }

    }
}
