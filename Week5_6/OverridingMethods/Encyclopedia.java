package week_5_6.overriding_methods;

public class Encyclopedia extends Book {
    private final String edition;
    private final int pageCount;

    public Encyclopedia(String title, String author, String publisher, String publicationDate, String edition, int pageCount) {
        super(title, author, publisher, publicationDate);
        this.edition = edition;
        this.pageCount = pageCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\tEdition: " + edition);
        System.out.println("\tNumber of Pages: " + pageCount);
    }
}
