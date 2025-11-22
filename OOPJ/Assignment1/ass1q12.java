import java.util.Scanner;
class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num > 0){
			System.out.println("The entered number is positive.");
		}else if(num < 0){
			System.out.println("The entered number is negative.");
		}else {
			System.out.println("The entered number is zero.");
		}
	}
}