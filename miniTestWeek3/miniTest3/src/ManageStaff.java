import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStaff {
    private final Scanner sc = new Scanner(System.in);
    List<Staff> listStaff = new ArrayList<>();
    List<Address> listAddress = new ArrayList<>();
    public ManageStaff(){
        listAddress.add(new Address("Hanoi","Dong anh","Dong hoi","15"));
        listAddress.add(new Address("Nam Dinh","Nam Truc","Nam Tien","16"));
        listStaff.add(new StaffFullTime(1,"a",18,95,"nam@gmail.com",listAddress.get(0),1000000,100000,4750000));
        listStaff.add(new StaffPartTime(2,"a",18,95,"nam@gmail.com",listAddress.get(1),150));
    }
    public void display(){
        if(checkEmpty()) {
            for (Staff value:listStaff) {
                System.out.println(value.toString());
            }
        } else {
            emptyStaff();
        }
    }
    public void addStaff(){
        int ID = listStaff.size() +1;
        System.out.println("Enter your staff you want to add");
        System.out.println("1. StaffFullTime");
        System.out.println("2.staffPartTime");
        int pick = Integer.parseInt(sc.nextLine());
        if (pick == 1){
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("Enter age");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Enter number phone");
            int phone = Integer.parseInt(sc.nextLine());
            System.out.println("Enter email");
            String email = sc.nextLine();
            System.out.println("Enter province");
            String province =  sc.nextLine();
            System.out.println("Enter commune");
            String district =  sc.nextLine();
            System.out.println("district");
            String commune =  sc.nextLine();
            System.out.println("numberApartment");
            String numberApartment = sc.nextLine();
            Address addressFullTime = new Address(province,district,commune,numberApartment);
            System.out.println("Enter bonus");
            double bonusFullTime = Double.parseDouble(sc.nextLine());
            System.out.println("Enter forfeit");
            double forfeitFullTime = Double.parseDouble(sc.nextLine());
            System.out.println("Enter hardSalary");
            double SalaryFullTime = Double.parseDouble(sc.nextLine());
            Staff staffFullTime = new StaffFullTime(ID, name, age,
                    phone, email, addressFullTime,bonusFullTime,forfeitFullTime,SalaryFullTime);
            listStaff.add(staffFullTime);

        } if (pick == 2) {
            System.out.println("Enter name staff");
            String name = sc.nextLine();
            System.out.println("Enter age");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Enter number phone");
            int phone = Integer.parseInt(sc.nextLine());
            System.out.println("Enter email");
            String email = sc.nextLine();
            System.out.println("Enter province");
            String province =  sc.nextLine();
            System.out.println("Enter commune");
            String district =  sc.nextLine();
            System.out.println("district");
            String commune =  sc.nextLine();
            System.out.println("numberApartment");
            String numberApartment = sc.nextLine();
            Address addressPartTime = new Address(province,district,commune,numberApartment);
            System.out.println("Enter number of working Hours");
            int workingHours = Integer.parseInt(sc.nextLine());
            Staff staffPartTime = new StaffPartTime(ID,name,age,phone,email,addressPartTime,workingHours);
            listStaff.add(staffPartTime);
        }
        System.out.println("List Staff hava " + ID + " Staff.");
        display();
    }
    public void updateStaff(){
    if (checkEmpty()){
        System.out.println("Enter ID");
    } else {
        emptyStaff();
    }
    }
    public boolean checkEmpty(){
        return listStaff.size() > 0;
    }
    public void emptyStaff(){
        System.out.println("----------ListStaff is empty---------");
    }
    // phương thức tính lương thực lãnh fulltime
    //Lương thực lĩnh (fulltime)  = lương cứng + (số tiền thưởng – số tiền phạt).
    //phương thức tính lương thực lãnh parttime
    //Lương  lĩnh (  parttime) = số giờ làm việc * 100000
    //--------------------------



    // tính trung bình lương nhân viên cả công ty
    //-----------------------------

    // phương thức liệt kê danh sách nhân viên toàn thời gian
    // có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
    //-----------------------------------------

    //phương thức tính số lương phải trả cho tất cả các nhân viên bán thời gian
    //----------------------------------------


    //phương thức sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
    //------------------------------
}
