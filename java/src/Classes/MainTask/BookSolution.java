package Classes.MainTask;

/*
Main Task
Для выполнения достаточно выбрать одно задание.
Создать классы, спецификации которых приведены ниже.
Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе,
обладающем информацией, должно быть объявлено несколько конструкторов.
5. Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */


public class BookSolution {
    public static void main(String[] args) {

        createListOfAllBooks();

        Book.getBooks().forEach(System.out::println);

        booksWrittenBy("Кинг С.");

        booksPublishedBy("Эксмо");

        booksPublishedAfter(2012);
    }

    public static void createListOfAllBooks() {
        new BookOfPublisherAct("Будет кровь", new String[]{"Кинг С."}, 2021, 544, 726.00, true);
        new Book("Изучаем Java", new String[]{"Сьерра К.", "Бейтс Б."}, "Эксмо", 2012, 720, 1284.12, true);
        new Book("Гробница", new String[]{"Вилсон Ф"},"Эксмо", 2010, 432,247, false);
        new BookOfPublisherAct("Оно", new String[]{"Кинг С."}, 2020, 1184, 1073.00, true);

        //Книга book1 добавлена для демонстрации работы дополнительного конструктора и сеттеров.
        Book book1 = new Book("День праха", new String[]{"Гранже Ж.-К."}, "Азбука", 2020);
        book1.setAmountOfPages(384);
        book1.setPrice(511.55);
        book1.setHardCover(true);
    }

    public static void booksWrittenBy(String author) {
        System.out.println("\nКниги, которые написал " + author + " :\n");
        for (Book element: Book.getBooks()) {
            for (int i = 0; i < element.getAuthors().length; i++)
            {
                if(element.getAuthors()[i].equals(author)) {
                    System.out.println(element);
                }
            }
        }
    }

    public static void booksPublishedBy(String publisher) {
        System.out.println("\nКниги выпущенные издательсвом " + publisher + " :\n");
        for (Book element: Book.getBooks()) {
            if(element.getPublisher().contains(publisher)) {
                System.out.println(element);
            }
        }
    }

    public static void booksPublishedAfter(int year) {
        System.out.println("\nКниги выпущенные после " + year + " года :\n");
        for (Book element: Book.getBooks()) {
            if(element.getPublicationYear() > (year)) {
                System.out.println(element);
            }
        }
    }
}
