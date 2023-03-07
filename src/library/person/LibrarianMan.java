package library.person;

import library.Book;
import library.Magazine;
import library.SpecialBook;

public interface LibrarianMan {

    void borrowTheBook(Book book, User user);

    void giveBackTheBook(Book book, User user);

    void borrowTheMagazine(Magazine magazine, User user);

    void giveBackTheMagazine(Magazine magazine, User user);

    void borrowTheBSpecialBook(SpecialBook specialBook, User user);

    void GiveBackTheBSpecialBook(SpecialBook specialBook, User user);


}

