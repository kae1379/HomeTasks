package Classes.MainTask;

/*
Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
 */
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    public static List<Book> books = new ArrayList<>();
    static int countId = 0;
    private final int id;
    private final String title;
    private final String[] authors;
    private final String publisher;
    private final int publicationYear;
    private final int amountOfPages;
    private final double price;
    private final boolean hardСover;

    public Book(String title, String[] authors, String publisher, int publicationYear, int amountOfPages, double price, boolean hardСover) {
        this.id = ++countId;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.hardСover = hardСover;
        books.add(Book.this);
    }

    public static List<Book> getBooks() {
        return books;
    }
//
//    public static void setBooks(List<Book> books) {
//        Book.books = books;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public void setAuthors(String[] authors) {
//        this.authors = authors;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setPublicationYear(int publicationYear) {
//        this.publicationYear = publicationYear;
//    }
//
//    public void setAmountOfPages(int amountOfPages) {
//        this.amountOfPages = amountOfPages;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setHardСover(boolean hardСover) {
//        this.hardСover = hardСover;
//    }

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

    public boolean isHardСover() {
        return hardСover;
    }

//id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
        public String toString() {
        String text = "";
        text += "id: " + getId();
        text += "; название: " + "\"" + getTitle() + "\"";
        text += "; автор(ы): " + Arrays.toString(getAuthors());
        text += "; издателство: " + getPublisher() ;
        text += "; год издания: " + getPublicationYear();
        text += "; кол-во страниц: " + getAmountOfPages();
        text += "; цена: " + getPrice();
        text += "; обложка: " + (isHardСover() ? "твёрдый переплёт." : "мягкий переклёт.");
        //text += "\n";
        return text;
    }
}