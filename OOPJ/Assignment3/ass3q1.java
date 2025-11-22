import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
		for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("The element " +key+ " was found at index " + i);
                return;
            }
        }
        System.out.println("The element " +key+ " was not found ");
    }
}