import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        lib.displayBooks();
    }
}
