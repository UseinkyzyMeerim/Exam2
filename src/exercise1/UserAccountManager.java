package exercise1;

import java.util.Scanner;

public class UserAccountManager {
    public static void main(String[] args) {
        BasicUserAccount basicUserAccount = new BasicUserAccount();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        do {
            System.out.println("Choose an action:");
            System.out.println("1. Create account");
            System.out.println("2. Update account");
            System.out.println("3. Delete account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicUserAccount.createAccount();
                    break;
                case 2:
                    basicUserAccount.updateAccount();
                    break;
                case 3:
                    basicUserAccount.deleteAccount();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    }

