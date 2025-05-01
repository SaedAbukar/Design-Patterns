package Prototype;

public class Book extends BookPrototype {

    public Book(String title, String author, String genre, int year) {
        super(title, author, genre, year);
    }
    public Book(BookPrototype prototype) {
        super(prototype);
    }

    @Override
    public Prototype clone() {
        return new Book(this);
    }
}
