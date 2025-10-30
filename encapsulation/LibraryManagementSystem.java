import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailability(boolean avail) { this.isAvailable = avail; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

    public abstract int getLoanDuration(); // days
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class BookItem extends LibraryItem implements Reservable {
    public BookItem(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public boolean reserveItem(String userId) {
        if (isAvailable()) { setAvailability(false); return true; }
        return false;
    }

    @Override
    public boolean checkAvailability() { return isAvailable(); }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 3; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        BookItem b = new BookItem("B101", "Java OOPs", "Author A");
        items.add(b);
        items.add(new Magazine("M201", "Tech Monthly", "Editor X"));
        items.add(new DVD("D301", "Learn Java", "Producer Y"));

        for (LibraryItem itm : items) {
            itm.getItemDetails();
            System.out.println("Loan days: " + itm.getLoanDuration());
            System.out.println();
        }

        // Reservation demonstration
        if (b.reserveItem("user123")) System.out.println("Book reserved for user123");
        else System.out.println("Could not reserve");
    }
}

