import animal.Animal;
import animal.AnimalBuilder;
import animal.Cat;
import animal.Dog;
import exercise.Exercise;
import exercise.Loops;
import exercise.Starter;
import exercise2.Book;

import java.util.Arrays;

public class Main {
    public static <Book1> void main(String[] args) {

        Animal cat = new Cat();    // cat: adres 123
        Animal cat1 = new Cat();   // cat: adres 456
        cat = new Cat();           // cat: adres ABC


        AnimalBuilder.run(cat);
        AnimalBuilder.run(new Dog());

        Book book1 = new Book(127688988278L, "Calineczka", "Jan Kowalski");
        Book book2 = new Book(127688788278L, "Hamlet", "William Shakespear");
        Book book3 = new Book(129088988278L, "Dziady", "Adam Mickiewicz");
        Book book4 = new Book(121688988278L, "Wehikuł czasu", "Jan Dobromilski");
        Book book5 = new Book(677688988278L, "Hohliki", "Danuta Wawiłow");
        Book book6 = new Book(127688981768L, "Ho ho zima", "Barbara Supeł");

        Book[] books = new Book[6];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;

        int counter = 0;
        for (Book book : books) {
            if (book.getTitle().startsWith("H")) {
                counter++;
            }
        }
        Book[] containingNewTitle = new Book[counter];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getTitle().startsWith("H")) {
                containingNewTitle[j] = books[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(containingNewTitle));
    }
}



