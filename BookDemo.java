import java.util.Scanner;

// Base class
class Publisher {
    protected String publisherName;

    void readPublisher(Scanner sc) {
        System.out.print("Enter publisher name: ");
        publisherName = sc.nextLine();
    }

    void printPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

// Derived class from Publisher
class Book extends Publisher {
    protected String title;
    protected String author;

    void readBook(Scanner sc) {
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter author name: ");
        author = sc.nextLine();
        readPublisher(sc);
    }

    void printBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        printPublisher();
    }
}

// Derived class from Book
class Literature extends Book {
    void readLiterature(Scanner sc) {
        System.out.println("--- Enter Literature Book Details ---");
        readBook(sc);
    }

    void printLiterature() {
        System.out.println("--- Literature Book Details ---");
        printBook();
    }
}

// Derived class from Book
class Fiction extends Book {
    void readFiction(Scanner sc) {
        System.out.println("--- Enter Fiction Book Details ---");
        readBook(sc);
    }

    void printFiction() {
        System.out.println("--- Fiction Book Details ---");
        printBook();
    }
}

// Main class
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Literature books? ");
        int litCount = sc.nextInt();
        sc.nextLine(); // consume newline

        Literature[] litBooks = new Literature[litCount];
        for (int i = 0; i < litCount; i++) {
            litBooks[i] = new Literature();
            litBooks[i].readLiterature(sc);
            System.out.println();
        }

        System.out.print("How many Fiction books? ");
        int ficCount = sc.nextInt();
        sc.nextLine(); // consume newline

        Fiction[] ficBooks = new Fiction[ficCount];
        for (int i = 0; i < ficCount; i++) {
            ficBooks[i] = new Fiction();
            ficBooks[i].readFiction(sc);
            System.out.println();
        }

        // Choose category to display
        System.out.print("Enter 1 to display Literature, 2 to display Fiction: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println();
        if (choice == 1) {
            for (int i = 0; i < litCount; i++) {
                litBooks[i].printLiterature();
                System.out.println();
            }
        } else if (choice == 2) {
            for (int i = 0; i < ficCount; i++) {
                ficBooks[i].printFiction();
                System.out.println();
            }
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}