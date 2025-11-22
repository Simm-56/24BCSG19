import java.util.Scanner;
class Test {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of OOPJ, DAA, MATHS:");
	double oopj_marks = sc.nextDouble();
	double daa_marks = sc.nextDouble();
	double maths_marks = sc.nextDouble();
	double average = (oopj_marks+daa_marks+maths_marks)/3;
	System.out.println("The average mark is : " +average);
	}
}
	