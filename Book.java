import java.util.Scanner;

public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public Book() {
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Student{isbn=" + this.isbn + ", bookName=" + this.bookName + ", author=" + this.author + ", publisher=" + this.publisher + ", price=" + this.price + '}';
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập isbn:");
        this.isbn = s.nextLine();
        System.out.print("Nhập bookName:");
        this.bookName = s.nextLine();
        System.out.print("Nhập author:");
        this.author = s.nextLine();
        System.out.print("Nhập publisher:");
        this.publisher = s.nextLine();
        System.out.print("Nhập price:");
        this.price = Float.parseFloat(s.nextLine());
    }


    public Book(String isbn, String bookName, String author, String publisher, float price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
