//  Q1. Write a program to print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average. Define another driver class to demonstrate the basic operation.

import java.util.Scanner;
class Average {
    public void calculateAverage(double num1, double num2, double num3) {
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + avg);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = sc.nextDouble();
        Average avg = new Average();
        avg.calculateAverage(n1, n2, n3);
    }
}