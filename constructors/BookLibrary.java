class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibrary(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookLibrary {
    double fileSize;

    EBook(String i, String t, String a, double f) {
        super(i, t, a);
        fileSize = f;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook e = new EBook("123-456", "Java eBook", "James", 5.5);
        e.display();
        System.out.println("Author: " + e.getAuthor());
    }
}
