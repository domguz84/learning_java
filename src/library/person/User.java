package library.person;

import library.Book;
import library.Magazine;

public class User extends Person implements UserMan {
    public User(String name, String surname, int curdLibraryNumber) {
        super(name, surname, curdLibraryNumber);
    }

    @Override
    public void ownedBooks(Book book, Magazine magazine) {


    }
}
