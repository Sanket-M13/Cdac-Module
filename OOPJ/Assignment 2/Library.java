class LibBook {
    int bookId;
    String title;
    String author;

    LibBook(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    int getBookId() {
        return bookId;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    void setBookId(int bookId) {
        this.bookId = bookId;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    String libraryName;
    static int totalBooks = 0;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(LibBook b) {
        totalBooks++;
    }

    static void displayTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }

    public static void main(String[] args) {
        Library lib = new Library("City Library");
        LibBook b1 = new LibBook(101, "Java Programming", "James Gosling");
        LibBook b2 = new LibBook(102, "Effective Java", "Joshua Bloch");
        lib.addBook(b1);
        lib.addBook(b2);
        Library.displayTotalBooks();
    }
}
