
import java.util.ArrayList;
public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User Added Successfully!");
    }

    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No Users Found.");
            return;
        }

        for (User user : users) {
            user.displayUser();
        }
    }

    public void issueBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book is Already Available.");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    public void searchBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                book.displayBook();
                return;
            }
        }
        System.out.println("Book Not Found.");
    }
}