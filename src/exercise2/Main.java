package exercise2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Human> human = retrieveHuman("Adam");
        System.out.println(human.orElse(new Human("Nadia")));
        System.out.println(human.orElseThrow(() -> new RuntimeException(" No human in the box")));
    }

    public static Optional<Human> retrieveHuman(final String name) {
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
