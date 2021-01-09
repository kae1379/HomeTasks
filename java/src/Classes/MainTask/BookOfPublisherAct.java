package Classes.MainTask;

public class BookOfPublisherAct extends Book {
    public static final String PUBLISHER = "АСТ";

    public BookOfPublisherAct(String title, String[] authors, int publicationYear) {
        super(title, authors, PUBLISHER, publicationYear);
    }

    public BookOfPublisherAct(String title, String[] authors, int publicationYear, int amountOfPages, double price, boolean hardCover) {
        super(title, authors, PUBLISHER, publicationYear, amountOfPages, price, hardCover);

    }
}
