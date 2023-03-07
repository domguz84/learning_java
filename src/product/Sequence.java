package product;

public class Sequence {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(Integer.toString(i));
            }
            System.out.println();
            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 4; k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }


}
