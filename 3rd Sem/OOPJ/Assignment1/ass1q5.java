import java.util.Scanner;
class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
            System.out.println("The entered number is even.");
		}else{
			System.out.println("The entered number is odd.");
		}
	}
}
				