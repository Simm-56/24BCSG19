import java.util.Scanner;
class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int reversed = 0;
		while(num != 0){
			reversed = (reversed * 10) + (num % 10);
			num = num / 10;
		}
		System.out.println("The reversed number is "+reversed);
	}
}