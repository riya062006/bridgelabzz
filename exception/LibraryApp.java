import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String msg){ super(msg); } }
class InvalidReturnException extends Exception { public InvalidReturnException(String msg){ super(msg); } }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String msg){ super(msg); } }

class Library {
    private Map<String, Boolean> books = new HashMap<>();
    private Map<String, Integer> userBooks = new HashMap<>();

    public Library() {
        books.put("Java", true);
        books.put("DSA", true);
    }

    public void borrowBook(String user, String book)
            throws BookNotAvailableException, UserLimitExceededException {
        if (!books.getOrDefault(book, false))
            throw new BookNotAvailableException(book + " is not available.");
        if (userBooks.getOrDefault(user, 0) >= 5)
            throw new UserLimitExceededException(user + " reached borrowing limit.");
        books.put(book, false);
        userBooks.put(user, userBooks.getOrDefault(user, 0) + 1);
        System.out.println(user + " borrowed " + book);
    }

    public void returnBook(String user, String book)
            throws InvalidReturnException {
        if (books.getOrDefault(book, true))
            throw new InvalidReturnException(book + " was not borrowed.");
        books.put(book, true);
        System.out.println(user + " returned " + book);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("Riya", "Java");
            lib.returnBook("Riya", "Python");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
