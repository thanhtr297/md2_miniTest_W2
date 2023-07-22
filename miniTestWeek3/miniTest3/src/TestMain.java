import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStaff action = new ManageStaff();
        do {
            System.out.println("Enter Your choice");
            System.out.println("1.");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    action.display();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0: System.exit(0);
            }

        } while (true);
    }
}
