import java.io.*;
import java.util.Scanner;

public class NotesManager {

    static final String FILE_NAME = "notes.txt";

    // Add a note
    public static void addNote() {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);

            System.out.print("Enter your note: ");
            String note = sc.nextLine();

            writer.write(note + "\n");
            writer.close();

            System.out.println("✅ Note Saved Successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // View all notes
    public static void viewNotes() {

        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                System.out.println("No notes found.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            System.out.println("\n------ Your Notes ------");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Notes Manager =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addNote();
                    break;

                case 2:
                    viewNotes();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}