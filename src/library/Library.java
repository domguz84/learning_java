package library;

import library.person.LibrarianMan;
import library.person.UserMan;

import java.util.Arrays;

public class Library {
//TODO przerobić na statyczne wszystkie metody i pola tablice książek, magazyne,
    //TODO biblioteka ma być zwykłą klasą

    //TODO metoda statyczna, zwracająca książkę

    // public static getAnyBook.

    private static Book[] books;

    public static Book getAnyBook() {
        return books[0];
        //TODO sprawdzić czy tablica books nie jest pusta, jeżeli zwróci że jest puta to return nie ma już książęk(null)
        //TODO pobierz pierwszy element z tablicy,
        //TODO stwórz nową tablicę pomniejszoną o tą książkę (pętla for)

    }

    public static void giveMeThisBook(Book book) {
//TODO stwórz nową tablicę i przypisz do książek
    }

    //załadowanie ksiązęk do biblioteki
    public static void initialize() {
        //TODO tutaj przerzuć tablicę książek
    }
}

