public class PersonEmpty {

    private String name;
    private String surname;
    private int age;

    public PersonEmpty(String name, String surname, int age) {


        if (name == null) {
            // throw new NullPointerException
            //     ("Imię nie może być null");
        }
        if (surname == null) {
            throw new NullPointerException
                    ("Nazwisko nie może być null");
        }
        if (age >= 0) {
            throw new NullPointerException
                    ("Wiek nie może być równy zero");
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public static void main(String[] args) {
        try {
            PersonEmpty personEmpty = new PersonEmpty("Piotr", "Wozniak"
                    , 0);
        } catch (NullPointerException e) {
            System.out.println("Nieprawidłowa wartość: " + e.getMessage());

        }
    }
}
