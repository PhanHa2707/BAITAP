import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> lstSinhVien= new ArrayList<>();

    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        studentManager.testList();
        studentManager.updateList();
        studentManager.deleteList();
    }
    public void testList(){
        lstSinhVien.add("Tuấn");
        lstSinhVien.add("Hà");
        lstSinhVien.add("Linh");
        System.out.println("ArrayList Student");
        System.out.print("\t"+ lstSinhVien+ "\n");
    }
    public void updateList(){
        lstSinhVien.set(1,"Hông Hà");
        System.out.println("UpdateList Student");
        System.out.print("\t"+ lstSinhVien +"\n");

    }
    public void deleteList(){
        lstSinhVien.remove(0);
        System.out.println("DeleteList Student");
        System.out.print("\t"+ lstSinhVien+ "\n");
    }
}