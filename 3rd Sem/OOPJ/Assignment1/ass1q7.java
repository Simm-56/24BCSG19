import java.util.Scanner;
class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time value in seconds: ");
		int time = sc.nextInt();
		int hours = time/3600;
		int remaining_sec = time % 3600;
		int minutes = remaining_sec/60;
		int seconds = remaining_sec % 60;
		System.out.println(hours+ " Hour: " +minutes+ " minute: " +seconds+ " seconds");
	}
}
		