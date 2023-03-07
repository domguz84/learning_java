package exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj masę swojego ciała");
    }
}
/*BMI = m / h*h [kg / m*m]
        1. pyta o masę w kg
        2. pyta o wzrost w metrach
        3. wyświetla wartość BMI
        4. UWAGA: sprawdzać czy użytkownik podał poprawny wzrost,
        czyli większy od 0 - gdy taki poda to ponownie pytaj o wzrost do casu aż poda wartość większą od zera*/
