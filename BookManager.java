import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private List<Book> list = new ArrayList<>();
    private int n;
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        n=s.nextInt();
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.input();
            list.add(book);
        }
    }
    public void display(){
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).toString());
        }
    }
    public void sort(){
        float temp = list.get(0).getPrice();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (list.get(i).getPrice() < list.get(j).getPrice() ){
                    temp = list.get(i).getPrice();
                    list.get(i).setPrice(list.get(j).getPrice());
                    list.get(j).setPrice(temp);
                }
            }
        }
    }
    public static void main(String[] args) {

        BookManager bm = new BookManager();
        bm.input();
        bm.sort();
        bm.display();
    }
}
