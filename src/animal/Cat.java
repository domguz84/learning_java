package animal;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Poruszam się delikatnie, tup tup");
    }

    @Override
    public void sound() {
        System.out.println("Miou miu");

    }

    @Override
    public void sound(TypeOld age) {
        if (age == TypeOld.OLD) {
            System.out.println("Mioooooo");
        } else if (age == TypeOld.YOUNG) {
            System.out.println("Piiiii");
        }

    }
}
