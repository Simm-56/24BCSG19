import java.util.Scanner;
class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two floating numbers: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		System.out.println("Addition of " +num1+ " and " +num2+ " is " +sum);
	}
}	