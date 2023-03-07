package product.animal;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Mruczek", "grey", 4);
        System.out.println(cat);
        cat.getvoise();
        cat.setName("Pop");
        System.out.println(cat);
    }
}
