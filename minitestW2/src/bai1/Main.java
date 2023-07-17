package bai1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageBook action = new ManageBook();
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Display all Books");
            System.out.println("2. Total price of books");
            System.out.println("3. Number of Fiction book have category: Viễn tưởng 1");
            System.out.println("4. Number of  book have price < 90000");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    action.displayListBook();
                    break;
                case 2:

                    action.TotalOfMoney();
                    break;
                case 3:
                    action.countCategory();
                    break;
                case 4:
                    action.countOfBook();
            }
        } while (choice != 0);
    }
}
