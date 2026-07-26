import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" STUDENT RECORD MANAGEMENT ");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    searchStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }

    // Add Student
    static void addStudent() {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Marks : ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, marks));

        System.out.println("Student Added Successfully!");
    }

    // View Students
    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\n------ Student Records ------");

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Update Student
    static void updateStudent() {

        System.out.print("Enter Student ID to Update : ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.getId() == id) {

                sc.nextLine();

                System.out.print("Enter New Name : ");
                String name = sc.nextLine();

                System.out.print("Enter New Marks : ");
                double marks = sc.nextDouble();

                s.setName(name);
                s.setMarks(marks);

                System.out.println("Record Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter Student ID to Delete : ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.getId() == id) {

                students.remove(s);

                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Search Student
    static void searchStudent() {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.getId() == id) {

                System.out.println("\nStudent Found");
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}