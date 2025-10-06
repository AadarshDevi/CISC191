package week_5_6.overriding_methods;

public class Book {
    private final String title;
    private final String author;
    private final String publisher;
    private final String publicationDate;

    public Book(String title, String author, String publisher, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("\tTitle: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPublisher: " + publisher);
        System.out.println("\tPublication Date: " + publicationDate);
    }
}
