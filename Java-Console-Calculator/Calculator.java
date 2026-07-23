import java.util.Scanner;

public class Calculator {

    // Method for Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for Division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice = 0;
        System.out.println("=================================");
        System.out.println("      JAVA CONSOLE CALCULATOR");
        System.out.println("=================================");

        do {

            System.out.println("\nChoose an Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Thank you for using the Calculator!");
                break;
            }

            if (option < 1 || option > 5) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (option) {

                case 1:
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    result = divide(num1, num2);

                    if (!Double.isNaN(result)) {
                        System.out.println("Result = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nCalculator Closed.");
        scanner.close();
    }
}