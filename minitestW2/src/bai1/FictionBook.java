package bai1;

public class FictionBook extends Book{
    private String category;

    public FictionBook() {
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +"bookCode=" + getBookCode() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", author='" + getAuthor() + '\'' +
                "category='" + category + '\'' +
                '}';
    }
}
