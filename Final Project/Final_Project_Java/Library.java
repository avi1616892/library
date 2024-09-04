package Final_Project_Java;
import java.util.ArrayList;

public class Library {
    private ArrayList<Shelf> shelves;
    private ArrayList<Reader> readers;

    public Library() {
        shelves = new ArrayList<>(3); // 3 shelves
        readers = new ArrayList<>();
        // Initialize each shelf with 2 books
        for (int i = 0; i < 3; i++) {
            Shelf shelf = new Shelf();
            shelf.addBook(new Book("Author1", "Book1", 100));
            shelf.addBook(new Book("Author2", "Book2", 200));
            shelves.add(shelf);
        }
    }

    public boolean isTherePlaceForNewBook() {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull()) {
                return true;
            }
        }
        return false;
    }

    public void addNewBook(Book book) {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull()) {
                shelf.addBook(book);
                return;
            }
        }
        System.out.println("No space available in the library to add a new book.");
    }

    public void deleteBook(String title) {
        for (Shelf shelf : shelves) {
            ArrayList<Book> books = shelf.getBooks();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equals(title)) {
                    books.remove(i);
                    System.out.println("Book titled '" + title + "' removed from the library.");
                    return;
                }
            }
        }
        System.out.println("Book titled '" + title + "' not found in the library.");
    }

    public void registerReader(int id, String name) {
        readers.add(new Reader(id, name));
        System.out.println("Reader '" + name + "' registered.");
    }

    public void removeReader(String name) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getName().equals(name)) {
                readers.remove(i);
                System.out.println("Reader '" + name + "' removed.");
                return;
            }
        }
        System.out.println("Reader '" + name + "' not found.");
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getAuthor().equals(author)) {
                    System.out.println("Title: " + book.getTitle());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No books found by author '" + author + "'.");
        }
    }
}

