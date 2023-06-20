import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        List<String> str1 = new ArrayList<>();

        str.add("hiếu");
        str.add("Hung");
        str.add("Hăng");
        System.out.println("Mảng Ban đâu:"+"\t"+str);
        str1.add("Con Vẹt ");
        str1.add("Con Gà");
        str1.add("Con Rùa");
        System.out.println("Mảng chell ALL:"+"\t"+str1);
        str.addAll(str1);
        System.out.println("Mảng sau khi chèn:"+"\t"+str);



    }
}