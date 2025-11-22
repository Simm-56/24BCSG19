// Q3.	Declare a class Complex with member real and imaginary part. Define a method initialise() to input the two complex numbers, show() to display the complex number and add() to add the two complex numbers. Declare another class to illustrate the operations of the Complex class.

import java.util.Scanner;
class Complex {
    double real;
    double imaginary;
    public void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        imaginary = sc.nextDouble();
    }
    public void show() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
    public Complex add(Complex c2) {
        Complex result = new Complex();
        result.real = this.real + c2.real;
        result.imaginary = this.imaginary + c2.imaginary;
        return result;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number:");
        Complex c1 = new Complex();
        c1.initialise();
        System.out.println("Enter second complex number:");
        Complex c2 = new Complex();
        c2.initialise();
        System.out.print("First complex number: ");
        c1.show();
        System.out.print("Second complex number: ");
        c2.show();
        Complex sum = c1.add(c2);
        System.out.print("Sum of the two complex numbers: ");
        sum.show();
    }
}
