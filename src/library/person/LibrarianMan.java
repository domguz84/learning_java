package library.person;

import library.Book;
import library.Magazine;
import library.SpecialBook;

public interface LibrarianMan {

    void borrow(Book book, Magazine magazine, SpecialBook specialBook, User user);

//TODO: rozbić metody na osobne artykły i Overloading
}

