package library;

import library.person.LibrarianMan;

public class Book {


    //TODO książki nie mogą dziedziczyć po bibliotece, statyczne
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

    public Book(String title, String bookAboutSomething, int publicationYear) {
        this.title = title;
        this.bookAboutSomething = bookAboutSomething;
        this.publicationYear = publicationYear;
    }

    public String borrow() {
        return "Books borrow";
    }

    public String borrow(boolean isAnyBookInThisLibrary) {
        if (isAnyBookInThisLibrary) {
            return "Books are in Library";
        } else {
            return "Books aren`t in Library";
        }
    }

    public int howManyBooksIsInThisLibrary() {
        return 5;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookAboutSomething='" + bookAboutSomething + '\'' +
                ", year=" + publicationYear +
                '}';
    }

}


