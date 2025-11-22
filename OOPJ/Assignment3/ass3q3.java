import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix1 = new int[2][3];
		int[][] matrix2 = new int[2][3];
		int[][] sum_matrix = new int[2][3];
		System.out.println("Enter the 1st matrices: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the 2nd matrices: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("The sum of the matrices is: ");
		for (int[] arr : sum_matrix) {
			for (int x : arr) {
				System.out.print(x+ " ");
			}
			System.out.println();
		}
				
	}
}
		
				
		
		