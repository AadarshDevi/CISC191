package week_5_6.overriding_methods;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        String title;
        String author;
        String publisher;
        String publicationDate;
        String edition = null;
        int pageCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        title = scanner.nextLine();

        System.out.print("Enter Author: ");
        author = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        publisher = scanner.nextLine();

        System.out.print("Enter Publication Date: ");
        publicationDate = scanner.nextLine();

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

        if (edition.isBlank()) {
            Book book = new Book(title, author, publisher, publicationDate);
            book.printInfo();
        } else {
            Encyclopedia encyclopedia = new Encyclopedia(title, author, publisher, publicationDate, edition, pageCount);
            encyclopedia.printInfo();
        }
    }
}
