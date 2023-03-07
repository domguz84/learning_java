package library;

public class SpecialBook {

    private String title;
    private String specialBookAboutSomething;
    private int publicationYear;

    public SpecialBook(String title, String specialBookAboutSomething, int publicationYear) {
        this.title = title;
        this.specialBookAboutSomething = specialBookAboutSomething;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecialBookAboutSomething() {
        return specialBookAboutSomething;
    }

    public void setSpecialBookAboutSomething(String specialBookAboutSomething) {
        this.specialBookAboutSomething = specialBookAboutSomething;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "SpecialBook{" +
                "title='" + title + '\'' +
                ", specialBookAboutSomething='" + specialBookAboutSomething + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
// public void accessToBooks() {

//public void borrow() {







