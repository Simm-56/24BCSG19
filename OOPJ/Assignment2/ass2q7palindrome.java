import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, reversed = 0;
		while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        if (temp == reversed) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}