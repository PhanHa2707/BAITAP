import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab11_Bai2 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phần tử thứ %d: ",i+1);
            String value = sc.nextLine();
            list.add(value);
        }
        System.out.print("List sau khi sắp xếp: ");
        for(String i: list){
            System.out.print(i + "  ");
        }
    }
}
