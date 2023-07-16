package bai1;

public class ManageBook {
    // cho san doi tuong de ko phai nhap 10 lan
    // FictionBook

    Book book1 = new FictionBook(1,"Naruto",35000,"Kishimoto Masashi","Viễn tưởng 1");
    Book book2 = new FictionBook(2,"Conan",25000,"Gosho Aoyama", "Viễn tưởng 2");
    Book book3 = new FictionBook(3,"Bố già", 45000,"Mario Puzo","Viễn tưởng 1");
    Book book4 = new FictionBook(4,"7 Viên ngọc rồng",55000,"Paulo Coelho","Viễn tưởng 1");
    Book book5 = new FictionBook(5,"Đắc Nhân Tâm",85000,"Dale Carnegie","Viễn tưởng 2");
  // programmingBook
    Book book6 = new ProgrammingBook(6,"DataConstructions",75000,"Ali baba","Java","Spring");
    Book book7 = new ProgrammingBook(7,"Giáo Trình Kỹ Thuật Lập Trình C Căn Bản & Nâng Cao",55000,"Nhiều tác giả","Java","Spring");
    Book book8 = new ProgrammingBook(8,
            "Kỹ Thuật Lập Trình Cơ Sở Với Ngôn Ngữ C/C ++ – Dương Thăng Long & Trương Tiến Tùng",
            125000,"Nhiều tác giả","C++","BoostLib");
    Book book9 = new ProgrammingBook(9,"Programming Pearls",145000,"Jon Bentley","Java","Pearls");
    Book book10 = new ProgrammingBook(10,"Learning Python",95000,"Mark Lutz","Python","full-stack");

    Book[] listBook = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};

    public void displayListBook(){
        System.out.println("List Book: ");
        for (Book value:listBook) {
            System.out.println(value);
        }
    }

    public void TotalOfMoney() {
        int total = 0;
        for (Book value: listBook) {
            total += value.getPrice();
        }
        System.out.println("Total money of listBook is: " + total);
    }
    public void countCategory() {
        int count = 0;
        for (int i = 0; i < listBook.length-5; i++) {
            if (listBook[i] instanceof FictionBook){
                FictionBook fictionBook = (FictionBook) listBook[i];
                String category = fictionBook.getCategory();
                if (((FictionBook) listBook[i]).getCategory().equals("Viễn tưởng 1")){
                    count++;
                }
            }
        }
        System.out.println("Number of Fiction book have category Viễn tưởng 1 is: " + count);
    }

    public  void countOfBook(){
        int count = 0;
        for (Book value:listBook) {
            if (value.getPrice() < 90000) {
                count++;
            }
        }
        System.out.println("Number of book have price < 90000 is: " + count);
    }

//    --------------------------------


}
