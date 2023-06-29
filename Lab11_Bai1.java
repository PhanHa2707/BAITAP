import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11_Bai1 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phần tử thứ %d: ",i+1);
            int value = sc.nextInt();
            list.add(value);
        }
        int temp = list.get(0);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(list.get(i)> list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.print("List sau khi sắp xếp: ");
        for(Integer i: list){
            System.out.print(i + "  ");
        }
    }
}

