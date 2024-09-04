package Final_Project_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. For adding a book - Press 1.");
            System.out.println("2. For deleting a book - Press 2.");
            System.out.println("3. For registering a new reader - Press 3.");
            System.out.println("4. For removing a reader - Press 4.");
            System.out.println("5. For searching books by author – Press 5.");
            System.out.println("6. For exit – Press 6.");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                System.out.println("Enter author:");
                String author = scanner.nextLine();
                System.out.println("Enter title:");
                String title = scanner.nextLine();
                System.out.println("Enter number of pages:");
                int pages = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                Book newBook = new Book(author, title, pages);
                library.addNewBook(newBook);
            } else if (choice == 2) {
                System.out.println("Enter the title of the book to delete:");
                String title = scanner.nextLine();
                library.deleteBook(title);
            } else if (choice == 3) {
                System.out.println("Enter reader ID:");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                System.out.println("Enter reader name:");
                String name = scanner.nextLine();
                library.registerReader(id, name);
            } else if (choice == 4) {
                System.out.println("Enter reader name to remove:");
                String name = scanner.nextLine();
                library.removeReader(name);
            } else if (choice == 5) {
                System.out.println("Enter author name to search for:");
                String author = scanner.nextLine();
                library.searchByAuthor(author);
            } else if (choice == 6) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
