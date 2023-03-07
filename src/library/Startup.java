package library;

import java.util.ArrayList;
import java.util.List;

public class Startup {
    public static void inicializer() {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book("Lokomotywa", "bajka", 1980);
        Book book2 = new Book("Ogniem i Mieczem", "powieść", 1999);
        Book book3 = new Book("Piła", "thiller", 2006);
        Book book4 = new Book("Lokomotywa", "wiersz", 2018);
        Book book5 = new Book("Daktyle", "bajka", 1977);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        for (Book book : bookList) {

        }

        List<Magazine> magazineList = new ArrayList<>();

        Magazine magazine1 = new Magazine("Auta", 2019);
        Magazine magazine2 = new Magazine("Filatelistyka", 2002);
        Magazine magazine3 = new Magazine("Ogród", 2015);
        magazineList.add(magazine1);
        magazineList.add(magazine2);
        magazineList.add(magazine3);
        for (Magazine magazine : magazineList) {

        }

        List<SpecialBook> specialBooksList = new ArrayList<>();

        SpecialBook specialBook1 = new SpecialBook("Journal", "Health", 2012);
        SpecialBook specialBook2 = new SpecialBook("Journal", "Science", 2022);
        SpecialBook specialBook3 = new SpecialBook("Journal", "Food", 2008);
        specialBooksList.add(specialBook1);
        specialBooksList.add(specialBook2);
        specialBooksList.add(specialBook3);
        for (SpecialBook specialBook : specialBooksList) {

        }
        Library.addSpecialBook(specialBook1);
        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);


    }

}


