package Final_Project_Java;
import java.util.ArrayList;

public class Reader {
    private int id;
    private String name;
    private ArrayList<String> booksRead;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        this.booksRead = new ArrayList<>();
    }

    public void readBook(String bookTitle) {
        booksRead.add(bookTitle);
        System.out.println(name + " read the book titled '" + bookTitle + "'.");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBooksRead() {
        return booksRead;
    }
}
