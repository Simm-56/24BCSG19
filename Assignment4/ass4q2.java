// Q2. Write a program to create a class named 'Student' with members 'name', 'roll_no', ‘branch’. Declare two methods to input the student details and display the details of the student. Create a driver class to test the functionalities of the above class.

import java.util.Scanner;
class Student {
    String name;
    int roll_no;
    String branch;
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
        name = sc.nextLine();
		System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
        sc.nextLine();
		System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }
    public void displayDetails() {
        System.out.println("   Student Details   ");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Branch : " + branch);
    }
}
class Main {
    public static void main(String[] args) {   
        Student s1 = new Student();
        s1.inputDetails();
        s1.displayDetails();
    }
}