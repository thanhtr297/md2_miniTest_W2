import java.util.ArrayList;
import java.util.List;

public class ManageStaff {
    List<Staff> listStaff = new ArrayList<>();
    List<Address> listAddress = new ArrayList<>();
    public ManageStaff(){
        listAddress.add(new Address("Hanoi","Dong anh","Dong hoi","15"));
        listAddress.add(new Address("Nam Dinh","Nam Truc","Nam Tien","16"));
        listStaff.add(new StaffFulltime(1,"a",18,95,"nam@gmail.com",listAddress.get(0),1000000,100000,4750000));
        listStaff.add(new StaffParttime(1,"a",18,95,"nam@gmail.com",listAddress.get(1),150));
    }
    public void display(){
        for (Staff value:listStaff) {
            System.out.println(value.toString());
        }
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
