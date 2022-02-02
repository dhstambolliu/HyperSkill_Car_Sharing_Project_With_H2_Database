package carsharing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {
            DatabaseHandler.DB_URL += args[1];
        } else {
            DatabaseHandler.DB_URL += "theDatabase";
        }

        DatabaseHandler.createTables();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            printStartingMenu();
            int selection = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (selection) {

                case 1:
                    new Manager().startManaging();
                    break;

                case 2:
                    new Customer().startInteraction();
                    break;

                case 3:
                    System.out.println("Enter the customer name:");
                    String customerName = scanner.nextLine();
                    DatabaseHandler.createNewCustomer(customerName);
                    break;

                case 0:
                    return;
            }
        }
    }

    static void printStartingMenu() {

        System.out.println("1. Log in as a manager\n" +
                "2. Log in as a customer\n" +
                "3. Create a customer\n" +
                "0. Exit"
        );
    }
}
