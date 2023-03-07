package OOP;

import java.util.Arrays;

public class Book {

    private String isbn_number;
    private String title;
    private String author;


    public Book(String isbn_number, String title, String author) {
        this.isbn_number = isbn_number;
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book b1 = new Book("123-123-123", "Wyspa Skarbów", "Robert L. Stevenson");
        Book b2 = new Book("123-143-123", "Pinokio", "Franc Colleo");
        Book b3 = new Book("128-123-123", "Lokomotywa", "Julian Tuwim");
        Book b4 = new Book("128-123-123", "Helikopter", "Zbigniew Mann");

        Book[] tb1 = {b1, b2, b3, b4};
        Book[] tb2 = new Book[tb1.length];
       
        int i = 0;
        for (Book item : tb1) {

            if (item.getTitle().substring(0, 1).toLowerCase().equals("h")) {
                tb2[i] = item;
                i++;
            }
        }
        for (Book item : tb2) {
            if (item != null) System.out.println(item.getTitle());
        }

    }

}
