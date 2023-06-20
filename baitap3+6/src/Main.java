import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);


        System.out.println("truoc khi thay doi:"+"\t"+ list);
        Collections.sort(list , Comparator.reverseOrder());
        System.out.println("sau khi thay đổi giảm dần:" +"\t"+list);
        Collections.sort(list , Comparator.naturalOrder());
        System.out.println("sau khi thay đổi tăng  dần:" +"\t"+list);



    }
}