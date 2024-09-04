package Final_Project_Java;
import java.util.ArrayList;

public class Shelf {
    private ArrayList<Book> books;
    private boolean isShelfFull;

    public Shelf() {
        books = new ArrayList<>(5); // Initialize the list with a maximum capacity of 5
        isShelfFull = false;
    }

    public void addBook(Book book) {
        if (books.size() < 5) {
            books.add(book);
            updateShelfStatus();
            System.out.println("Book added to the shelf.");
        } else {
            isShelfFull = true;
            System.out.println("No more space on the shelf. Can't add more books.");
        }
    }

    public void replaceBooks(int index1, int index2) {
        if (index1 < 1 || index1 > 5 || index2 < 1 || index2 > 5) {
            System.out.println("Invalid indexes. Please enter values between 1 and 5.");
            return;
        }

        index1--;
        index2--;

        if (index1 < books.size() && index2 < books.size()) {
            Book temp = books.get(index1);
            books.set(index1, books.get(index2));
            books.set(index2, temp);
            System.out.println("Books swapped.");
        } else {
            System.out.println("One of the locations is empty. Can't swap.");
        }
    }

    private void updateShelfStatus() {
        isShelfFull = books.size() == 5;
    }

    public boolean isShelfFull() {
        return isShelfFull;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
