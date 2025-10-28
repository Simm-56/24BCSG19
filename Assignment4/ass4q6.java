/* Q6. Define a class Student having the attribute sic, name, branch and cgpa. Write 2 methods to accept and display the student details. Read the details of 5 students using an array of Student class object. Display the student details who have secured the highest CGPA. */
import java.util.Scanner;
class Student {
    String sic;
    String name;
    String branch;
    double cgpa;

    void getData(Scanner sc) {
        System.out.print("Enter Student SIC: ");
        sic = sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter Student CGPA: ");
        cgpa = sc.nextDouble();
		sc.nextLine();
    }
    void display() {
        System.out.println("\nSIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
    }
    double getCgpa() {
        return cgpa;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student(); 
            students[i].getData(sc);
        }
        System.out.println("\n--- Student Details ---");
        Student highestCgpa = students[0];

        for (Student student : students) {
            student.display();
            if (student.getCgpa() > highestCgpa.getCgpa()) {
                highestCgpa = student;
            }
        }
        System.out.println("\n--- Student with Highest CGPA ---");
        highestCgpa.display();

        sc.close();
    }
}
