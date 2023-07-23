import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStaff action = new ManageStaff();
        do {
            System.out.println("Enter Your choice");
            System.out.println("1. Add Staff");
            System.out.println("2. Update staff");
            System.out.println("3. Delete staff");
            System.out.println("4. Display staff");
            System.out.println("5. Money of staff");
            System.out.println("6. Average of staff in company");
            System.out.println("7.StaffFullTime have money less than Average of staff");
            System.out.println("8. Sum of money for StaffPartTime");
            System.out.println("9. Sort StaffFullTime about money");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    action.addStaff();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    action.display();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;

                case 0: System.exit(0);
            }

        } while (true);
    }
}
