package library.person;

public abstract class Person implements UserMan {

    private String name;

    private String surname;

    private int curdLibraryNumber;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", curdLibraryNumber=" + curdLibraryNumber +
                '}';
    }

    public Person(String name, String surname, int curdLibraryNumber) {
        this.name = name;
        this.surname = surname;
        this.curdLibraryNumber = curdLibraryNumber;


    }
}
