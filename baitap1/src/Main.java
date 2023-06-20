import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Integer> listNumber(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int number = (int) Math.floor(Math.random() * 10);
            list.add(number);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = listNumber();

        System.out.println("danh sách số nguyên bất ky=" + list );

        System.out.println("sô nguyên to nhất trên dãy số nguyên này là" + Collections.max(list));


    }

}