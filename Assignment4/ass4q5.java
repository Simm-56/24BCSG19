/*	Q5. Write a program to declare a class employee with data members id, name, department, salary. Add a method getData(), putData() to accept and
        display the details of n employees. Define a Main class to create the objects of employee class and perform basic operations.
*/

import java.util.Scanner;

class Employee {
	String name, department;
	int id;
	double salary;
	
	public void putData () {
		System.out.println("\nEmployee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
		
	}
	
	public void getData(Scanner sc) {
		
		System.out.print("Enter the employee's id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the employee's name: ");
		name = sc.nextLine();
		System.out.print("Enter the employee's department: ");
		department = sc.nextLine();
		System.out.print("Enter the employee's salary: ");
		salary = sc.nextDouble();
	}
}

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employee's: ");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];
		for(int i=0;i<n;i++) {
			
			System.out.println("\nEnter the details of employee " +(i+1)+ " :");
			emp[i] = new Employee();
			emp[i].getData(sc);
		}
		System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].putData();
        }
	}
}

	
	
		
		
	