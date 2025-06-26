import java.util.Scanner;

class Author {
    String name;
    int numberOfBooksWritten;

    public Author(String name, int numberOfBooksWritten) {
        this.name = name;
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

    public void displayBio() {
        System.out.println("Author: " + name + ", Books Written: " + numberOfBooksWritten);
    }
}

class Book {
    String title;
    Author author;
    int publicationYear;
    boolean isAvailable;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author.name + ", Year: " + publicationYear + ", Available: " + isAvailable);
    }
}

class Library {
    Book[] books;
    int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.title);
        } else {
            System.out.println("Library is full!");
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title) && books[i].checkAvailability()) {
                books[i].isAvailable = false;
                System.out.println("You borrowed: " + books[i].title);
                return;
            }
        }
        System.out.println("Book not available or not found.");
    }

    public void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                books[i].isAvailable = true;
                System.out.println("You returned: " + books[i].title);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                books[i].displayDetails();
                found = true;
            }
        }
        if (!found) System.out.println("No book found with that title.");
    }

    public void searchByAuthor(String authorName) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].author.name.equalsIgnoreCase(authorName)) {
                books[i].displayDetails();
                found = true;
            }
        }
        if (!found) System.out.println("No books found by that author.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Author author1 = new Author("George Orwell", 6);
        Author author2 = new Author("J.K. Rowling", 10);

        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("Harry Potter", author2, 1997);
        Book book3 = new Book("Animal Farm", author1, 1945);

        Library library = new Library(10);

        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook("1984");
        library.returnBook("1984");
        library.searchByAuthor("George Orwell");
        library.addBook(book3);
        library.searchByTitle("Animal Farm");

        System.out.println("\nAuthor Bios:");
        author1.displayBio();
        author2.displayBio();
    }
}
