package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student_Management_System.Student> students = new ArrayList<>();
        boolean running = true;

        while (running) {

            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1- Add Student");
            System.out.println("2- Show All Students");
            System.out.println("3- Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter student grade: ");
                    double grade = scanner.nextDouble();

                    Student_Management_System.Student student = new Student_Management_System.Student(name, id, grade);
                    students.add(student);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student_Management_System.Student s : students) {
                            s.displayInfo();
                        }
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        scanner.close();
    }
}

