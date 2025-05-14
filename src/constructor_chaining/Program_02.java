// Problem: Create a BankAccount class with:
// Constructor to initialize only account holder name.
// Constructor to initialize account holder name and initial balance.
// Constructor to initialize account holder name, balance, and account number.
// Also add a method displayDetails().
// USE CONSTRUCTOR CHAINING.

package constructor_chaining;

import java.util.Scanner;

public class Program_02 {
    String accHolderName;
    int accBalance;
    int accNumber;

    // Constructor 1: Only Name
    Program_02(String accHolderName) {
        this(accHolderName, 0, 0); // calls 3rd constructor
    }

    // Constructor 2: Name and Balance
    Program_02(String accHolderName, int accBalance) {
        this(accHolderName, accBalance, 0); // calls 3rd constructor
    }

    // Constructor 3: Name, Balance, and Account Number
    Program_02(String accHolderName, int accBalance, int accNumber) {
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
        this.accNumber = accNumber;
    }

    void displayDetails() {
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Balance: " + accBalance);
        System.out.println("Account Number: " + accNumber);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Account Balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter Your Account Number: ");
        int number = sc.nextInt();

        System.out.println("========= Using Constructor 1 =========");
        Program_02 obj1 = new Program_02(name);
        obj1.displayDetails();

        System.out.println("========= Using Constructor 2 =========");
        Program_02 obj2 = new Program_02(name, balance);
        obj2.displayDetails();

        System.out.println("========= Using Constructor 3 =========");
        Program_02 obj3 = new Program_02(name, balance, number);
        obj3.displayDetails();
    }
}

