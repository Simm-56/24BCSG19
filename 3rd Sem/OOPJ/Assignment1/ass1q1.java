import java.util.Scanner;
class Test
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.print("Enter your branch:");
		String branch = sc.nextLine();
		System.out.print("Enter your rollno:");
		int rollno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your collegename:");
		String college = sc.nextLine();
		System.out.print("NAME : " +name+ "\nBRANCH : " +branch+"\nROLL NO : " +rollno+ "\nCOLLEGE NAME : " +college);
		
	} 
}