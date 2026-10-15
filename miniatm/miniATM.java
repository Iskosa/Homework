package miniatm;

import java.util.Scanner;

public class miniATM {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int PIN = 1234;
        int attempts = 3;
        double balance = 0.0;

        while (attempts > 0) {
            System.out.println("Enter PIN: ");
            int attempt = reader.nextInt();

            if (attempt == PIN) {
                System.out.println("Access granted!");
                break;
            } else if (attempt != PIN) {
                attempts--;
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts <= 0) {
                System.out.println("Card blocked.");
            }
        }
        if (attempts <= 0) {
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = reader.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = reader.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Updated balance: $" + balance);
                    } else {
                        System.out.println("Deposit amount must be greater than zero.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = reader.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Amount must be greater than zero.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds! Cannot withdraw more than current balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Updated balance: $" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please choose 1, 2, 3 or 4.");
            }
        } while (choice != 4);
    }
}