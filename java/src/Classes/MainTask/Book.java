package Classes.MainTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    public static List<Book> books = new ArrayList<>();
    static int countId = 0;
    private int id;
    private String title;
    private String[] authors;
    protected String publisher;
    private int publicationYear;
    private int amountOfPages;
    private double price;
    private boolean hardCover;
    private static final String HARD_COVER = "твёрдый переплёт.";
    private static final String SOFT_COVER = "мягкий переклёт.";

    public Book(String title, String[] authors, String publisher, int publicationYear) {
        this.id = ++countId;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        books.add(Book.this);
    }

    public Book(String title, String[] authors, String publisher, int publicationYear, int amountOfPages, double price, boolean hardCover) {
        this.id = ++countId;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.hardCover = hardCover;
        books.add(Book.this);
    }

    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        Book.books = books;
    }

//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }

//    public void setAuthors(String[] authors) {
//        this.authors = authors;
//    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

//    public void setPublicationYear(int publicationYear) {
//        this.publicationYear = publicationYear;
//    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHardCover() {
        return hardCover;
    }

        public String toString() {
        String text = "";
        text += "id: " + getId();
        text += "; название: " + "\"" + getTitle() + "\"";
        text += "; автор(ы): " + Arrays.toString(getAuthors());
        text += "; издателство: " + getPublisher() ;
        text += "; год издания: " + getPublicationYear();
        text += "; кол-во страниц: " + getAmountOfPages();
        text += "; цена: " + getPrice();
        text += "; обложка: " + (isHardCover() ? HARD_COVER : SOFT_COVER);
        //text += "\n";
        return text;
    }
}