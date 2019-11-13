package dhbw.daniel.main;

public class Book {
    public static int numberOfBooks;   // total number of instantiated books
    private String author;              // book author
    private String title;               // book title
    private long isbn13;                // ISBN-13 of the book
    private boolean hardcover;          // is it a hardcover book?
    private boolean available;          // is the book available?
    private int shelfNumber;            // shelf number of the book

    Book(String author, String title, long isbn13, boolean hardcover) {
        numberOfBooks ++;
        this.author = author;
        this. title = title;
        this. isbn13 = isbn13;
        this.hardcover = hardcover;
    }

    public String getAuthor() {

        return this.author;
    }
    public String getTitle() {

        return this.title;
    }
    public long getISBN13() {

        return 0;
    }
    public boolean isHardcover() {

        return this.hardcover;
    }
    public boolean isAvailable() {

        return this.available;
    }
    public int getShelfNumber() {

        return this.shelfNumber;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setISBN13(long isbn13) {
        this.isbn13 = isbn13;
    }
    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String toString() {
        return "Buchnummer: " + numberOfBooks + "\nAuthor: " + author + "\nTitel: " + title + "\nISBN: " + isbn13 + "\nHardcover: " + hardcover + "\nVerfügbar: " + available + "\nRegal: " + shelfNumber;
    }


}
