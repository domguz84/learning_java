package library;

public class Magazine extends Library {

    private String title;
    private int PublicationDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        PublicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", PublicationDate=" + PublicationDate +
                '}';
    }

    public Magazine(String title, int publicationDate) {
        super(librarianMan, userMan);
        this.title = title;
        PublicationDate = publicationDate;


    }

}



