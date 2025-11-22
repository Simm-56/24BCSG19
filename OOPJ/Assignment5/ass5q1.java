/* Q1. Write a program that creates a class Account that have members accountNumber, customerName. Account has constructor to initialize its members
        and method display() to show the result. Create a child class SavingsAccount that is derived from Account class. SavingsAccount have members
        minBalance and savingBalance. Use show() to display its details. Then create another child class AccountDetails from SavingsAccount class have
        members deposit, withdraw and a method show1() to show its details. Child classes have constructors of their own. Create a Main class that
        creates a record of customer and display all its details.
*/

class Account {
    int accountNumber;
    String customerName;
    Account(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
    }
}
class SavingsAccount extends Account {
    double minBalance;
    double savingBalance;
    SavingsAccount(int accountNumber, String customerName, double minBalance, double savingBalance) {
        super(accountNumber, customerName); 
        this.minBalance = minBalance;
        this.savingBalance = savingBalance;
    }
    void show() {
        display(); 
        System.out.println("Minimum Balance: " + minBalance);
        System.out.println("Saving Balance: " + savingBalance);
    }
}
class AccountDetails extends SavingsAccount {
    double deposit;
    double withdraw;
    AccountDetails(int accountNumber, String customerName, double minBalance, double savingBalance, double deposit, double withdraw) {
        super(accountNumber, customerName, minBalance, savingBalance);
        this.deposit = deposit;
        this.withdraw = withdraw;
    }
    void show1() {
        show(); 
        System.out.println("Amount Deposited: " + deposit);
        System.out.println("Amount Withdrawn: " + withdraw);
        double finalBalance = savingBalance + deposit - withdraw;
        System.out.println("Final Balance: " + finalBalance);
    }
}
class Main {
    public static void main(String[] args) {
                AccountDetails acc = new AccountDetails(12345, "Simran Sahoo", 1000.0, 5000.0, 2000.0, 1500.0);
				acc.show1();
    }
}
