package product;

import java.util.ArrayList;
import java.util.List;

public class Print {

    public static void main(String[] args) {

        int x = 37;
        int y = 14;
        for (int i = 0; i < 500; i++) {
            String sep = ", ";
            if (i == 499) {
                sep = "";
            }
            x += 2;
            y -= 3;
            System.out.print(Integer.toString(x) + ", " + Integer.toString(y) + sep);
        }
    }
}

