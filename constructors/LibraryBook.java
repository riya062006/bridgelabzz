class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String t, String a, double p, boolean available) {
        title = t;
        author = a;
        price = p;
        isAvailable = available;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available right now.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java Programming", "James Gosling", 550, true);
        b.display();
        b.borrowBook();
        b.display();
    }
}
