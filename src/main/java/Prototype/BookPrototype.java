package Prototype;

public abstract class BookPrototype implements Prototype{
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    public BookPrototype(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public BookPrototype(BookPrototype prototype) {
        this.title = prototype.title;
        this.author = prototype.author;
        this.genre = prototype.genre;
        this.publicationYear = prototype.publicationYear;
    }

    private int getPublicationYear() {
        return publicationYear;
    }

    private String getGenre() {
        return genre;
    }

    private String getAuthor() {
        return author;
    }

    private String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getTitle() + " by " + getAuthor() + " (" + getGenre() + ", " + getPublicationYear() + ")";
    }

    public abstract Prototype clone();

}
