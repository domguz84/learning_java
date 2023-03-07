package library.person;

import library.Book;
import library.Magazine;
import library.SpecialBook;

public class User extends Person implements UserMan {
    public User(String name, String surname, int curdLibraryNumber) {
        super(name, surname, curdLibraryNumber);
    }

    public User() {
        super();
    }

    @Override
    public void ownedBooks(Book book, Magazine magazine) {
        System.out.println("wypożycz książkę");
    }

    public void showCurrentBooks(Book book) {
        //pokazanie tablicy książek w konsoli
    }

    public void showCurrentMagazines(Magazine magazine) {
        //pokazanie tablicy magazynów w konsoli
    }

    public void showCurrentSpecialBooks(SpecialBook specialBook) {
        //pokazanie tablicy specjalnych książek w konsoli
    }

}


