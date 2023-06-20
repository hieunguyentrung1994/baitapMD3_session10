import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> newList = new ArrayList<>();

        list.add("sample");
        list.add("error");
        list.add("equals");

        System.out.println("list cu: " + "\t" + list);
        Collections.reverse(list);
        System.out.println("list cu dung reverse: " + "\t" + list);
        for (int i = list.size() - 1; i >= 0 ; i--) {
            newList.add(list.get(i));
        }
        System.out.println("list moi dung fori: " + "\t" + newList);

    }
}