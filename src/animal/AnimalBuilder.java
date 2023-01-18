package animal;

public class AnimalBuilder {

    public static void run(Animal animal) {
        animal.move();
        animal.sound();
        animal.sound(TypeOld.OLD);
    }
}
