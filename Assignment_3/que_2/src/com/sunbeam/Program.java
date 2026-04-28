package com.sunbeam;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 
        int accountNumber;
        int beginningBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;
        int newBalance;

        System.out.print("Enter account number (or -1 to quit): ");
        accountNumber = input.nextInt();


        while (accountNumber != -1) {
            System.out.print("Enter balance at the beginning of the month: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter total of all items charged this month: ");
            totalCharges = input.nextInt();

            System.out.print("Enter total of all credits applied this month: ");
            totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            creditLimit = input.nextInt();


            newBalance = beginningBalance + totalCharges - totalCredits;


            System.out.printf("New balance for account %d is: %d%n", accountNumber, newBalance);

 
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.print("\nEnter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }

        System.out.println("Exiting Credit Limit Calculator.");
        input.close();
    }
}
