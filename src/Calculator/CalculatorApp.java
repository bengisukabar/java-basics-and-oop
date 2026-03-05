package Calculator;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n=== CALCULATOR ===");
            System.out.println("1- Add");
            System.out.println("2- Subtract");
            System.out.println("3- Multiply");
            System.out.println("4- Divide");
            System.out.println("5- Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            Calculator calculator = new Calculator(num1, num2);

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add());
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract());
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply());
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide());
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}

