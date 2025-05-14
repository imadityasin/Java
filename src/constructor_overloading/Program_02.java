// Problem: Create a BankAccount class with:
// Constructor to initialize only account holder name.
// Constructor to initialize account holder name and initial balance.
// Constructor to initialize account holder name, balance, and account number.
// Also add a method displayDetails().

package constructor_overloading;

import java.util.Scanner;

public class Program_02 {
    String AccHolderName;
    int Accbalancee;
    int AccNumber;

    //Constructor 1: Only Name
    Program_02(String AccHolderName) {
        this.AccHolderName=AccHolderName;
    }

    //Constructor 2: Only Name and Account Balance
    Program_02(String AccHolderName, int Accbalance) {
        this.AccHolderName=AccHolderName;
        this.Accbalancee=Accbalance;
    }

    //Constructor 3: Only Name and Account Balance and AccNumber. 
    Program_02(String AccHolderName, int Accbalance, int AccNumber) {
        this.AccHolderName=AccHolderName;
        this.Accbalancee=Accbalance;
        this.AccNumber=AccNumber;
    }

    void displayDetails() {
        System.out.println("Account Holder Name: " + AccHolderName);
        System.out.println("Balance: " + Accbalancee);
        System.out.println("Account Number: " + AccNumber);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Your Account Holder Name: ");
        String Name=sc.nextLine();
        System.out.println("Enter Your Account Balance: ");
        int Accbalance=sc.nextInt();
        System.out.println("Enter Your Account Number: ");
        int AccNumber=sc.nextInt();


        System.out.println("========================================");
        
        Program_02 yup1=new Program_02(Name);
        yup1.displayDetails();

        System.out.println("========================================");

        Program_02 yup2=new Program_02(Name, Accbalance);
        yup2.displayDetails();

        System.out.println("========================================");

        Program_02 yup3=new Program_02(Name, Accbalance, AccNumber);
        yup3.displayDetails();
    }
}