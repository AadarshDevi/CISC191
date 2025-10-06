## Basic Info
- Author: Aadarsh Devi
- Submission Date: Oct 5, 2025
- Assignment: Week 5/6 Lab

## Code
#### Book.java
```java
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

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("\tTitle: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPublisher: " + publisher);
        System.out.println("\tPublication Date: " + publicationDate);
    }
}
```

#### Encyclopedia.java
```java
public class Encyclopedia extends Book {
    private final String edition;
    private final int pageCount;

    public Encyclopedia(String title, String author, String publisher, String publicationDate, String edition, int pageCount) {
        super(title, author, publisher, publicationDate);
        this.edition = edition;
        this.pageCount = pageCount;
    }

    public String getEdition() {
        return edition;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\tEdition: " + edition);
        System.out.println("\tNumber of Pages: " + pageCount);
    }
}
```

#### BooksMain.java
```java
public class BooksMain {
    public static void main(String[] args) {

        // declaring variables for Book obj
        String title;
        String author;
        String publisher;
        String publicationDate;
        String edition = null;
        int pageCount = 0;

        // user input
        Scanner scanner = new Scanner(System.in);

        // input for Book obj
        System.out.print("Enter Book Title: ");
        title = scanner.nextLine();

        System.out.print("Enter Author: ");
        author = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        publisher = scanner.nextLine();

        System.out.print("Enter Publication Date: ");
        publicationDate = scanner.nextLine();

        // if edition is blank, obj is Book or else Encyclopedia
        System.out.print("Enter Edition: ");
        edition = scanner.nextLine();

        if (!edition.isBlank()) {

            boolean validInput = false;
            do {
                try {
                    System.out.print("Enter Number of Pages: ");
                    pageCount = scanner.nextInt();

                    if (pageCount < 0) throw new IOException();
                    validInput = true;

                } catch (InputMismatchException e) {
                    scanner.next();
                    System.err.println("Page count must be a number.");

                } catch (IOException e) {
                    scanner.next();
                    System.err.println("Page count is less than 0.");
                }
            } while (!validInput);
        }

        System.out.println();

        // create and print Book obj
        if (edition.isBlank()) {
            Book book = new Book(title, author, publisher, publicationDate);
            book.printInfo();
        } else {
            Encyclopedia encyclopedia = new Encyclopedia(title, author, publisher, publicationDate, edition, pageCount);
            encyclopedia.printInfo();
        }
    }
}
```

## What to Submit
1. The flowchart of my thought process: [Draw.io file](overriding_methods_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](overriding_methods_flowchart_image.png)
3. What were your challenges in performing the lab:
   - 1. Trying to stop the program from going into an infinite loop.
   - `\n` was left in buffer when doing `scanner.nextInt()`
   - 2. Trying to get input from user and at the same time trying to use the same input to create a Book or Encyclopedia obj
5. Code for the assignment:
   - [Book.java](Book.java)
   - [Encyclopedia.java](Encyclopedia.java)
   - [BooksMain.java](BooksMain.java)
7. Video explaining code: TODO: [Video Explanation](link)
