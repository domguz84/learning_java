package exercise2;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        Optional<String> someOptional = someMethod();
        String s = someOptional.get();
        if (someOptional.isPresent()) {
            System.out.println(s);
        } else {
            System.out.println("optional is empty");
        }

    }


    private static Optional<String> someMethod() {
        return Optional.ofNullable("kosmos");

    }
}

