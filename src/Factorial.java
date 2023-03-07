public class Factorial {

    public static void main(String[] args) {
        int n = 3;
       int policzsilnie =  factorialCalculate(n);

    }

    public static int factorialCalculate(int n) {
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            n = n * i;
        }
        return n;


    }

}



