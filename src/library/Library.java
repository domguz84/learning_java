package library;

import library.person.LibrarianMan;
import library.person.User;
import library.person.UserMan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private static List<Book> books = new ArrayList<>();
    private static List<Magazine> magazines = new ArrayList<>();
    private static List<SpecialBook> specialBooks = new ArrayList<>();


    private static List<User> users = new ArrayList<>();


//TODO przerobić na statyczne wszystkie metody i pola tablice książek, magazyne,


    public static Book getBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book book = books.get(0);
        books.remove(book);
        return book;
    }


    public static void addBook(Book book) {
        books.add(book);
    }

    public static void addMagazine(Magazine magazine) {

        magazines.add(magazine);
    }

    public static void addSpecialBook(SpecialBook specialBook) {

        specialBooks.add(specialBook);
    }


    //   public static void giveMeThisBook (Book book){
//TODO stwórz nową tablicę i przypisz do książek
    // }

    //załadowanie ksiązęk do biblioteki
    //public static void initialize() {
    //TODO tutaj przerzuć tablicę książek

}







