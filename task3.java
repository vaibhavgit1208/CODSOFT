1) 
Create a Student class to represent individual students. Include attributes such as name, roll
number, grade, and any other relevant details.


public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    // Other relevant details can be added here

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Other methods as needed
}



2) Implement a StudentManagementSystem class to manage the collection of students. Include
methods to add a student, remove a student, search for a student, and display all students


public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        // Adding students
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");
        system.addStudent(student1);
        system.addStudent(student2);

        // Display all students
        system.displayAllStudents();

        // Search for a student by roll number
        int rollNumberToSearch = 101;
        Student foundStudent = system.searchStudentByRollNumber(rollNumberToSearch);
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.getName());
        } else {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }

        // Remove a student
        system.removeStudent(student2);
        system.displayAllStudents();
    }
}



3)



import java.util.Scanner;

public class StudentManagementSystemUI {
    private static StudentManagementSystem system = new StudentManagementSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student roll number:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student grade:");
        String grade = scanner.nextLine();

        Student student = new Student(name, rollNumber, grade);
        system.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent() {
        System.out.println("Enter roll number of student to remove:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student studentToRemove = system.searchStudentByRollNumber(rollNumber);
        if (studentToRemove != null) {
            system.removeStudent(studentToRemove);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    private static void searchStudent() {
        System.out.println("Enter roll number of student to search:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student foundStudent = system.searchStudentByRollNumber(rollNumber);
        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName() +
                    ", Roll Number: " + foundStudent.getRollNumber() +
                    ", Grade: " + foundStudent.getGrade());
            // Display other details as needed
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    private static void displayAllStudents() {
        system.displayAllStudents();
    }
}


4)

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileManager {
    private static final String FILE_NAME = "students.txt";

    public static void writeStudentsToFile(List<Student> students) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(students);
            System.out.println("Student data saved to file: " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error writing student data to file: " + e.getMessage());
        }
    }

    public static List<Student> readStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Object obj = inputStream.readObject();
            if (obj instanceof List) {
                students = (List<Student>) obj;
                System.out.println("Student data loaded from file: " + FILE_NAME);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading student data from file: " + e.getMessage());
        }
        return students;
    }
}

import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        // Load students from file at initialization
        students = StudentFileManager.readStudentsFromFile();
    }

    // Other methods as before...

    public void saveStudentsToFile() {
        StudentFileManager.writeStudentsToFile(students);
    }
}


5)


import java.util.Scanner;

public class StudentManagementSystemUI {
    private static StudentManagementSystem system = new StudentManagementSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    system.saveStudentsToFile(); // Save data before exiting
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student roll number:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student grade:");
        String grade = scanner.nextLine();

        Student student = new Student(name, rollNumber, grade);
        system.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void editStudent() {
        System.out.println("Enter roll number of student to edit:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student studentToEdit = system.searchStudentByRollNumber(rollNumber);
        if (studentToEdit != null) {
            System.out.println("Editing student: " + studentToEdit.getName());
            System.out.println("Enter new name (leave blank to keep current):");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                studentToEdit.setName(newName);
            }
            System.out.println("Enter new grade (leave blank to keep current):");
            String newGrade = scanner.nextLine();
            if (!newGrade.isEmpty()) {
                studentToEdit.setGrade(newGrade);
            }
            System.out.println("Student details updated.");
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    private static void searchStudent() {
        System.out.println("Enter roll number of student to search:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student foundStudent = system.searchStudentByRollNumber(rollNumber);
        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName() +
                    ", Roll Number: " + foundStudent.getRollNumber() +
                    ", Grade: " + foundStudent.getGrade());
            // Display other details as needed
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }

    private static void displayAllStudents() {
        system.displayAllStudents();
    }
}



6)

private static void addStudent() {
    System.out.println("Enter student name:");
    String name = validateStringInput("Name");
    System.out.println("Enter student roll number:");
    int rollNumber = validateIntInput("Roll Number");
    scanner.nextLine(); // Consume newline
    System.out.println("Enter student grade:");
    String grade = validateStringInput("Grade");

    Student student = new Student(name, rollNumber, grade);
    system.addStudent(student);
    System.out.println("Student added successfully.");
}

private static void editStudent() {
    System.out.println("Enter roll number of student to edit:");
    int rollNumber = validateIntInput("Roll Number");

    Student studentToEdit = system.searchStudentByRollNumber(rollNumber);
    if (studentToEdit != null) {
        System.out.println("Editing student: " + studentToEdit.getName());
        System.out.println("Enter new name (leave blank to keep current):");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            studentToEdit.setName(newName);
        }
        System.out.println("Enter new grade (leave blank to keep current):");
        String newGrade = scanner.nextLine();
        if (!newGrade.isEmpty()) {
            studentToEdit.setGrade(newGrade);
        }
        System.out.println("Student details updated.");
    } else {
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
}

private static String validateStringInput(String fieldName) {
    String input;
    do {
        System.out.print(fieldName + ": ");
        input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println(fieldName + " cannot be empty. Please try again.");
        }
    } while (input.isEmpty());
    return input;
}

private static int validateIntInput(String fieldName) {
    int input;
    while (true) {
        try {
            System.out.print(fieldName + ": ");
            input = Integer.parseInt(scanner.nextLine().trim());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Invalid " + fieldName + ". Please enter a valid number.");
        }
    }
    return input;
}


