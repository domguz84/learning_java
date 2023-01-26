package library;

import library.person.LibrarianMan;

public class Book {


    //TODO książki ne mogą dziedziczyć po bibliotece, statyczne
    private String title;
    private String bookAboutSomething;
    private int publicationYear;

    public String getTitle() {
        return title;
    }

    public String getBookAboutSomething() {
        return bookAboutSomething;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookAboutSomething(String bookAboutSomething) {
        this.bookAboutSomething = bookAboutSomething;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookAboutSomething='" + bookAboutSomething + '\'' +
                ", year=" + publicationYear +
                '}';
    }

    public Book(String title, String bookAboutSomething, int year) {
        this.title = title;
        this.bookAboutSomething = bookAboutSomething;
        this.publicationYear = year;


    }
}
