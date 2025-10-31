import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books)
            b.displayBook();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");

        Library l1 = new Library("City Library");
        Library l2 = new Library("School Library");

        l1.addBook(b1);
        l2.addBook(b2);
        l2.addBook(b1); // same book shared

        l1.showBooks();
        l2.showBooks();
    }
}
