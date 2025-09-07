class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
}

abstract class LibraryMember {
    int memberId;
    String name;

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(Book[] books);
}

interface Notifyable {
    void sendNotification(String message);
}

class StudentMember extends LibraryMember implements Notifyable {
    private int limit = 3;

    StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    void borrowBook(Book[] books) {
        if (books.length <= limit) {
            System.out.println("StudentMember " + name + " borrowed " + books.length + " books");
        } else {
            System.out.println("StudentMember " + name + " cannot borrow more than " + limit + " books");
        }
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class FacultyMember extends LibraryMember implements Notifyable {
    private int limit = 5;

    FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    void borrowBook(Book[] books) {
        if (books.length <= limit) {
            System.out.println("FacultyMember " + name + " borrowed " + books.length + " books");
        } else {
            System.out.println("FacultyMember " + name + " cannot borrow more than " + limit + " books");
        }
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class  LibraryManagementSystem{
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java Basics", "Author A");
        Book b2 = new Book(2, "Python Fundamentals", "Author B");
        Book b3 = new Book(3, "Data Structures", "Author C");
        Book b4 = new Book(4, "Algorithms", "Author D");

        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        Book[] studentBooks = {b1, b2};
        Book[] facultyBooks = {b1, b2, b3, b4};

        student.borrowBook(studentBooks);
        faculty.borrowBook(facultyBooks);

        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
