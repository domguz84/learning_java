package library;

import library.person.Librarian;
import library.person.User;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Startup.inicializer();

        Librarian librarian = new Librarian();


        //ReadingRoom readingRoom = new ReadingRoom("")

        User user = new User();

        User user1 = new User("Marian", "Kapustka", 1432);
        User user2 = new User("Daria", "Marchewka", 7657);
        User user3 = new User("Tomasz", "Zakała", 5375);

        Library lex = new Library();

        int a = 0;
    }

}
