import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in OOPJ, MATHS, DAA, OS: ");
        double OOPJ = sc.nextDouble();
        double MATHS = sc.nextDouble();
		double DAA = sc.nextDouble();
        double OS = sc.nextDouble();
        double average = (OOPJ + MATHS + DAA + OS) / 4;
        String grade;
		if (average >= 90) {
            grade = "O";
        } else if (average >= 80) {
            grade = "E";
        } else if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
		System.out.println("Average of the student is " +average);
        System.out.println("The students grade is " +grade);
    }
}