package product;

public class Mazak {
    public static void main(String[] args) {

        String[] mazaki = {"czerwony", "zielony", "niebieski", "czarny", "żółty", "brązowy"};

        for (int i = 0; i < 100; i++) {
            System.out.println(mazaki[i % 6]);
        }
    }

}


