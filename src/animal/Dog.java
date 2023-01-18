package animal;

import java.sql.SQLOutput;

public class Dog implements Animal {

    private void defaultSound() {
        System.out.println("Hau hau");
    }

    public void dummy() {

    }

    @Override
    public void move() {
        System.out.println("Biegam bardzo szybko");
    }

    @Override
    public void sound() {
        this.defaultSound();
    }

    @Override
    public void sound(TypeOld age) {
        if (age == TypeOld.OLD) {
            this.defaultSound();
        } else if (age == TypeOld.YOUNG) {
            System.out.println("Ho ho");

        }
    }
}
