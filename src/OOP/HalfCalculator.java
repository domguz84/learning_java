package OOP;

public class HalfCalculator implements Function {

    /*  2..

      Przechodząc przez wszystkie elementy tablicy, wywołaj metodę calculate() na wyniku poprzednim i dodawaj do siebie kolejne otrzymane wyniki
      zaczynając od jakiejś dużej liczby, np 12642364. Wynik wydrukuj na ekranie.*/
    @Override
    public int calculate(int p) {
        return p / 2;
    }

    public static void main(String[] args) {
        HalfCalculator h1 = new HalfCalculator();
        System.out.println(h1.calculate(6));
        QuarterCalculator h2 = new QuarterCalculator();
        System.out.println(h2.calculate(6));

        Function[] t1 = new Function[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                t1[i] = h1;
            } else {
                t1[i] = h2;
            }
        }
        int sum = 0;
        int r_prev = 112642364;
        for (Function function : t1) {
            r_prev = function.calculate(r_prev);
            sum += r_prev;
        }

        System.out.println(sum);
    }


}
